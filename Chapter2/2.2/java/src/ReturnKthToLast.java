import java.util.Iterator;
import java.util.LinkedList;

public class ReturnKthToLast<T>
{
    private LinkedList<T> list;

    //constructor
    public ReturnKthToLast(LinkedList<T> list)
    {
        this.list = list;
    }

    /*
        Returns kth to last element of list, where 0<=k<=list.size()-1
        Here, 1st-to-last is the 2nd-to-last element of list,
        2nd-to-last is the 3rd-to-last element, and so on.
        @return T the kth to last element of the list,
         null if out of range
     */
    public T returnKthToLast(int k)
    {
        //if k is 0, simply return the last element
        if(k == 0)
            return list.getLast();

        //if k is the size of the list-1, then return the 1st element
        if(k == list.size() -1)
            return  list.getFirst();

        //start counting from index of last element
        int count = list.size() - 1;
        Iterator<T> iterator = list.iterator();
        while(iterator.hasNext())
        {
            //return the element once count reaches k
            if(count == k)
                return iterator.next();
            else
            {
                count--;
                iterator.next();
            }
        }
        return null;
    }
}
