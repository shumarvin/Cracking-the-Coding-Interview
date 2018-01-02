import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackArrayTester
{
    /*
        Testing push
     */
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
        assertEquals(0, test.getStackHeads()[0]);
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
        assertEquals(5, test.getStackHeads()[1]);
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
        assertEquals(10, test.getStackHeads()[2]);
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
        assertEquals(1, test.getStackHeads()[0]);
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
        assertEquals(6, test.getStackHeads()[1]);
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
        assertEquals(11, test.getStackHeads()[2]);
    }
    @Test
    public void testFillEntireStack()
    {
        StackArray test = new StackArray(5);
        try
        {
            for (int i = 1; i <= 5; i++)
                test.push(i, 1);
            for (int i = 1; i <= 5; i++)
                test.push(i, 2);
            for (int i = 1; i <= 5; i++)
                test.push(i, 3);
        } catch(StackArray.FullStackException e)
        {
            e.printStackTrace();
        }
        int[] expected = new int[] {1,2,3,4,5,1,2,3,4,5,1,2,3,4,5};
        int[] expectedHeads = new int[] {4,9,14};
        assertArrayEquals(expected, test.getStackArray());
        assertArrayEquals(expectedHeads,test.getStackHeads());
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

    /*
        Testing pop
     */
    @Test
    public void testPopEmptyStackOne()
    {
        StackArray test = new StackArray(5);
        int pop = -1;
        try
        {
            test.push(1, 1);
            pop = test.pop(1);

        }catch(StackArray.FullStackException e)
        {
            e.printStackTrace();
        }catch(StackArray.EmptyStackException e)
        {
            e.printStackTrace();
        }
        assertEquals(1, pop);
        assertAll(()-> assertEquals(0, test.getStackArray()[0]),
                ()-> assertEquals(-1, test.getStackHeads()[0]));

    }
    @Test
    public void testPopEmptyStackTwo()
    {
        StackArray test = new StackArray(5);
        int pop = -1;
        try
        {
            test.push(1, 2);
            pop = test.pop(2);

        }catch(StackArray.FullStackException e)
        {
            e.printStackTrace();
        }catch(StackArray.EmptyStackException e)
        {
            e.printStackTrace();
        }
        assertEquals(1, pop);
        assertAll(()-> assertEquals(1, test.getStackArray()[5]),
                ()-> assertEquals(-1, test.getStackHeads()[1]));

    }
    @Test
    public void testPopEmptyStackThree()
    {
        StackArray test = new StackArray(5);
        int pop = -1;
        try
        {
            test.push(1, 3);
            pop = test.pop(3);

        }catch(StackArray.FullStackException e)
        {
            e.printStackTrace();
        }catch(StackArray.EmptyStackException e)
        {
            e.printStackTrace();
        }
        assertEquals(1, pop);
        assertAll(()-> assertEquals(1, test.getStackArray()[10]),
                ()-> assertEquals(-1, test.getStackHeads()[2]));

    }
    @Test
    public void testPopStackOne()
    {
        StackArray test = new StackArray(5);
        int pop = -1;
        try
        {
            test.push(1, 1);
            test.push(2, 1);
            pop = test.pop(1);

        }catch(StackArray.FullStackException e)
        {
            e.printStackTrace();
        }catch(StackArray.EmptyStackException e)
        {
            e.printStackTrace();
        }
        assertEquals(2, pop);
        assertAll(()-> assertEquals(1, test.getStackArray()[0]),
                ()-> assertEquals(0, test.getStackHeads()[0]));
    }
    @Test
    public void testPopStackTwo()
    {
        StackArray test = new StackArray(5);
        int pop = -1;
        try
        {
            test.push(1, 2);
            test.push(2, 2);
            pop = test.pop(2);

        }catch(StackArray.FullStackException e)
        {
            e.printStackTrace();
        }catch(StackArray.EmptyStackException e)
        {
            e.printStackTrace();
        }
        assertEquals(2, pop);
        assertAll(()-> assertEquals(1, test.getStackArray()[5]),
                ()-> assertEquals(5, test.getStackHeads()[1]));
    }
    @Test
    public void testPopStackThree()
    {
        StackArray test = new StackArray(5);
        int pop = -1;
        try
        {
            test.push(1, 3);
            test.push(2, 3);
            pop = test.pop(3);

        }catch(StackArray.FullStackException e)
        {
            e.printStackTrace();
        }catch(StackArray.EmptyStackException e)
        {
            e.printStackTrace();
        }
        assertEquals(2, pop);
        assertAll(()-> assertEquals(1, test.getStackArray()[10]),
                ()-> assertEquals(10, test.getStackHeads()[2]));
    }
    @Test
    public void testFillEntireStackAndPopOne()
    {
        StackArray test = new StackArray(5);
        int stackOne = -1;
        int stackTwo = -1;
        int stackThree = -1;
        try
        {
            for (int i = 1; i <= 5; i++)
                test.push(i, 1);
            for (int i = 1; i <= 5; i++)
                test.push(i, 2);
            for (int i = 1; i <= 5; i++)
                test.push(i, 3);

            stackOne = test.pop(1);
            stackTwo = test.pop(2);
            stackThree = test.pop(3);
        }catch(StackArray.FullStackException e)
        {
            e.printStackTrace();
        }catch(StackArray.EmptyStackException e)
        {
            e.printStackTrace();
        }
        int[] expected = new int[] {1,2,3,4,0,1,2,3,4,0,1,2,3,4,0};
        int[] expectedHeads = new int[] {3,8,13};
        assertEquals(5,stackOne);
        assertEquals(5,stackTwo);
        assertEquals(5,stackThree);
        assertArrayEquals(expected, test.getStackArray());
        assertArrayEquals(expectedHeads,test.getStackHeads());
    }
    @Test
    public void testPopEmptyStackOneException()
    {
        StackArray test = new StackArray(5);
        assertThrows(StackArray.EmptyStackException.class, ()->{test.pop(1);});
    }
    @Test
    public void testPopEmptyStackTwoException()
    {
        StackArray test = new StackArray(5);
        assertThrows(StackArray.EmptyStackException.class, ()->{test.pop(2);});
    }
    @Test
    public void testPopEmptyStackThreeException()
    {
        StackArray test = new StackArray(5);
        assertThrows(StackArray.EmptyStackException.class, ()->{test.pop(3);});
    }
}
