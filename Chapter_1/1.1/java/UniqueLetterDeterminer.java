import java.lang.String;

/*
Problem 1.1 from Cracking the Coding Interview
Class to determine if a string has all unique characters
Assume ASCII characters
*/
public class UniqueLetterDeterminer
{
	public static final int TABLE_SIZE = 127;
	private String word;
	private int[] table = new int[TABLE_SIZE];                //Array with each index correspoding to each char's ASCII value    

	//default constructor
	public UniqueLetterDeterminer()
	{
		word = "";
	}
	//constructor
	public UniqueLetterDeterminer(String aword)
	{
		word = aword;
	}
	//getter
	public String getWord()
	{
		return word;
	}
	//setter
	public void setWord(String aword)
	{
		word = aword;
	}
	//method to determine if a string has all unique characters
	public boolean isUnique()
	{
		for(int i = 0; i < word.length(); i++)
		{
			//get current char and convert to ASCII value
			char currentChar = word.charAt(i);
			int ascii = (int) currentChar;
			//if table already has it, then string is not unique
			if(table[ascii] == 1)
				return false;
			//if not, then update table
			else
				table[ascii] = 1;
		}
		return true;
	}
	//reset table to default value
	public void resetTable()
	{
		for(int i = 0; i < table.length; i++)
			table[i] = 0;
	}
}