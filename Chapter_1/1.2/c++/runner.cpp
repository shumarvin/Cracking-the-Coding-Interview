#include "is_perm.hpp"
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
			//get individual words
			std::vector<std::string> words = split(line);
			if(isPerm(words.at(0),words.at(1)) == true)
				output<<"true\n";
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