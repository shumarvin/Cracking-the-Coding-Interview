#include "is_unique.hpp"
#include <iostream>
#include <fstream>
#include <string>

const char *INPUT_FILE = "tests/test.txt";
const char *OUTPUT_FILE = "tests/output.txt";

int main()
{
	std::ifstream input(INPUT_FILE);
	std::ofstream output(OUTPUT_FILE);
	std::string line;

	if(input.is_open() && output.is_open())
	{
		//loop through input
		while(std::getline(input,line))
		{
			//if string is unique, write true to output file
			if(isUnique(line))
				output<<"true\n";
			//else write false
			else
				output<<"false\n";
		}
	}
	else
		std::cout<<"Unable to open file\n";
	input.close();
	output.close();

	return 0;
}