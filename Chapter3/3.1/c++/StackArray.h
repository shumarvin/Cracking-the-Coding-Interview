#ifndef STACKARRAY_H
#define STACKARRAY_H

#include <exception>

/*
	Class that implements 3 stacks using one array.
	Each stack will be a fixed size. Any pushes
	to a full stack will throw an exception.
	This implementation will be a stack of
	ints for simplicity. However, it can
	be generalized for any type.
*/
class StackArray
{
	int* stackArray;               //the array containing all the stacks 
	int* stackHeads;               //array containing the head index of each stack
	int stackSize;                 //the size of each stack

public:
	const int NUMSTACKS = 3;

	/**
		Constructor

		@param size the size of each stack
	*/
	StackArray(int size);

	/**
	Pushes a number onto the specified stack

	@param num the int to push onto the stack
	@param stackNum the specific stack to push num onto
	@throws FullStackException if specified stack is
	already full.
	*/
	void push(int num, int numStack);
	int pop(int numStack);


	//getters
	int* getStackArray() { return stackArray; }
	int* getStackHeads() { return stackHeads; }
};

class FullStackException : public std::exception
{
public:
	virtual const char* what() const throw()
	{
		return "Error! That stack is already full.";
	}
};

class EmptyStackException : public std::exception
{
public:
	virtual const char* what() const throw()
	{
		return "Error! That stack is empty. ";
	}
};

#endif
