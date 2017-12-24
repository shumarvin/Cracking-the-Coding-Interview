/*
    Simple custom implementation of a singly-linked list
 */
public class MyLinkedList<T>
{
    private Node<T> head;
    private int size;

    //default constructor
    public MyLinkedList()
    {
        head = null;
        size = 0;
    }
    //constructor
    public MyLinkedList(Node<T> head)
    {
        this.head = head;
        size = 1;
    }

    //insert node into linked list
    public void insertNode(Node<T> node)
    {
        //skip to last node
        Node currentNode = head;
        while(currentNode.getNextNode() != null)
            currentNode = currentNode.getNextNode();

        //insert node
        currentNode.setNext(node);
        size++;
    }

    //getters
    public Node<T> getHead()
    {
        return head;
    }

    public int getSize()
    {
        return size;
    }
}
