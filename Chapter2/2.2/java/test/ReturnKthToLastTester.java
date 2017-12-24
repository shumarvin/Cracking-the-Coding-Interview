import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ReturnKthToLastTester
{
    @Test
    public void testReturn1stToLast()
    {
        MyLinkedList list = new MyLinkedList(new Node<>(1,null));
        list.insertNode(new Node<>(77,null));
        list.insertNode(new Node<>(45,null));
        list.insertNode(new Node<>(90,null));
        list.insertNode(new Node<>(80,null));
        ReturnKthToLast test = new ReturnKthToLast(list);
        assertEquals(90, (int)test.returnKthToLast(1).getData());
    }
    @Test
    public void testReturn1stToLastRecursive()
    {
         MyLinkedList list = new MyLinkedList(new Node<>(1,null));
        list.insertNode(new Node<>(77,null));
        list.insertNode(new Node<>(45,null));
        list.insertNode(new Node<>(90,null));
        list.insertNode(new Node<>(80,null));
        ReturnKthToLast test = new ReturnKthToLast(list);
        assertEquals(90, (int)test.returnKThToLastRecursive(1).getData());
    }
    @Test
    public void testReturn2ndToLast()
    {
        MyLinkedList list = new MyLinkedList(new Node<>(1,null));
        list.insertNode(new Node<>(77,null));
        list.insertNode(new Node<>(45,null));
        list.insertNode(new Node<>(90,null));
        list.insertNode(new Node<>(80,null));
        ReturnKthToLast test = new ReturnKthToLast(list);
        assertEquals(45, (int)test.returnKthToLast(2).getData());
    }
    @Test
    public void testReturn2ndToLastRecursive()
    {
         MyLinkedList list = new MyLinkedList(new Node<>(1,null));
        list.insertNode(new Node<>(77,null));
        list.insertNode(new Node<>(45,null));
        list.insertNode(new Node<>(90,null));
        list.insertNode(new Node<>(80,null));
        ReturnKthToLast test = new ReturnKthToLast(list);
        assertEquals(45, (int)test.returnKThToLastRecursive(2).getData());
    }
    @Test
    public void testReturn0thToLast()
    {
        MyLinkedList list = new MyLinkedList(new Node<>(1,null));
        list.insertNode(new Node<>(77,null));
        list.insertNode(new Node<>(45,null));
        list.insertNode(new Node<>(90,null));
        list.insertNode(new Node<>(80,null));
        ReturnKthToLast test = new ReturnKthToLast(list);
        assertEquals(80, (int)test.returnKthToLast(0).getData());
    }
    @Test
    public void testReturn0thToLastRecursive()
    {
         MyLinkedList list = new MyLinkedList(new Node<>(1,null));
        list.insertNode(new Node<>(77,null));
        list.insertNode(new Node<>(45,null));
        list.insertNode(new Node<>(90,null));
        list.insertNode(new Node<>(80,null));
        ReturnKthToLast test = new ReturnKthToLast(list);
        assertEquals(80, (int)test.returnKThToLastRecursive(0).getData());
    }
    @Test
    public void testReturn1stElement()
    {
        MyLinkedList list = new MyLinkedList(new Node<>(1,null));
        list.insertNode(new Node<>(77,null));
        list.insertNode(new Node<>(45,null));
        list.insertNode(new Node<>(90,null));
        list.insertNode(new Node<>(80,null));
        ReturnKthToLast test = new ReturnKthToLast(list);
        assertEquals(1, (int)test.returnKthToLast(4).getData());
    }
    @Test
    public void testReturn1stElementRecursive()
    {
        MyLinkedList list = new MyLinkedList(new Node<>(1,null));
        list.insertNode(new Node<>(77,null));
        list.insertNode(new Node<>(45,null));
        list.insertNode(new Node<>(90,null));
        list.insertNode(new Node<>(80,null));
        ReturnKthToLast test = new ReturnKthToLast(list);
        assertEquals(1, (int)test.returnKThToLastRecursive(4).getData());
    }
}
