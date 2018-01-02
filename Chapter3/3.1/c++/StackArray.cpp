#include "StackArray.h"

/**
Constructor

@param size the size of each stack
*/
StackArray::StackArray(int size)
{
	stackSize = size;
	stackArray = new int[stackSize * NUMSTACKS];
	stackHeads = new int[NUMSTACKS];
	//each stack is empty, so mark head indexes
	//as -1 to indicate so
	for (int i = 0; i < NUMSTACKS; i++)
		stackHeads[i] = -1;
}

/**
	Pushes a number onto the specified stack

	@param num the int to push onto the stack
	@param stackNum the specific stack to push num onto
	@throws FullStackException if specified stack is
	already full.
*/
void StackArray::push(int num, int numStack)
{
	//get head index of requested stack
	int stackIndex = stackHeads[numStack - 1];

	//make sure stack isn't already full
	if (stackIndex == numStack * stackSize - 1)
		throw FullStackException();

	/*
	Push onto stack.
	If stack is empty, insert num at first
	spot on stack and update stackHeads
	accordingly
	*/
	if (stackIndex == -1)
	{
		/*
		Index for first spot for stack 1 is 0, 2nd stack is 5,
		3rd spot is 10, so formula is:
		(numStack-1) * stackSize
		*/
		stackIndex = (numStack - 1) * stackSize;
		stackArray[stackIndex] = num;
		stackHeads[numStack - 1] = stackIndex;
	}
	//else, insert at one above current head index
	//and update stack head index
	else
	{
		stackArray[stackIndex + 1] = num;
		stackHeads[numStack - 1]++;
	}
}

int StackArray::pop(int numStack)
{
	//get head index of requested stack
	int stackIndex = stackHeads[numStack - 1];
	return -2;
}