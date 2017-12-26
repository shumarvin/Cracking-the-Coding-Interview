#include "node.h";
#include "linkedList.h"

/*
Deletes middlenode from its linked list. middleNode
cannot be the first or last node of the last, but
it can be any node in between.
Algorithm: Simply copy the next node's
info into middleNode.
*/
template <typename T>
void deleteMiddleNode(Node<T>* middleNode)
{
	Node <T>* nextNode = middleNode->next;
	middleNode->data = nextNode->data;
	middleNode->next = nextNode->next;
	delete nextNode;
}