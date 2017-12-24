/*
    Simple Node class for MyLinkedList Implementation
 */
public class Node<T>
{
    private T data;
    private Node<T> next;

    //default constructor
    public Node()
    {
        data = null;
        next = null;
    }
    //constructor
    public Node(T data, Node<T> next)
    {
        this.data = data;
        this.next = next;
    }
    /*
    Getters and Setters
     */
    public T getData()
    {
        return data;
    }

    public Node<T> getNextNode()
    {
        return next;
    }

    public void setData(T data)
    {
        this.data = data;
    }

    public void setNext(Node<T> next)
    {
        this.next = next;
    }
}
