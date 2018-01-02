/*
    Class that implements 3 stacks using one array.
    Each stack will be a fixed size. Any pushes
    to a full stack will throw an exception.
    This implementation will be a stack of
    ints for simplicity. However, it can
    be generalized for any type.
 */

import java.util.Arrays;

public class StackArray
{
    public static final int NUMSTACKS = 3;

    private int stackArray[];                       //the array containing all the stacks
    private int stackSize;                          //the size of each stack
    private int stackHeads[];                       //array containing the head index of each stack

    /*
        Constructor
        @param size the size of each stack
     */
    public StackArray(int size)
    {
        stackSize = size;
        stackArray =  new int[stackSize * NUMSTACKS];
        stackHeads = new int[NUMSTACKS];
        //each stack is empty, so mark head indexes
        //as -1 to indicate so
        Arrays.fill(stackHeads,-1);
    }

    /*
        Pushes a number onto the specified stack
        @param num the int to push onto the stack
        @param stackNum the specific stack to push num onto
        @throws FullStackException if specified stack is
        already full.
     */
    public void push(int num, int stackNum) throws FullStackException
    {
        //get head index of requested stack
        int stackHeadIndex = stackHeads[stackNum - 1];

        //make sure stack isn't already full
        if(stackHeadIndex == stackNum * stackSize - 1)
            throw new FullStackException("Error! That stack is already full.");

        /*
           Push onto stack.
           If stack is empty, insert num at first
           spot on stack and update stackHeads
           accordingly
        */
        if(stackHeadIndex == -1)
        {
            /*
                Index for first spot for stack 1 is 0, 2nd stack is 5,
                3rd spot is 10, so formula is:
                (stackNum-1) * stackSize
             */
            stackHeadIndex = (stackNum-1) * stackSize;
            stackArray[stackHeadIndex] = num;
            stackHeads[stackNum-1] = stackHeadIndex;
        }
        //else, insert at one above current head index
        //and update stack head index
        else
        {
            stackArray[stackHeadIndex + 1] = num;
            //update head index
            stackHeads[stackNum-1]++;
        }
    }
    /*
	Pops the head of the specified stack
	@param numStack the specific stack to pop off
	@return stackNum the head of the specific stack
    */
    public int pop(int stack) throws EmptyStackException
    {
        //get head index of requested stack
        int stackHeadIndesx = stackHeads[stack - 1];

        //if stack is empty throw exception
        if(stackHeadIndesx == -1)
            throw new EmptyStackException("Error! That stack is empty.");

        //get the head of the stack
        int stackNum = stackArray[stackHeadIndesx];

        //update stackHeads

        //if it's the last item on the stack, reset
        //to empty value of -1
        if(stackHeadIndesx == (stack - 1) * stackSize)
            stackHeads[stack - 1] = -1;
        //else just decrease the value by one
        else
            stackHeads[stack - 1]--;

        //reset former head to default value
        stackArray[stackHeadIndesx] = 0;

        return stackNum;
    }

    public int peek()
    {
        return 0;
    }

    public boolean isEmpty(int stackNum)
    {
        return false;
    }

    //getters
    public int[] getStackArray()
    {
        return stackArray;
    }
    public int[] getStackHeads()
    {
        return stackHeads;
    }

    public class FullStackException extends Exception
    {
        public FullStackException() {super();}
        public FullStackException(String message) {super(message);}
    }

    public class EmptyStackException extends Exception
    {
        public EmptyStackException() {super();}
        public EmptyStackException(String message) {super(message);}
    }
}
