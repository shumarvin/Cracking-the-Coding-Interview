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
@return sum the sum in reversed order
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
