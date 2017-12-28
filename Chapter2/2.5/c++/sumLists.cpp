#include "linkedList.h"
#include "node.h"


/*
Helper method to add each digit together
Assumes list2.size() <= list1.size()
*/
void doSumListsHelper(LinkedList<int>* sum, LinkedList<int>* list1, LinkedList<int>* list2)
{
	//get carrybit ready
	int carrybit = 0;

	//since list2 is smaller, add all of its digits first
	for (int i = 0; i < list2->getSize(); i++)
	{
		int num1 = list1->getNode(i)->data;
		int num2 = list2->getNode(i)->data;

		//if you need to carry
		if (num1 + num2 + carrybit >= 10)
		{
			//subtract 10 from resulting sum and set carrybit to 1
			sum->insertNode(new Node<int>{num1 + num2 + carrybit - 10, nullptr});
			carrybit = 1;
		}
		else
		{
			//add sum together and reset carrybit
			sum->insertNode(new Node<int>{ num1 + num2 + carrybit, nullptr });
			carrybit = 0;
		}
	}

	//go through and include rest of list1's digits
	for (int i = list2->getSize(); i < list1->getSize(); i++)
	{
		int num = list1->getNode(i)->data;

		//make sure to include carrybit if necessary
		if (carrybit == 1)
		{
			//insert 0 since only case is if digit is 9
			//don't reset carry
			if (num + carrybit >= 10)
				sum->insertNode(new Node<int>{ 0, nullptr });
			else
			{
				sum->insertNode(new Node<int>{ num + carrybit, nullptr });
				carrybit = 0;
			}
		}
		else
			sum->insertNode(new Node<int>{ num, nullptr });
	}

	//add extra 1 if necessary
	if(carrybit == 1)
		sum->insertNode(new Node<int>{ 1, nullptr });

}

/*
Sums the two lists together, assuming the digits are
stored in reverse order
*/
LinkedList<int>* doSumLists(LinkedList<int>* list1, LinkedList<int>* list2)
{
	LinkedList<int>* sum = new LinkedList<int>();
	if (list1->getSize() >= list2->getSize())
		doSumListsHelper(sum, list1, list2);
	else
		doSumListsHelper(sum, list2, list1);
	return sum;
}

/*
Helper method to pad list with specified number of zeroes
*/
void padZeroes(LinkedList<int>* list, int numZeroes)
{
	for (int i = 0; i < numZeroes; i++)
		list->insertHead(new Node<int>{ 0, nullptr });
}

/*
Recursive helper method for doSumListNonReverse
WIll recurse through both lists until it ends up at
the ones place. It will then add the ones place, and
recurse back up. Assumes list1 and list2 are the same size.
@return carrybit the carry bit from the previous digit
place's calculation
*/

int doSumListsNonReverseHelper(LinkedList<int>* sum, Node<int>* node1, Node<int>* node2)
{
	int carrybit = 0;
	int num1 = node1->data;
	int num2 = node2->data;

	//base case: one's place
	if (node1->next == nullptr)
	{
		//make sure to set carrybit if necessary
		if (num1 + num2 >= 10)
		{
			sum->insertNode(new Node<int>{ num1 + num2 -10, nullptr });
			carrybit = 1;
		}
		else
			sum->insertNode(new Node<int>{ num1 + num2, nullptr });
	}
	else
	{
		//recursive step
		carrybit = doSumListsNonReverseHelper(sum, node1->next, node2->next);

		//once recursion returns, add current node's digits and set carrybit if necessary
		if (num1 + num2 + carrybit >= 10)
		{
			sum->insertHead(new Node<int>{ num1 + num2 + carrybit - 10, nullptr });
			carrybit = 1;
		}
		else
		{
			sum->insertHead(new Node<int>{ num1 + num2 + carrybit, nullptr });
			carrybit = 0;
		}
	}
	return carrybit;
}

/*
Method to add lists together if lists are
not in reverse order. Unlike the reverse
method, this method will be recursive,
as you need to go to the last digit place,
add them, and then return it back
@return sum the sum in regular order
*/
LinkedList<int>* doSumListsNonReverse(LinkedList<int>* list1, LinkedList<int>* list2)
{
	LinkedList<int>* sum = new LinkedList<int>();

	/*
	Whichever list is smaller, pad it with
	zeroes in the front, then add the two
	lists together
	*/
	if (list1->getSize() >= list2->getSize())
		padZeroes(list2, list1->getSize() - list2->getSize());
	else
		padZeroes(list1, list2->getSize() - list1->getSize());

	//do recursion
	int finalCarryBit = doSumListsNonReverseHelper(sum, list1->getHead(), list2->getHead());

	//add extra 1 if necessary
	if (finalCarryBit == 1)
		sum->insertHead(new Node<int>{ 1, nullptr });
	return sum;
}
