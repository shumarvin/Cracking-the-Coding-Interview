#include "stdafx.h"
#include "CppUnitTest.h"
#include "../removeDups.cpp"
#include <list>
#include <vector>

using namespace Microsoft::VisualStudio::CppUnitTestFramework;

namespace UnitTest1
{		
	TEST_CLASS(UnitTest1)
	{
	public:
		
		TEST_METHOD(removeDups1)
		{
			std::list<int>::iterator it;
			std::list<int> list;
			list.push_back(1);
			list.push_back(27);
			list.push_back(30);
			list.push_back(27);
			list.push_back(15);
			std::list<int> actual(list);
			removeDups(list);
			it = actual.begin();
			advance(it, 3);
			actual.erase(it);
			Assert::AreEqual(true, (std::equal(std::begin(list),std::end(list),std::begin(actual))));
		}
		TEST_METHOD(removeDups2_1)
		{
			std::list<int>::iterator it;
			std::list<int> list;
			list.push_back(1);
			list.push_back(27);
			list.push_back(30);
			list.push_back(27);
			list.push_back(15);
			std::list<int> actual(list);
			removeDups2(list);
			it = actual.begin();
			advance(it, 3);
			actual.erase(it);
			Assert::AreEqual(true, (std::equal(std::begin(list), std::end(list), std::begin(actual))));
		}
		TEST_METHOD(removeDups0)
		{
			std::list<int> list;
			list.push_back(1);
			list.push_back(27);
			list.push_back(30);
			list.push_back(15);
			std::list<int> actual(list);
			removeDups(list);
			Assert::AreEqual(true, (std::equal(std::begin(list), std::end(list), std::begin(actual))));
		}
		TEST_METHOD(removeDups2_0)
		{
			std::list<int> list;
			list.push_back(1);
			list.push_back(27);
			list.push_back(30);
			list.push_back(15);
			std::list<int> actual(list);
			removeDups2(list);
			Assert::AreEqual(true, (std::equal(std::begin(list), std::end(list), std::begin(actual))));
		}

		TEST_METHOD(removeDupsVector2)
		{
			std::list<std::vector<int>> list;
			std::list<std::vector<int>>::iterator actualit;
			std::vector<int> ones(3, 5);
			std::vector<int> twos(2, 7);
			std::vector<int> onecopy(3, 5);
			std::vector<int> threes(3, 8);
			std::vector<int> twocopy(twos);
			list.push_back(ones);
			list.push_back(twos);
			list.push_back(onecopy);
			list.push_back(threes);
			list.push_back(twocopy);
			std::list<std::vector<int>> actual(list);
			actualit = actual.begin();
			advance(actualit, 2);
			actual.erase(actualit);
			actual.pop_back();
			removeDups(list);
			Assert::AreEqual(true, (std::equal(std::begin(list), std::end(list), std::begin(actual))));
		}
		TEST_METHOD(removeDups2Vector2)
		{
			std::list<std::vector<int>> list;
			std::list<std::vector<int>>::iterator actualit;
			std::vector<int> ones(3, 5);
			std::vector<int> twos(2, 7);
			std::vector<int> onecopy(3, 5);
			std::vector<int> threes(3, 8);
			std::vector<int> twocopy(twos);
			list.push_back(ones);
			list.push_back(twos);
			list.push_back(onecopy);
			list.push_back(threes);
			list.push_back(twocopy);
			std::list<std::vector<int>> actual(list);
			actualit = actual.begin();
			advance(actualit, 2);
			actual.erase(actualit);
			actual.pop_back();
			removeDups2(list);
			Assert::AreEqual(true, (std::equal(std::begin(list), std::end(list), std::begin(actual))));
		}
		TEST_METHOD(removeDupsVector0)
		{
			std::list<std::vector<int>> list;
			std::list<std::vector<int>>::iterator actualit;
			std::vector<int> ones(3, 5);
			std::vector<int> twos(2, 7);			
			std::vector<int> threes(3, 8);		
			list.push_back(ones);
			list.push_back(twos);		
			list.push_back(threes);
			std::list<std::vector<int>> actual(list);
			removeDups(list);
			Assert::AreEqual(true, (std::equal(std::begin(list), std::end(list), std::begin(actual))));
		}
		TEST_METHOD(removeDups2Vector0)
		{
			std::list<std::vector<int>> list;
			std::list<std::vector<int>>::iterator actualit;
			std::vector<int> ones(3, 5);
			std::vector<int> twos(2, 7);
			std::vector<int> threes(3, 8);
			list.push_back(ones);
			list.push_back(twos);
			list.push_back(threes);
			std::list<std::vector<int>> actual(list);
			removeDups2(list);
			Assert::AreEqual(true, (std::equal(std::begin(list), std::end(list), std::begin(actual))));
		}
	};
}