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
void StackArray::push(int num, int numstack)
{

}