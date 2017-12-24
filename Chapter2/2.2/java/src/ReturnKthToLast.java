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
    public Node<T> returnKThToLastRecursive(int k)
    {
        Counter counter = new Counter();
        return returnKthToLastRecursiveHelper(list.getHead(), counter, k);
    }
    private Node<T> returnKthToLastRecursiveHelper(Node<T> currentNode, Counter counter, int k)
    {
        return currentNode;
    }
}
