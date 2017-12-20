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

    public void doURLify()
    {
        
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