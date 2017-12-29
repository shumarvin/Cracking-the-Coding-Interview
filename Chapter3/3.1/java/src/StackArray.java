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
    }

    public void push(int num, int stackNum) throws FullStackException
    {

    }

    public int pop(int stack)
    {
        return stack;
    }

    public int peek()
    {
        return 0;
    }

    public boolean isEmpty(int stackNum)
    {
        return false;
    }

    public int[] getStackArray()
    {
        return stackArray;
    }

    public class FullStackException extends Exception
    {
        public FullStackException() {super();}
        public FullStackException(String message) {super(message);}
    }
}
