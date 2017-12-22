#include "stdafx.h"
#include "CppUnitTest.h"
#include "../palindromepermutation.h"
#include <algorithm>
#include <iterator>
#include <array>

using namespace Microsoft::VisualStudio::CppUnitTestFramework;

namespace test
{		
	TEST_CLASS(UnitTest1)
	{
	public:
		TEST_METHOD(getCharIndexTestF)
		{
			Assert::AreEqual(5, getCharIndex('f'));
		}
		TEST_METHOD(getCharIndexTestA)
		{
			Assert::AreEqual(0, getCharIndex('a'));
		}
		TEST_METHOD(getCharIndexTestZ)
		{
			Assert::AreEqual(25, getCharIndex('z'));
		}
		TEST_METHOD(getCharIndexTestExclamationPoint)
		{
			Assert::AreEqual(-1, getCharIndex('!'));
		}
		TEST_METHOD(getCharFreq1)
		{
			int testArr[NUMCHARS] = { };
			std::fill_n(testArr, NUMCHARS, 1);
			Assert::AreEqual(true, (std::equal(std::begin(testArr),std::end(testArr),std::begin(getCharFreq("abcdefghijklmnopqrstuvwxyz")))));
		}
		TEST_METHOD(getCharFreq2)
		{
			int testArr[NUMCHARS] = { };
			testArr[0] = 2;   //a
			testArr[2] = 2;   //c
			testArr[19] = 2;  //t
			testArr[14] = 1;  //o
			Assert::AreEqual(true, (std::equal(std::begin(testArr), std::end(testArr), std::begin(getCharFreq("Tact Coa")))));
		}
		TEST_METHOD(getCharFreq0)
		{
			int testArr[NUMCHARS] = {};
			Assert::AreEqual(true, (std::equal(std::begin(testArr), std::end(testArr), std::begin(getCharFreq("")))));
		}
		TEST_METHOD(isPalindromePermutationTrue1)
		{
			Assert::AreEqual(true, isPalindromePermutation("aba"));
		}
	};
}