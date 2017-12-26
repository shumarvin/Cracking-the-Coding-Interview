import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DeleteMiddleNodeTester
{
    @Test
    public void deleteMiddleNodeTest2()
    {
        MyLinkedList list = new MyLinkedList(new Node<>(1,null));
        list.insertNode(new Node<>(77,null));
        list.insertNode(new Node<>(45,null));
        list.insertNode(new Node<>(90,null));
        list.insertNode(new Node<>(80,null));

        MyLinkedList expected = new MyLinkedList(new Node<>(1,null));
        expected.insertNode(new Node<>(45,null));
        expected.insertNode(new Node<>(90,null));
        expected.insertNode(new Node<>(80,null));
        DeleteMiddleNode test = new DeleteMiddleNode(list.getNode(2));
        test.deleteMiddleNode();

        for(int i = 0; i < expected.getSize(); i++)
            assertEquals(expected.getNode(i).getData(), list.getNode(i).getData());
    }
    @Test
    public void deleteMiddleNodeTest3()
    {
        MyLinkedList list = new MyLinkedList(new Node<>(1,null));
        list.insertNode(new Node<>(77,null));
        list.insertNode(new Node<>(45,null));
        list.insertNode(new Node<>(90,null));
        list.insertNode(new Node<>(80,null));

        MyLinkedList expected = new MyLinkedList(new Node<>(1,null));
        expected.insertNode(new Node<>(77,null));
        expected.insertNode(new Node<>(90,null));
        expected.insertNode(new Node<>(80,null));
        DeleteMiddleNode test = new DeleteMiddleNode(list.getNode(3));
        test.deleteMiddleNode();

        for(int i = 0; i < expected.getSize(); i++)
            assertEquals(expected.getNode(i).getData(), list.getNode(i).getData());
    }
    @Test
    public void deleteMiddleNodeTest4()
    {
        MyLinkedList list = new MyLinkedList(new Node<>(1,null));
        list.insertNode(new Node<>(77,null));
        list.insertNode(new Node<>(45,null));
        list.insertNode(new Node<>(90,null));
        list.insertNode(new Node<>(80,null));

        MyLinkedList expected = new MyLinkedList(new Node<>(1,null));
        expected.insertNode(new Node<>(77,null));
        expected.insertNode(new Node<>(45,null));
        expected.insertNode(new Node<>(80,null));
        DeleteMiddleNode test = new DeleteMiddleNode(list.getNode(4));
        test.deleteMiddleNode();

        for(int i = 0; i < expected.getSize(); i++)
            assertEquals(expected.getNode(i).getData(), list.getNode(i).getData());
    }
}
