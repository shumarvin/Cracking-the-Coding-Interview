import java.lang.String;
import java.util.Arrays;

public class PermutationChecker
{
	private String word1;
	private String word2;

	//default constructor
	public PermutationChecker()
	{
		word1 = "";
		word2 = "";
	}
	//constructor
	public PermutationChecker(String w1, String w2)
	{
		word1 = w1;
		word2 = w2;
	}
	//getters
	public String getWord1()
	{
		return word1;
	}
	public String getWord2()
	{
		return word2;
	}
	//setters
	public void setWord1(String w1)
	{
		word1 = w1;
	}
	public void setWord2(String w2)
	{
		word2 = w2;
	}

	/*
	Checks to see if word1 and word2 are permutations of each other
	Algorithm: sort the strings and see if they match. If they do,
	they are permuations of each other.
	*/
	public boolean isPermutation()
	{
		//if two words aren't the same length, they can't be permutations
		if(word1.length() != word2.length())
			return false;

		//sort the strings
		String sort1 = sortString(word1);
		String sort2 = sortString(word2);

		//compare
		return sort1.equals(sort2);
	}

	//helper method to sort strings
	private String sortString(String word)
	{
		//convert to char array, sort, and return
		char[] chars = word.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}
}