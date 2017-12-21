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

	};
}