import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;

public class RemoveDupsTester
{
    @Test
    public void testRemoveDupsInteger()
    {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(27);
        list.add(30);
        list.add(27);
        list.add(15);

        RemoveDups<Integer> test = new RemoveDups<>(list);
        list.remove(1);
        assertEquals(list, test.removeDups());
    }
    @Test
    public void testRemoveDups2Integer()
    {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(27);
        list.add(30);
        list.add(27);
        list.add(15);

        RemoveDups<Integer> test = new RemoveDups<>(list);
        list.remove(1);
        assertEquals(list, test.removeDups2());
    }
    @Test
    public void testRemoveDupsIntegerNoDups()
    {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(27);
        list.add(30);
        list.add(15);

        RemoveDups<Integer> test = new RemoveDups<>(list);
        assertEquals(list, test.removeDups());
    }
    @Test
    public void testRemoveDups2IntegerNoDups()
    {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(27);
        list.add(30);
        list.add(15);

        RemoveDups<Integer> test = new RemoveDups<>(list);
        assertEquals(list, test.removeDups2());
    }
    @Test
    public void testRemoveDupsArrayList()
    {
        ArrayList<Double> one = new ArrayList<>();
        one.add(2.5);
        ArrayList<Double> oneClone = new ArrayList<>();
        oneClone.add(2.5);
        ArrayList<Double> two = new ArrayList<>();
        two.add(3.9);
        two.add(100.0);

        LinkedList<ArrayList<Double>> list = new LinkedList<>();
        list.add(new ArrayList<>());
        list.add(one);
        list.add(oneClone);
        list.add(two);

        RemoveDups<ArrayList<Double>> test = new RemoveDups<>(list);
        list.remove(2);
        assertEquals(list, test.removeDups());
    }
    @Test
    public void testRemoveDups2ArrayList()
    {
        ArrayList<Double> one = new ArrayList<>();
        one.add(2.5);
        ArrayList<Double> oneClone = new ArrayList<>();
        oneClone.add(2.5);
        ArrayList<Double> two = new ArrayList<>();
        two.add(3.9);
        two.add(100.0);

        LinkedList<ArrayList<Double>> list = new LinkedList<>();
        list.add(new ArrayList<>());
        list.add(one);
        list.add(oneClone);
        list.add(two);

        RemoveDups<ArrayList<Double>> test = new RemoveDups<>(list);
        list.remove(2);
        assertEquals(list, test.removeDups2());
    }
    @Test
    public void testRemoveDupsArrayListNoDups()
    {
        ArrayList<Double> one = new ArrayList<>();
        one.add(2.5);
        ArrayList<Double> two = new ArrayList<>();
        two.add(3.9);
        two.add(100.0);

        LinkedList<ArrayList<Double>> list = new LinkedList<>();
        list.add(new ArrayList<>());
        list.add(one);
        list.add(two);

        RemoveDups<ArrayList<Double>> test = new RemoveDups<>(list);
        assertEquals(list, test.removeDups());
    }
    @Test
    public void testRemoveDups2ArrayListNoDups()
    {
        ArrayList<Double> one = new ArrayList<>();
        one.add(2.5);
        ArrayList<Double> two = new ArrayList<>();
        two.add(3.9);
        two.add(100.0);

        LinkedList<ArrayList<Double>> list = new LinkedList<>();
        list.add(new ArrayList<>());
        list.add(one);
        list.add(two);

        RemoveDups<ArrayList<Double>> test = new RemoveDups<>(list);
        assertEquals(list, test.removeDups2());
    }
}
