#include "node.h"

/*
Public interface for recursive version. Actual logic is in
private method
*/
template <typename T>
Node<T> returnKthToLast(Node<T>* head, int k)
{
	int count = 0;
	return returnKthToLastHelper(head, k, count);
}

/*
Recursive version where you don't know the size
of the linked list. In order to do recursion,
need to keep track of which node you are on
and the number of nodes you have checked,
which is why a custom Counter class is used,
since you can't return more than one thing.
@param currentNode the current Node of the list
@param counter the number of times recursive call returns
@param k the kth to last node
@return Node<T> the kth to last node of the list
(same qualifications as above)
*/
template <typename T>
Node<T> returnKthToLastHelper(Node<T>* head, int k, int &count)
{
	if (head->next == NULL)
		return *head;
	Node<T> returnedNode = returnKthToLastHelper(head->next, k, count);
	count++;
	if (count == k)
		return *head;
	return returnedNode;
}
