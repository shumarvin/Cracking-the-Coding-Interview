import com.URLify.URLify;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.URLify.URLify;
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
}
