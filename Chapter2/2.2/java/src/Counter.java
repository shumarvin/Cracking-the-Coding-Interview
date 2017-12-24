//counter class to help keep track of counts
public class Counter
{
    private int count;

    //constructor
    public Counter()
    {
        count = 0;
    }

    //add one to count
    public void incrementCount()
    {
        count++;
    }
    //getter
    public int getCount()
    {
        return count;
    }
}
