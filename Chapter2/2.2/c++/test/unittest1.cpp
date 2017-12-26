#include "stdafx.h"
#include "CppUnitTest.h"
#include "../node.h"
#include "../linkedList.h"
#include "../returnKthToLast.cpp"

using namespace Microsoft::VisualStudio::CppUnitTestFramework;

namespace test
{		
	TEST_CLASS(UnitTest1)
	{
	public:
		
		TEST_METHOD(return1stToLast)
		{
			LinkedList<int>* list = new LinkedList<int>(new Node<int>{ 5, NULL});
			list->insertNode(new Node<int>{ 1, NULL });
			list->insertNode(new Node<int>{ 23, NULL });
			list->insertNode(new Node<int>{ 90, NULL });
			list->insertNode(new Node<int>{ 55, NULL });

			Assert::AreEqual(90, returnKthToLast(list->getHead(), 1).data);

		}
		TEST_METHOD(return0thToLast)
		{
			// TODO: Your test code here
			LinkedList<int>* list = new LinkedList<int>(new Node<int>{ 5, NULL });
			list->insertNode(new Node<int>{ 1, NULL });
			list->insertNode(new Node<int>{ 23, NULL });
			list->insertNode(new Node<int>{ 90, NULL });
			list->insertNode(new Node<int>{ 55, NULL });

			Assert::AreEqual(55, returnKthToLast(list->getHead(), 0).data);

		}
		TEST_METHOD(return2ndToLast)
		{
			// TODO: Your test code here
			LinkedList<int>* list = new LinkedList<int>(new Node<int>{ 5, NULL });
			list->insertNode(new Node<int>{ 1, NULL });
			list->insertNode(new Node<int>{ 23, NULL });
			list->insertNode(new Node<int>{ 90, NULL });
			list->insertNode(new Node<int>{ 55, NULL });

			Assert::AreEqual(23, returnKthToLast(list->getHead(), 2).data);

		}
		TEST_METHOD(return1stElement)
		{
			// TODO: Your test code here
			LinkedList<int>* list = new LinkedList<int>(new Node<int>{ 5, NULL });
			list->insertNode(new Node<int>{ 1, NULL });
			list->insertNode(new Node<int>{ 23, NULL });
			list->insertNode(new Node<int>{ 90, NULL });
			list->insertNode(new Node<int>{ 55, NULL });

			Assert::AreEqual(5, returnKthToLast(list->getHead(), 4).data);

		}

	};
}