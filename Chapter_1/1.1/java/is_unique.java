import java.util.String;

/**
Problem 1.1 from Cracking the Coding Interview
Class to determine if a string has all unique characters
**/
public class UniqueLetterDeterminer
{
	private String word;

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
	public bool isUnique()
	{
		return false;
	}
}