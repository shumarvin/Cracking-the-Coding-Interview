package com.URLify;

public class URLify
{
    private char[] arr;
    private int trueLength;

    //constructor
    public URLify(String str, int length)
    {
        arr = str.toCharArray();
        trueLength = length;
    }


    /**
     * Replaces all spaces in arr with '%20' and does it in place
     * Algorithm:
     * 1. Find final length of arr by counting number of spaces,
     * multiplying that by two (since a space is one char while '%20' is 3
     * chars), and adding that to the true length. This will be the starting
     * index to copy from
     * 2. Go backwards starting at the last char. If it isn't a space, copy
     * that char into its new place using the final length index. If it is,
     * write '%20'.
     * @return arr modified arr with the '%20''s in place
     */
    public char[] doURLify()
    {
        //find final length
        int finalLengthIndex = trueLength + countSpaces() * 2;

        //go backwards
        for(int i = trueLength- 1; i >= 0; i--)
        {
            //if it's a space, replace it with '%20'
            if(arr[i] == ' ')
            {
                arr[finalLengthIndex-3] = '%';
                arr[finalLengthIndex-2] = '2';
                arr[finalLengthIndex-1] = '0';
                finalLengthIndex -=3;
            }
            //else copy the char
            else
            {
                arr[finalLengthIndex-1] = arr[i];
                finalLengthIndex--;
            }
        }
        return arr;
    }


    /**
     * Counts number of spaces in inputted string
     * @return count number of spaces
     */
    public  int countSpaces()
    {
        int count = 0;
        for(int i = 0; i < trueLength; i++)
        {
            if(arr[i] == ' ')
                count++;
        }
        return count;
    }
}