import java.util.LinkedList;
import java.util.Hashtable;

public class RemoveDups<T>
{
    private LinkedList<T> list;

    //constructor
    public RemoveDups(LinkedList<T> list)
    {
        this.list = list;
    }
    /*
        Removes all duplicates in list
        Algorithm:
        1. Create empty hashtable to keep track of dups
        2. Go through linked list. If the current Node is
            in the hashtable, delete it. If not, then add
            it to the hashtable.
        @return list the linkedlist without any duplicates
     */
    public LinkedList<T> removeDups()
    {
        Hashtable<T, Boolean> hashTable = new Hashtable<>();
        list.forEach((currentNode)->
        {
            if(hashTable.contains((currentNode)))
                hashTable.remove((currentNode));
            else
                hashTable.put(currentNode,true);
        });
        return list;
    }

    public LinkedList<T> removeDups2()
    {
        return null;
    }
}

