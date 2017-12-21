#include "stdafx.h"
#include "CppUnitTest.h"
#include "../palindromepermutation.h"

using namespace Microsoft::VisualStudio::CppUnitTestFramework;

namespace test
{		
	TEST_CLASS(UnitTest1)
	{
	public:
		
		TEST_METHOD(isPalindromePermutationTrue1)
		{
			Assert::AreEqual(true, isPalindromePermutation("aba"));
		}
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

	};
}