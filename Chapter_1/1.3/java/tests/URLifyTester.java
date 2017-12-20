import com.URLify.URLify;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class URLifyTester
{
    @Test
    public void testCountSpaces1()
    {
        URLify test = new URLify("test one   ",8);
        assertEquals(test.countSpaces(),1);
    }

    @Test
    public void testCountSpaces2()
    {
        URLify test = new URLify("test two test   ",13);
        assertEquals(test.countSpaces(),2);
    }
    @Test
    public void testCountSpaces0()
    {
        URLify test = new URLify("testzero   ",8);
        assertEquals(test.countSpaces(),0);
    }

    @Test
    public void testdoURLify1()
    {
        URLify test = new URLify("test one  ",8);
        assertArrayEquals("test%20one".toCharArray(), test.doURLify());
    }
    @Test
    public void testdoURLify2()
    {
        URLify test = new URLify("test two test    ",13);
        assertArrayEquals("test%20two%20test".toCharArray(), test.doURLify());
    }
    @Test
    public void testdoURLify0()
    {
        URLify test = new URLify("testzero",8);
        assertArrayEquals("testzero".toCharArray(), test.doURLify());
    }
}
