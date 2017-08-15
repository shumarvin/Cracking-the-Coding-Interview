#include "is_unique.hpp"
#include <string>

//number of ASCII characters
const int SIZE = 256;

/**
Determines if a word has all unique characters
Algorithm: For each character in the word, check in character array 
if it has already been seen before. If it has, return false. Else,
put a 1 in that spot and keep going.
**/
bool isUnique(std::string word)
{	
	//ASCII character array
	int table[SIZE] = {0};

	for(int i = 0; i < word.length(); i++)
	{
		//get ascii value
		int ascii = int(word[i]);
		//lookup in table
		if(table[ascii] == 1)
			return false;
		//set value if it hasn't already been seen
		table[ascii] = 1;
	}
	return true;
}



