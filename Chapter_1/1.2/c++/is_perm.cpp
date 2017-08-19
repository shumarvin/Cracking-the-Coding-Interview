#include "is_perm.hpp"
#include <string>
#include <vector>
#include <sstream>
#include <iterator>
#include <algorithm>

/**
Checks to see if word1 and word2 are permutations of each other
Algorithm: sort the strings and see if they match. If they do,
they are permuations of each other
**/
bool isPerm(std::string word1, std::string word2)
{
	//If different lengths, cannot be permutations of each other
	if(word1.length() != word2.length())
		return false;

	//sort the strings
	std::sort(word1.begin(), word1.end());
	std::sort(word2.begin(), word2.end());
	
	//compare
	if(word1.compare(word2) == 0)
		return true;
	return false;
}	

/**
Helper method for testing
Splits string by space and returns vector of all words in string
**/
std::vector<std::string> split(std::string str)
{
	std::istringstream buf(str);
	std::istream_iterator<std::string> beg(buf), end;
	std::vector<std::string> words(beg, end);

	return words;
}



