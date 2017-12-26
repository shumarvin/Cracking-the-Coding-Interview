public class DeleteMiddleNode<T>
{
    private Node<T> middleNode;

    public DeleteMiddleNode(Node<T> node)
    {
        middleNode = node;
    }
    /*
        Deletes middlenode from its linked list. middleNode
        cannot be the first or last node of the last, but
        it can be any node in between.
        Algorithm: Simply copy the next node's
        info into middleNode.
     */
    public void deleteMiddleNode()
    {
        Node<T> nextNode = middleNode.getNextNode();
        middleNode.setData(nextNode.getData());
        middleNode.setNext(nextNode.getNextNode());
        nextNode = null;
    }
}
