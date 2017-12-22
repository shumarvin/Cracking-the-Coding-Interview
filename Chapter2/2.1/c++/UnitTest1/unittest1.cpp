#include "stdafx.h"
#include "CppUnitTest.h"
#include "../removeDups.cpp"
#include <list>

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
			removeDups<int>(list);
			it = actual.begin();
			advance(it, 3);
			actual.erase(it);
			Assert::AreEqual(true, (std::equal(std::begin(list),std::end(list),std::begin(actual))));
		}

	};
}