#ifndef  PALINDROME_PERMUTATION
#define PALINDROME_PERMUTATION
#include <string>
#include<array>

static int const NUMCHARS = 26;

bool isPalindromePermutation(std::string str);
int getCharIndex(char c);
std::array<int, NUMCHARS> getCharFreq(std::string str);
bool checkOddCount(std::array<int, NUMCHARS> freqTable);


#endif 

