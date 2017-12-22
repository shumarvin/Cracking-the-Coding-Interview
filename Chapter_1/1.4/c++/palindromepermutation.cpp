#include "palindromepermutation.h"

#include <string>
#include <array>

/*
A string is a permutation of a palindrome if no more than one of it's
chars has a odd count.
Algorithm:
1. Build char frequency table for the string. Right now, have
it be case-insensitive and ignore non-letters
2. Go through char frequency table and make sure only one char
count is odd
*/
bool isPalindromePermutation(std::string str)
{
	std::array<int, NUMCHARS> freqTable = getCharFreq(str);
	return checkOddCount(freqTable);
}
//gets the char's hashtable index
//returns -1 if not letter
int getCharIndex(char c)
{
	int asciiA = 'a';
	int asciiZ = 'z';
	int asciiChar = tolower(c);
	if (asciiA <= asciiChar && asciiChar <= asciiZ)
		return asciiChar - asciiA;
	return -1;
}
//builds hashtable of char freq's in str
std::array<int,NUMCHARS> getCharFreq(std::string str)
{
	std::array<int, NUMCHARS> freqTable = { };
	for (int i = 0; i < str.length(); i++)
	{
		int index = getCharIndex(str[i]);
		if (index != -1)
			freqTable[index]++;
	}
	return freqTable;
}
/*
Goes through hashtable and checks to see if there's only
at most one odd char frequency count.
@return true if at most one, false otherwise
*/
bool checkOddCount(std::array<int, NUMCHARS> freqTable)
{
	int oddCount = 0;
	for (int currentCount : freqTable)
	{
		if (currentCount % 2 == 1) //check for odd count
		{
			oddCount += 1;
			if (oddCount > 1)
				return false;
		}
	}
	return true;
}
