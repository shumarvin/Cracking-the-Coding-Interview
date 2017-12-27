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
        if(head == null)
            head = node;
        else
        {
            //skip to last node
            Node currentNode = head;
            while(currentNode.getNextNode() != null)
                currentNode = currentNode.getNextNode();

            //insert node
            currentNode.setNext(node);
        }
        size++;
    }
    //get node at specified index
    public Node<T> getNode(int index)
    {
        Node currentNode = head;
        for(int i = 0; i < index; i++)
            currentNode = currentNode.getNextNode();
        return currentNode;
    }

    //getters
    public Node<T> getHead() { return head; }
    public int getSize()
    {
        return size;
    }
}
