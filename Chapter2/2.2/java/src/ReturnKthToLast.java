public class ReturnKthToLast<T>
{
    private MyLinkedList<T> list;

    //constructor
    public ReturnKthToLast(MyLinkedList<T> list)
    {
        this.list = list;
    }

    /*
        Returns kth to last element of list, where 0<=k<=list.size()-1
        Here, 1st-to-last is the 2nd-to-last element of list,
        2nd-to-last is the 3rd-to-last element, and so on.
        @return T the kth to last element of the list
     */
    public Node<T> returnKthToLast(int k)
    {

        //if k is the size of the list-1, then return the 1st element
        if(k == list.getSize() -1)
            return list.getHead();

        //start counting from index of last element
        int count = list.getSize() - 1;
        Node<T> currentNode = list.getHead();
        while(currentNode.getNextNode() != null)
        {
            //return the element once count reaches k
            if(count == k)
                return currentNode;
            else
            {
                count--;
                currentNode = currentNode.getNextNode();
            }
        }
        //will only reach this point if k == 0
        return currentNode;
    }
   /*
    Public interface for recursive version. Actual logic is in
    private method
    */
    public Node<T> returnKThToLastRecursive(int k)
    {
        Counter counter = new Counter();
        return returnKthToLastRecursiveHelper(list.getHead(), counter, k);
    }
    /*
        Recursive version where you don't know the size
        of the linked list. In order to do recursion,
        need to keep track of which node you are on
        and the number of nodes you have checked,
        which is why a custom Counter class is used,
        since you can't return more than one thing.
        @param currentNode the current Node of the list
        @param counter the number of times recursive call returns
        @param k the kth to last node
        @return Node<T> the kth to last node of the list
        (same qualifications as above)
     */
    private Node<T> returnKthToLastRecursiveHelper(Node<T> currentNode, Counter counter, int k)
    {
        //base case
        if(currentNode.getNextNode() == null)
            return currentNode;

        //recursive calls until base case
        Node<T> returnedNode = returnKthToLastRecursiveHelper(currentNode.getNextNode(), counter, k);
        //increment count to keep track of number of recursive calls returned
        counter.incrementCount();
        if(counter.getCount() == k)
            return currentNode;

        return returnedNode;
    }
}
