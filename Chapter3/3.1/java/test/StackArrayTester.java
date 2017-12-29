import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class StackArrayTester
{
    @Test
    public void testPushEmptyStackOne()
    {
        StackArray test = new StackArray(5);
        try
        {
            test.push(1, 1);
        }catch(StackArray.FullStackException e)
        {
            e.printStackTrace();
        }
        assertEquals(1, test.getStackArray()[0]);
    }
    @Test
    public void testPushEmptyStackTwo()
    {
        StackArray test = new StackArray(5);
        try
        {
            test.push(1,2);
        } catch (StackArray.FullStackException e)
        {
            e.printStackTrace();
        }
        assertEquals(1, test.getStackArray()[5]);
    }
    @Test
    public void testPushEmptyStackThree()
    {
        StackArray test = new StackArray(5);
        try
        {
            test.push(1,3);
        } catch (StackArray.FullStackException e)
        {
            e.printStackTrace();
        }
        assertEquals(1, test.getStackArray()[10]);
    }
    @Test
    public void testPushStackOne()
    {
        StackArray test = new StackArray(5);
        try
        {
            test.push(1,1);
            test.push(2,1);
        } catch (StackArray.FullStackException e)
        {
            e.printStackTrace();
        }

        assertEquals(1, test.getStackArray()[0]);
        assertEquals(2, test.getStackArray()[1]);
    }
    @Test
    public void testPushStackTwo()
    {
        StackArray test = new StackArray(5);
        try
        {
            test.push(1,2);
            test.push(2,2);
        } catch (StackArray.FullStackException e)
        {
            e.printStackTrace();
        }

        assertEquals(1, test.getStackArray()[5]);
        assertEquals(2, test.getStackArray()[6]);
    }
    @Test
    public void testPushStackThree()
    {
        StackArray test = new StackArray(5);
        try
        {
            test.push(1,3);
            test.push(2,3);
        } catch (StackArray.FullStackException e)
        {
            e.printStackTrace();
        }

        assertEquals(1, test.getStackArray()[10]);
        assertEquals(2, test.getStackArray()[11]);
    }
    @Test
    public void testPushFullStackOne()
    {
        StackArray test = new StackArray(5);
        try
        {
            for (int i = 1; i <= 5; i++)
                test.push(i, 1);
        } catch(StackArray.FullStackException e)
        {
            e.printStackTrace();
        }
        assertThrows(StackArray.FullStackException.class, ()->{test.push(6,1);});
    }
    @Test
    public void testPushFullStackTwo()
    {
        StackArray test = new StackArray(5);
        try
        {
            for (int i = 1; i <= 5; i++)
                test.push(i, 2);
        } catch(StackArray.FullStackException e)
        {
            e.printStackTrace();
        }
        assertThrows(StackArray.FullStackException.class, ()->{test.push(6,2);});
    }
    @Test
    public void testPushFullStackThree()
    {
        StackArray test = new StackArray(5);
        try
        {
            for (int i = 1; i <= 5; i++)
                test.push(i, 3);
        } catch(StackArray.FullStackException e)
        {
            e.printStackTrace();
        }
        assertThrows(StackArray.FullStackException.class, ()->{test.push(6,3);});
    }
}
