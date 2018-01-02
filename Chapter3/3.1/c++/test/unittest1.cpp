#include "stdafx.h"
#include "CppUnitTest.h"
#include "../StackArray.h"
#include <iostream>
#include <functional>

using namespace Microsoft::VisualStudio::CppUnitTestFramework;

namespace test
{		
	TEST_CLASS(UnitTest1)
	{
	public:
		
		/*
			Testing push
		*/
		TEST_METHOD(testPushEmptyStackOne)
		{
			StackArray* test = new StackArray(5);
			try
			{
				test->push(1, 1);
			}
			catch (FullStackException e)
			{
				std::cout<<e.what() <<std::endl;
			}
			Assert::AreEqual(1, test->getStackArray()[0]);
		}
		TEST_METHOD(testPushEmptyStackTwo)
		{
			StackArray* test = new StackArray(5);
			try
			{
				test->push(1, 2);
			}
			catch (FullStackException e)
			{
				std::cout << e.what() << std::endl;
			}
			Assert::AreEqual(1, test->getStackArray()[5]);
		}
		TEST_METHOD(testPushEmptyStackThree)
		{
			StackArray* test = new StackArray(5);
			try
			{
				test->push(1, 3);
			}
			catch (FullStackException e)
			{
				std::cout << e.what() << std::endl;
			}
			Assert::AreEqual(1, test->getStackArray()[10]);
		}
		TEST_METHOD(testPushStackOne)
		{
			StackArray* test = new StackArray(5);
			try
			{
				test->push(1, 1);
				test->push(2, 1);
			}
			catch (FullStackException e)
			{
				std::cout << e.what() << std::endl;
			}
			Assert::AreEqual(1, test->getStackArray()[0]);
			Assert::AreEqual(2, test->getStackArray()[1]);
		}
		TEST_METHOD(testPushStackTwo)
		{
			StackArray* test = new StackArray(5);
			try
			{
				test->push(1, 2);
				test->push(2, 2);
			}
			catch (FullStackException e)
			{
				std::cout << e.what() << std::endl;
			}
			Assert::AreEqual(1, test->getStackArray()[5]);
			Assert::AreEqual(2, test->getStackArray()[6]);
		}
		TEST_METHOD(testPushStackThree)
		{
			StackArray* test = new StackArray(5);
			try
			{
				test->push(1, 3);
				test->push(2, 3);
			}
			catch (FullStackException e)
			{
				std::cout << e.what() << std::endl;
			}
			Assert::AreEqual(1, test->getStackArray()[10]);
			Assert::AreEqual(2, test->getStackArray()[11]);
		}
		TEST_METHOD(testFillEntireStack)
		{
			StackArray* test = new StackArray(5);
			try
			{
				for (int i = 1; i <= 5; i++)
					test->push(i, 1);
				for (int i = 1; i <= 5; i++)
					test->push(i, 2);
				for (int i = 1; i <= 5; i++)
					test->push(i, 3);
			}
			catch (FullStackException e)
			{
				std::cout << e.what() << std::endl;
			}
			int expected[] = {1,2,3,4,5,1,2,3,4,5,1,2,3,4,5};
			for(int i = 0; i < 15; i++)
				Assert::AreEqual(expected[i], test->getStackArray()[i]);
		}
		TEST_METHOD(testPushFullStackOne)
		{
			StackArray* test = new StackArray(5);
			try
			{
				for (int i = 1; i <= 5; i++)
					test->push(i, 1);
			}
			catch (FullStackException e)
			{
				std::cout << e.what() << std::endl;
			}
			std::function<void()> f = [test] {test->push(6, 1); };
			Assert::ExpectException<FullStackException>(f);
		}
		TEST_METHOD(testPushFullStackTwo)
		{
			StackArray* test = new StackArray(5);
			try
			{
				for (int i = 1; i <= 5; i++)
					test->push(i, 2);
			}
			catch (FullStackException e)
			{
				std::cout << e.what() << std::endl;
			}
			std::function<void()> f = [test] {test->push(6, 2); };
			Assert::ExpectException<FullStackException>(f);
		}
		TEST_METHOD(testPushFullStackThree)
		{
			StackArray* test = new StackArray(5);
			try
			{
				for (int i = 1; i <= 5; i++)
					test->push(i, 3);
			}
			catch (FullStackException e)
			{
				std::cout << e.what() << std::endl;
			}
			std::function<void()> f = [test] {test->push(6, 3); };
			Assert::ExpectException<FullStackException>(f);
		}

		/*
			Testing pop
		*/
		TEST_METHOD(testPopEmptyStackOne)
		{
			StackArray* test = new StackArray(5);
			int pop = -2;
			try
			{
				test->push(1, 1);
				pop = test->pop(1);
			}
			catch (FullStackException e)
			{
				std::cout << e.what() << std::endl;
			}
			Assert::AreEqual(1, pop);
			Assert::AreEqual(0, test->getStackArray()[0]);
			Assert::AreEqual(-1, test->getStackHeads()[0]);
		}
		TEST_METHOD(testPopEmptyStackTwo)
		{
			StackArray* test = new StackArray(5);
			int pop = -2;
			try
			{
				test->push(1, 2);
				pop = test->pop(2);
			}
			catch (FullStackException e)
			{
				std::cout << e.what() << std::endl;
			}
			Assert::AreEqual(1, pop);
			Assert::AreEqual(0, test->getStackArray()[5]);
			Assert::AreEqual(-1, test->getStackHeads()[1]);
		}
		TEST_METHOD(testPopEmptyStackThree)
		{
			StackArray* test = new StackArray(5);
			int pop = -2;
			try
			{
				test->push(1, 3);
				pop = test->pop(3);
			}
			catch (FullStackException e)
			{
				std::cout << e.what() << std::endl;
			}
			Assert::AreEqual(1, pop);
			Assert::AreEqual(0, test->getStackArray()[10]);
			Assert::AreEqual(-1, test->getStackHeads()[2]);
		}
		TEST_METHOD(testPopStackOne)
		{
			StackArray* test = new StackArray(5);
			int pop = -2;
			try
			{
				test->push(1, 1);
				test->push(2, 1);
				pop = test->pop(1);
			}
			catch (FullStackException e)
			{
				std::cout << e.what() << std::endl;
			}
			Assert::AreEqual(2, pop);
			Assert::AreEqual(1, test->getStackArray()[0]);
			Assert::AreEqual(0, test->getStackHeads()[1]);
		}
		TEST_METHOD(testPopStackTwo)
		{
			StackArray* test = new StackArray(5);
			int pop = -2;
			try
			{
				test->push(1, 2);
				test->push(2, 2);
				pop = test->pop(2);
			}
			catch (FullStackException e)
			{
				std::cout << e.what() << std::endl;
			}
			Assert::AreEqual(2, pop);
			Assert::AreEqual(1, test->getStackArray()[5]);
			Assert::AreEqual(5, test->getStackHeads()[1]);
		}
		TEST_METHOD(testPopStackThree)
		{
			StackArray* test = new StackArray(5);
			int pop = -2;
			try
			{
				test->push(1, 3);
				test->push(2, 3);
				pop = test->pop(3);
			}
			catch (FullStackException e)
			{
				std::cout << e.what() << std::endl;
			}
			Assert::AreEqual(2, pop);
			Assert::AreEqual(1, test->getStackArray()[10]);
			Assert::AreEqual(10, test->getStackHeads()[2]);
		}
		TEST_METHOD(testFillEntireStackAndPopOne)
		{
			StackArray* test = new StackArray(5);
			int stackOne, stackTwo, stackThree = -2;
			try
			{
				for (int i = 1; i <= 5; i++)
					test->push(i, 1);
				for (int i = 1; i <= 5; i++)
					test->push(i, 2);
				for (int i = 1; i <= 5; i++)
					test->push(i, 3);
				stackOne = test->pop(1);
				stackTwo = test->pop(2);
				stackThree = test->pop(3);

			}
			catch (FullStackException e)
			{
				std::cout << e.what() << std::endl;
			}

			int expected[] = { 1,2,3,4,1,2,3,4,1,2,3,4 };
			int expectedHeads[] = {3,6,9};
			Assert::AreEqual(5, stackOne);
			Assert::AreEqual(5, stackTwo);
			Assert::AreEqual(5, stackThree);
			for (int i = 0; i < 15; i++)
				Assert::AreEqual(expected[i], test->getStackArray()[i]);
			for (int i = 0; i < 3; i++)
				Assert::AreEqual(expectedHeads[i], test->getStackHeads()[i]);

		}
	};
}