import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class SumListsTester
{
    @Test
    public void testSumList3()
    {
        MyLinkedList list1 = new MyLinkedList(new Node<>(1,null));
        list1.insertNode(new Node<>(7,null));
        list1.insertNode(new Node<>(8,null));

        MyLinkedList list2 = new MyLinkedList(new Node<>(0,null));
        list2.insertNode(new Node<>(2,null));
        list2.insertNode(new Node<>(9,null));

        MyLinkedList expected = new MyLinkedList(new Node<>(1,null));
        expected.insertNode(new Node<>(7,null));
        expected.insertNode(new Node<>(9,null));
        expected.insertNode(new Node<>(1,null));

        SumLists test = new SumLists(list1, list2);
        MyLinkedList actual = test.doSumLists();

        for(int i = 0; i < expected.getSize(); i++)
            assertEquals(expected.getNode(i).getData(), actual.getNode(i).getData());
    }
    @Test
    public void testSumList1()
    {
        MyLinkedList list1 = new MyLinkedList(new Node<>(7,null));

        MyLinkedList list2 = new MyLinkedList(new Node<>(1,null));

        MyLinkedList expected = new MyLinkedList(new Node<>(8,null));

        SumLists test = new SumLists(list1, list2);
        MyLinkedList actual = test.doSumLists();

        for(int i = 0; i < expected.getSize(); i++)
            assertEquals(expected.getNode(i).getData(), actual.getNode(i).getData());
    }
    @Test
    public void testSumList2()
    {
        MyLinkedList list1 = new MyLinkedList(new Node<>(2,null));
        list1.insertNode(new Node<>(2,null));

        MyLinkedList list2 = new MyLinkedList(new Node<>(3,null));
        list2.insertNode(new Node<>(2,null));

        MyLinkedList expected = new MyLinkedList(new Node<>(5,null));
        expected.insertNode(new Node<>(4,null));

        SumLists test = new SumLists(list1, list2);
        MyLinkedList actual = test.doSumLists();

        for(int i = 0; i < expected.getSize(); i++)
            assertEquals(expected.getNode(i).getData(), actual.getNode(i).getData());
    }
}
