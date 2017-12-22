import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class RemoveDupsTester
{
    @Test
    public void testRemoveDups()
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

}
