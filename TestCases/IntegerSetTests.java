import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class IntegerSetTests {
    IntegerSet testSet;

    @Before

    public void setUp(){
        testSet = new IntegerSet();
    }

    @Test
    public void testInsertNotThere(){
        //check number is not already in the set
        assertEquals(testSet.size(), 0);
        //insert a number

        //check the number is in the set
    }
}
