#ifndef  PALINDROME_PERMUTATION
#define PALINDROME_PERMUTATION
#include <string>

static int const NUMCHARS = 26;

bool isPalindromePermutation(std::string str);
int getCharIndex(char c);
int* getCharFreq(std::string str);
bool checkOddCount(int* freqTable);


#endif 

