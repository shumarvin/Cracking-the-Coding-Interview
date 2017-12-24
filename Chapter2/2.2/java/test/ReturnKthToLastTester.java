import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

public class ReturnKthToLastTester
{
    @Test
    public void testReturn1stToLast()
    {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,77,45,90,80));
        ReturnKthToLast<Integer> test = new ReturnKthToLast<>(list);
        assertEquals(90, (int)test.returnKthToLast(1));
    }
    @Test
    public void testReturn1stToLastRecursive()
    {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,77,45,90,80));
        ReturnKthToLast<Integer> test = new ReturnKthToLast<>(list);
        assertEquals(90, (int)test.returnKThToLastRecursive(1));
    }
    @Test
    public void testReturn2ndToLast()
    {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,77,45,90,80));
        ReturnKthToLast<Integer> test = new ReturnKthToLast<>(list);
        assertEquals(45, (int)test.returnKthToLast(2));
    }
    @Test
    public void testReturn2ndToLastRecursive()
    {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,77,45,90,80));
        ReturnKthToLast<Integer> test = new ReturnKthToLast<>(list);
        assertEquals(45, (int)test.returnKThToLastRecursive(2));
    }
    @Test
    public void testReturn0thToLast()
    {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,77,45,90,80));
        ReturnKthToLast<Integer> test = new ReturnKthToLast<>(list);
        assertEquals(80, (int)test.returnKthToLast(0));
    }
    @Test
    public void testReturn0thToLastRecursive()
    {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,77,45,90,80));
        ReturnKthToLast<Integer> test = new ReturnKthToLast<>(list);
        assertEquals(80, (int)test.returnKThToLastRecursive(0));
    }
    @Test
    public void testReturn1stElement()
    {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,77,45,90,80));
        ReturnKthToLast<Integer> test = new ReturnKthToLast<>(list);
        assertEquals(1, (int)test.returnKthToLast(4));
    }
    @Test
    public void testReturn1stElementRecursive()
    {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,77,45,90,80));
        ReturnKthToLast<Integer> test = new ReturnKthToLast<>(list);
        assertEquals(1, (int)test.returnKThToLastRecursive(4));
    }
}
