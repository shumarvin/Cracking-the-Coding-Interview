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
	int size;

public:
	LinkedList() { head = nullptr; size = 0; }
	LinkedList(Node<T>* head) { this->head = head; size = 1; }

	//insert a new node
	void insertNode(Node<T>* newNode)
	{
		if (head == nullptr)
			head = newNode;
		else
		{
			Node<T>* currentNode = head;
			while (currentNode->next != nullptr)
				currentNode = currentNode->next;
			currentNode->next = newNode;
		}
		size++;
	}

	//sets newHead as the new head of the linked list
	void insertHead(Node<T>* newHead)
	{
		newHead->next = head;
		head = newHead;
	}

	//gets the node at the specified index
	Node<T>* getNode(int index)
	{
		Node<T>* currentNode = head;
		for (int i = 0; i < index; i++)
			currentNode = currentNode->next;
		return currentNode;
	}

	//getters
	Node<T>* getHead() { return head; }
	int getSize() { return size; }
};

#endif 

