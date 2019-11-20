package nuigalway.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void usernameTest()
    {
    		String[] mod = {"Maths", "Chemistry"};
        Students student = new Students("Anna", "21","29-06-1998", "12568", "4BCT",mod);
        String expected = "Anna21";
        assertEquals(expected, student.getUsername());
        
    }
}