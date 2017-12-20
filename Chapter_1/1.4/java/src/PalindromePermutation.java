public class PalindromePermutation
{
    public final static int NUMCHARS = 26;                   //case-insensitive, so only have size of 26
    private String str;

    //constructor
    public PalindromePermutation(String s)
    {
        str = s;
    }
    /*
        A string is a permutation of a palindrome if no more than one of it's
        chars has a odd count.
        Algorithm:
        1. Build char frequency table for the string. Right now, have
        it be case-insensitive and ignore non-letters
        2. Go through char frequency table and make sure only one char
        count is odd
     */
    public boolean isPalindromePermutation()
    {
        //build char freq table
        int[] charFreq = getCharFreq();
        return checkOddCount(charFreq);
    }

    //builds hashtable of char freq's in str
    public int[] getCharFreq()
    {
        int[] charFreq = new int[NUMCHARS];
        for(char c: str.toCharArray())
        {
            int charIndex = getCharIndex(c);
            if(charIndex != -1)
                charFreq[charIndex]++;
        }
        return charFreq;
    }

    //gets the char's hashtable index
    //returns -1 if not letter
    public int getCharIndex(char c)
    {
        int asciiA = (int )'a';
        int asciiZ = (int)'z';
        int asciiChar = (int) Character.toLowerCase(c);
        if(asciiA <= asciiChar && asciiChar <= asciiZ)
            return asciiChar - asciiA;
        return -1;
    }

    /*
        Goes through hashtable and checks to see if there's only
        at most one odd char frequency count.
        @return true if at most one, false otherwise
     */
    public boolean checkOddCount(int[] freqTable)
    {
        int oddCount = 0;
        for(int currentCount: freqTable)
        {
            if(currentCount % 2 == 1) //check for odd count
            {
                oddCount += 1;
                if(oddCount > 1)
                    return false;
            }
        }
        return true;
    }
}
