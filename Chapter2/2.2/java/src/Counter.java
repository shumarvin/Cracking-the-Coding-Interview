//counter class to help keep track of counts
public class Counter
{
    private int count;

    //default constructor
    public Counter()
    {
        count = 0;
    }
    //constructor
    public Counter(int startCount)
    {
        count = startCount;
    }
    //add one to count
    public void incrementCount()
    {
        count++;
    }
    public void decrementCount()
    {
        count--;
    }

    //getter
    public int getCount()
    {
        return count;
    }
}
