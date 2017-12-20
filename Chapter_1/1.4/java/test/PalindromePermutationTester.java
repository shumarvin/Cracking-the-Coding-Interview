import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class PalindromePermutationTester
{
    @Test
    public void testGetCharIndexF()
    {
        PalindromePermutation test = new PalindromePermutation("Tact Coa");
        assertEquals(5, test.getCharIndex('f'));
    }
    @Test
    public void testGetCharIndexA()
    {
        PalindromePermutation test = new PalindromePermutation("Tact Coa");
        assertEquals(0, test.getCharIndex('a'));
    }
    @Test
    public void testGetCharIndexZ()
    {
        PalindromePermutation test = new PalindromePermutation("Tact Coa");
        assertEquals(25, test.getCharIndex('z'));
    }

    @Test
    public void testBuildCharFreq1()
    {
        int [] testArr = new int[PalindromePermutation.NUMCHARS];
        Arrays.fill(testArr, 1);
        PalindromePermutation test = new PalindromePermutation("abcdefghijklmnopqrstuvwxyz");
        assertArrayEquals(testArr, test.getCharFreq());
    }

    @Test
    public void testBuildCharFreq2()
    {
        int[] testArr = new int[PalindromePermutation.NUMCHARS];
        testArr[0] = 2;   //a
        testArr[2] = 2;   //c
        testArr[19] = 2;  //t
        testArr[14] = 1;  //o
        PalindromePermutation test = new PalindromePermutation("Tact Coa");
        assertArrayEquals(testArr, test.getCharFreq());
    }

    @Test
    public void testBuildCharFreq0()
    {
        int[] testArr = new int[PalindromePermutation.NUMCHARS];
        PalindromePermutation test = new PalindromePermutation("");
        assertArrayEquals(testArr, test.getCharFreq());
    }
    @Test
    public void testCheckOddCountFalse1()
    {
        PalindromePermutation test = new PalindromePermutation("abcdefghijklmnopqrstuvwxyz");
        assertEquals(false, test.checkOddCount(test.getCharFreq()));
    }
    @Test
    public void testCheckOddCountTrue1()
    {
        PalindromePermutation test = new PalindromePermutation("Racecar");
        assertEquals(true, test.checkOddCount(test.getCharFreq()));
    }
    @Test
    public void testCheckOddCountTrue2()
    {
        PalindromePermutation test = new PalindromePermutation("Tact Coa");
        assertEquals(true, test.checkOddCount(test.getCharFreq()));
    }
    @Test
    public void testCheckOddCountFalse2()
    {
        PalindromePermutation test = new PalindromePermutation("abb aba");
        assertEquals(false, test.checkOddCount(test.getCharFreq()));
    }
    @Test
    public void testIsPalindromePermutationTrue2()
    {
        PalindromePermutation test = new PalindromePermutation("Tact Coa");
        assertEquals(true, test.isPalindromePermutation());
    }
    @Test
    public void testIsPalindromePermutationTrue1()
    {
        PalindromePermutation test = new PalindromePermutation("Racecar");
        assertEquals(true, test.isPalindromePermutation());
    }
    @Test
    public void testIsPalindromePermutationFalse1()
    {
        PalindromePermutation test = new PalindromePermutation("abcdefghijklmnopqrstuvwxyz");
        assertEquals(false, test.isPalindromePermutation());
    }
    @Test
    public void testIsPalindromePermutationFalse2()
    {
        PalindromePermutation test = new PalindromePermutation("abb aba");
        assertEquals(false, test.isPalindromePermutation());
    }

}
