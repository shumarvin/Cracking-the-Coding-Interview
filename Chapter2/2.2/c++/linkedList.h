#ifndef LINKEDLIST_H
#define LINKEDLIST_H

#include "node.h"

/*
	Simple custom implementation of a single-linked list
*/
template <typename T>
class LinkedList
{
	Node<T>* head;

public:
	LinkedList() { head = NULL; }
	LinkedList(Node<T>* head) { this->head = head; }

	void insertNode(Node<T>* newNode)
	{
		Node<T>* currentNode = head;
		while (currentNode->next != NULL)
			currentNode = currentNode->next;
		currentNode->next = newNode;
	}
	Node<T>* getHead() { return head; }
};

#endif 

