#include "stdafx.h"
#include "CppUnitTest.h"
#include "../URLify.hpp"

using namespace Microsoft::VisualStudio::CppUnitTestFramework;

namespace URLifyTest
{		
	TEST_CLASS(UnitTest1)
	{
	public:
		
		TEST_METHOD(TestCountSpace1)
		{
			char onespace[] = "one space  ";
			Assert::AreEqual(1, countSpaces(onespace,9));
		}

		TEST_METHOD(TestCountSpace2)
		{
			char twospace[] = "two space two  ";
			Assert::AreEqual(2, countSpaces(twospace, 13));
		}
		TEST_METHOD(TestCountSpace0)
		{
			char zerospace[] = "zerospace  ";
			Assert::AreEqual(0, countSpaces(zerospace, 9));
		}

		TEST_METHOD(TestdoURLify1)
		{
			char onespace[] = "one space  ";
			char correct[] = "one%20space";

			Assert::AreEqual(correct, doURLify(onespace, 9));
		}
		TEST_METHOD(TestdoURLify2)
		{
			char twospace[] = "two space two    ";
			char correct[] = "two%20space%20two";

			Assert::AreEqual(correct, doURLify(twospace, 13));
		}
		TEST_METHOD(TestdoURLify0)
		{
			char zerospace[] = "zerospace";
			char correct[] = "zerospace";

			Assert::AreEqual(correct, doURLify(zerospace, 9));
		}
	};
}