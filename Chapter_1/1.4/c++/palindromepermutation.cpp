#include "palindromepermutation.h"

#include <string>
#include <array>

bool isPalindromePermutation(std::string str)
{
	std::array<int, NUMCHARS> freqTable = getCharFreq(str);
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
bool checkOddCount(int* freqTable)
{
	return false;
}
