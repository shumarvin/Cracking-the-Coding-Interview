#include "URLify.hpp"

/**
* Replaces all spaces in arr with '%20' and does it in place
* Algorithm:
* 1. Find final length of arr by counting number of spaces,
* multiplying that by two (since a space is one char while '%20' is 3
* chars), and adding that to the true length. This will be the starting
* index to copy from
* 2. Go backwards starting at the last char. If it isn't a space, copy
* that char into its new place using the final length index. If it is,
* write '%20'.
*/
char* doURLify(char arr[], int trueLength)
{
	//find final length
	int finalIndexLength = trueLength + countSpaces(arr, trueLength) * 2;

	//add null terminator
	if (trueLength < sizeof(arr))
		arr[trueLength] = '\0';

	//go backwards
	for (int i = trueLength - 1; i >= 0; i--)
	{
		//if it's a space, replace it with '%20'
		if (arr[i] == ' ')
		{
			arr[finalIndexLength - 3] = '%';
			arr[finalIndexLength - 2] = '2';
			arr[finalIndexLength - 1] = '0';
			finalIndexLength -= 3;
		}
		//else copy the char
		else
		{
			arr[finalIndexLength - 1] = arr[i];
			finalIndexLength--;
		}
	}
	return arr;
}

//method to count number of spaces in arr
int countSpaces(char arr[], int length)
{
	int count = 0;

	for (int i = 0; i < length; i++)
	{
		if (arr[i] == ' ')
			count++;
	}
	return count;
}


