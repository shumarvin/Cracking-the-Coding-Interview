#include "palindromepermutation.h"

#include <string>

bool isPalindromePermutation(std::string str)
{
	int* freqTable = getCharFreq(str);
	return false;
}
int getCharIndex(char c)
{
	int asciiA = 'a';
	int asciiZ = 'z';
	int asciiChar = tolower(c);
	if (asciiA <= asciiChar && asciiChar <= asciiZ)
		return asciiChar - asciiA;
	return -1;
}
int* getCharFreq(std::string str)
{
	int * freqTable = new int[NUMCHARS];
	for (int i = 0; i < str.length(); i++)
	{

	}
	return freqTable;
}
bool checkOddCount(int* freqTable)
{
	return false;
}
