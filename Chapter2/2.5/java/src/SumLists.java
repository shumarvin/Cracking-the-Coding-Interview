public class SumLists
{
    private MyLinkedList<Integer> list1;
    private MyLinkedList<Integer> list2;

    //constructor
    public SumLists(MyLinkedList list1, MyLinkedList list2)
    {
        this.list1 = list1;
        this.list2 = list2;
    }

    /*
    Sums the two lists together, assuming the digits are
    stored in reverse order
    @return sum the sum in reversed order
     */
    public MyLinkedList doSumLists()
    {
        MyLinkedList sum = new MyLinkedList();
        if(list1.getSize() >= list2.getSize())
            doSumListsHelper(sum, list1, list2);
        else
            doSumListsHelper(sum,list2,list1);
        return sum;
    }
    /*
    Helper method to add each digit together
    Assumes list2.size() <= list1.size()
     */
    private void doSumListsHelper(MyLinkedList<Integer> sum, MyLinkedList<Integer> list1, MyLinkedList<Integer> list2)
    {
        //get carrybit ready
        int carrybit = 0;

        //since list2 is smaller, add all of its digits first
        for(int i = 0; i < list2.getSize(); i++)
        {
            int node2 = list2.getNode(i).getData();
            int node1 = list1.getNode(i).getData();
            //if you need to carry
            if(node2 + node1 + carrybit >= 10)
            {
                //subtract 10 from resulting sum and set carrybit to 1
                sum.insertNode(new Node(node2 + node1 - 10 + carrybit, null));
                carrybit = 1;
            }
            else
            {
                //add sum together and reset carrybit
                sum.insertNode(new Node(node2 + node1 + carrybit, null));
                carrybit = 0;
            }
        }

        //go through and include rest of list1's digits
        for(int i = list2.getSize(); i < list1.getSize(); i++)
        {
            int node1 = list1.getNode(i).getData();
            //make sure to include carrybit if necessary
            if(carrybit == 1)
            {
                if(node1+ carrybit >= 10)
                {
                    //insert 0 since only case is if digit is 9
                    //don't reset carry
                    sum.insertNode(new Node(0, null));
                }
                else
                {
                    sum.insertNode(new Node(node1 + carrybit, null));
                    carrybit = 0;
                }
            }
            else
                sum.insertNode(new Node(node1, null));
        }
        //add extra 1 if necessary
        if(carrybit == 1)
            sum.insertNode(new Node(carrybit, null));
    }
    /*
        Method to add lists together if lists are
        not in reverse order. Unlike the reverse
        method, this method will be recursive,
        as you need to go to the last digit place,
        add them, and then return it back
        @return sum the sum in regular order
    */
    public MyLinkedList doSumListsNonReverse()
    {
        MyLinkedList sum = new MyLinkedList();

        /*
            Whichever list is smaller, pad it with
            zeroes in the front, then add the two
            lists together
         */
        if(list1.getSize() >= list2.getSize())
            padZeroes(list2, list1.getSize() - list2.getSize());
        else
            padZeroes(list1, list2.getSize() - list1.getSize());

        //call recursive helper
        int finalCarryBit = doSumListsNonReverseHelper(sum, list1.getHead(), list2.getHead());

        //add extra 1 if necessary
        if(finalCarryBit == 1)
            sum.setNewHead(new Node(1, null));
        return sum;
    }
    /*
        Recursive helper method for doSumListNonReverse
        WIll recurse through both lists until it ends up at
        the ones place. It will then add the ones place, and
        recurse back up. Assumes list1 and list2 are the same size.
        @return carrybit the carry bit from the previous digit
        place's calculation
     */
    private int doSumListsNonReverseHelper(MyLinkedList<Integer> sum, Node<Integer> node1, Node<Integer> node2)
    {
        int carrybit = 0;
        int num1 = node1.getData();
        int num2 = node2.getData();

        //base case: one's place
        if(node1.getNextNode() == null)
        {
            //make sure to set carrybit if necessary
            if(num1 + num2 >= 10)
            {
                sum.insertNode(new Node(num1 + num2 - 10, null));
                carrybit = 1;
            }
            else
                sum.insertNode(new Node(num1 + num2, null));
        }
        else
        {
            //recursive step
            carrybit = doSumListsNonReverseHelper(sum, node1.getNextNode(), node2.getNextNode());

            //once recursion returns, add current node's digits and set carrybit if necessary
            if(num1 + num2 + carrybit >= 10)
            {
                sum.setNewHead(new Node(num1 + num2 + carrybit - 10, null));
                carrybit = 1;
            }
            else
            {
                sum.setNewHead(new Node(num1 + num2 + carrybit, null));
                carrybit = 0;
            }
        }
        return carrybit;
    }

    /*
        Helper method to pad list with specified number of zeroes
     */
    private void padZeroes(MyLinkedList<Integer> list, int numZeroes)
    {
        for(int i = 0; i < numZeroes; i++)
            list.setNewHead(new Node(0, null));
    }
}
