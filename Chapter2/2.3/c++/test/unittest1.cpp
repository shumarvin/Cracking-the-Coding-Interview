#include "stdafx.h"
#include "CppUnitTest.h"
#include "../linkedList.h"
#include "../node.h"
#include "../deleteMiddleNode.cpp"

using namespace Microsoft::VisualStudio::CppUnitTestFramework;

namespace test
{		
	TEST_CLASS(UnitTest1)
	{
	public:
		
		TEST_METHOD(testDeleteMiddleNode1)
		{
			LinkedList<int>* list = new LinkedList<int>(new Node<int>{ 5, NULL });
			list->insertNode(new Node<int>{ 1, NULL });
			list->insertNode(new Node<int>{ 23, NULL });
			list->insertNode(new Node<int>{ 90, NULL });
			list->insertNode(new Node<int>{ 55, NULL });

			LinkedList<int>* actual = new LinkedList<int>(new Node<int>{ 5, NULL });
			actual->insertNode(new Node<int>{ 23, NULL });
			actual->insertNode(new Node<int>{ 90, NULL });
			actual->insertNode(new Node<int>{ 55, NULL });

			deleteMiddleNode(list->getNode(1));

			for (int i = 0; i < 4; i++)
				Assert::AreEqual(actual->getNode(i)->data, list->getNode(i)->data);
		}
		TEST_METHOD(testDeleteMiddleNode2)
		{
			LinkedList<int>* list = new LinkedList<int>(new Node<int>{ 5, NULL });
			list->insertNode(new Node<int>{ 1, NULL });
			list->insertNode(new Node<int>{ 23, NULL });
			list->insertNode(new Node<int>{ 90, NULL });
			list->insertNode(new Node<int>{ 55, NULL });

			LinkedList<int>* actual = new LinkedList<int>(new Node<int>{ 5, NULL });
			actual->insertNode(new Node<int>{ 23, NULL });
			actual->insertNode(new Node<int>{ 90, NULL });
			actual->insertNode(new Node<int>{ 55, NULL });

			deleteMiddleNode(list->getNode(2));

			for (int i = 0; i < 4; i++)
				Assert::AreEqual(actual->getNode(i)->data, list->getNode(i)->data);
		}
		TEST_METHOD(testDeleteMiddleNode3)
		{
			LinkedList<int>* list = new LinkedList<int>(new Node<int>{ 5, NULL });
			list->insertNode(new Node<int>{ 1, NULL });
			list->insertNode(new Node<int>{ 23, NULL });
			list->insertNode(new Node<int>{ 90, NULL });
			list->insertNode(new Node<int>{ 55, NULL });

			LinkedList<int>* actual = new LinkedList<int>(new Node<int>{ 5, NULL });
			list->insertNode(new Node<int>{ 1, NULL });
			actual->insertNode(new Node<int>{ 23, NULL });
			actual->insertNode(new Node<int>{ 55, NULL });

			deleteMiddleNode(list->getNode(2));

			for (int i = 0; i < 4; i++)
				Assert::AreEqual(actual->getNode(i)->data, list->getNode(i)->data);
		}

	};
}