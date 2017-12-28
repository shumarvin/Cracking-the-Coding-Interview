#include "stdafx.h"
#include "CppUnitTest.h"
#include "../linkedList.h"
#include "../node.h"
#include "../sumLists.cpp"

using namespace Microsoft::VisualStudio::CppUnitTestFramework;

namespace test
{		
	TEST_CLASS(UnitTest1)
	{
	public:
		
		TEST_METHOD(testSumLists3)
		{
			LinkedList<int>* list1 = new LinkedList<int>(new Node<int>{ 1, NULL });
			list1->insertNode(new Node<int>{ 7, NULL });
			list1->insertNode(new Node<int>{ 8, NULL });

			LinkedList<int>* list2 = new LinkedList<int>(new Node<int>{ 0, NULL });
			list2->insertNode(new Node<int>{ 2, NULL });
			list2->insertNode(new Node<int>{ 9, NULL });

			LinkedList<int>* expected = new LinkedList<int>(new Node<int>{ 1, NULL });
			expected->insertNode(new Node<int>{ 9, NULL });
			expected->insertNode(new Node<int>{ 7, NULL });
			expected->insertNode(new Node<int>{ 1, NULL });

			LinkedList<int>* actual = doSumLists(list1, list2);
			for (int i = 0; i < expected->getSize(); i++)
				Assert::AreEqual(expected->getNode(i)->data, actual->getNode(i)->data);
		}
		TEST_METHOD(testSumListsNonReverse3)
		{
			LinkedList<int>* list1 = new LinkedList<int>(new Node<int>{ 1, NULL });
			list1->insertNode(new Node<int>{ 7, NULL });
			list1->insertNode(new Node<int>{ 8, NULL });

			LinkedList<int>* list2 = new LinkedList<int>(new Node<int>{ 9, NULL });
			list2->insertNode(new Node<int>{ 2, NULL });
			list2->insertNode(new Node<int>{ 9, NULL });

			LinkedList<int>* expected = new LinkedList<int>(new Node<int>{ 1, NULL });
			expected->insertNode(new Node<int>{ 1, NULL });
			expected->insertNode(new Node<int>{ 0, NULL });
			expected->insertNode(new Node<int>{ 1, NULL });

			LinkedList<int>* actual = doSumListsNonReverse(list1, list2);
			for (int i = 0; i < expected->getSize(); i++)
				Assert::AreEqual(expected->getNode(i)->data, actual->getNode(i)->data);
		}
		TEST_METHOD(testSumLists2)
		{
			LinkedList<int>* list1 = new LinkedList<int>(new Node<int>{ 2, NULL });
			list1->insertNode(new Node<int>{ 2, NULL });

			LinkedList<int>* list2 = new LinkedList<int>(new Node<int>{ 3, NULL });
			list2->insertNode(new Node<int>{ 2, NULL });
			
			LinkedList<int>* expected = new LinkedList<int>(new Node<int>{ 5, NULL });
			expected->insertNode(new Node<int>{ 4, NULL });

			LinkedList<int>* actual = doSumLists(list1, list2);
			for (int i = 0; i < expected->getSize(); i++)
				Assert::AreEqual(expected->getNode(i)->data, actual->getNode(i)->data);
		}
		TEST_METHOD(testSumListsNonReverse2)
		{
			LinkedList<int>* list1 = new LinkedList<int>(new Node<int>{ 2, NULL });
			list1->insertNode(new Node<int>{ 2, NULL });

			LinkedList<int>* list2 = new LinkedList<int>(new Node<int>{ 3, NULL });
			list2->insertNode(new Node<int>{ 2, NULL });

			LinkedList<int>* expected = new LinkedList<int>(new Node<int>{ 5, NULL });
			expected->insertNode(new Node<int>{ 4, NULL });

			LinkedList<int>* actual = doSumListsNonReverse(list1, list2);
			for (int i = 0; i < expected->getSize(); i++)
				Assert::AreEqual(expected->getNode(i)->data, actual->getNode(i)->data);
		}
		TEST_METHOD(testSumLists1)
		{
			LinkedList<int>* list1 = new LinkedList<int>(new Node<int>{ 2, NULL });

			LinkedList<int>* list2 = new LinkedList<int>(new Node<int>{ 3, NULL });

			LinkedList<int>* expected = new LinkedList<int>(new Node<int>{ 5, NULL });

			LinkedList<int>* actual = doSumLists(list1, list2);
			for (int i = 0; i < expected->getSize(); i++)
				Assert::AreEqual(expected->getNode(i)->data, actual->getNode(i)->data);
		}
		TEST_METHOD(testSumListsNonReverse1)
		{
			LinkedList<int>* list1 = new LinkedList<int>(new Node<int>{ 2, NULL });

			LinkedList<int>* list2 = new LinkedList<int>(new Node<int>{ 3, NULL });

			LinkedList<int>* expected = new LinkedList<int>(new Node<int>{ 5, NULL });

			LinkedList<int>* actual = doSumListsNonReverse(list1, list2);
			for (int i = 0; i < expected->getSize(); i++)
				Assert::AreEqual(expected->getNode(i)->data, actual->getNode(i)->data);
		}
		
		TEST_METHOD(testSumLists4)
		{
			LinkedList<int>* list1 = new LinkedList<int>(new Node<int>{ 1, NULL });
			list1->insertNode(new Node<int>{ 7, NULL });

			LinkedList<int>* list2 = new LinkedList<int>(new Node<int>{ 2, NULL });
			list2->insertNode(new Node<int>{ 9, NULL });
			list2->insertNode(new Node<int>{ 9, NULL });

			LinkedList<int>* expected = new LinkedList<int>(new Node<int>{ 3, NULL });
			expected->insertNode(new Node<int>{ 6, NULL });
			expected->insertNode(new Node<int>{ 0, NULL });
			expected->insertNode(new Node<int>{ 1, NULL });

			LinkedList<int>* actual = doSumLists(list1, list2);
			for (int i = 0; i < expected->getSize(); i++)
				Assert::AreEqual(expected->getNode(i)->data, actual->getNode(i)->data);
		}
		TEST_METHOD(testSumListsNonReverse4)
		{
			LinkedList<int>* list1 = new LinkedList<int>(new Node<int>{ 1, NULL });
			list1->insertNode(new Node<int>{ 7, NULL });

			LinkedList<int>* list2 = new LinkedList<int>(new Node<int>{ 2, NULL });
			list2->insertNode(new Node<int>{ 9, NULL });
			list2->insertNode(new Node<int>{ 9, NULL });

			LinkedList<int>* expected = new LinkedList<int>(new Node<int>{ 3, NULL });
			expected->insertNode(new Node<int>{ 1, NULL });
			expected->insertNode(new Node<int>{ 6, NULL });

			LinkedList<int>* actual = doSumListsNonReverse(list1, list2);
			for (int i = 0; i < expected->getSize(); i++)
				Assert::AreEqual(expected->getNode(i)->data, actual->getNode(i)->data);
		}
	};
}