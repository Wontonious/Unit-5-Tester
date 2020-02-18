import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class IntegerSetTests {
    IntegerSet testSet;

    @Before

    public void setUp(){
        testSet = new IntegerSet();
    }

    @Test
    public void testInsertNotThere() {
        //check number is not already in the set
        assertEquals(testSet.size(), 0);
        //insert a number
        testSet.insert(3);
        //check the number is in the set
        assertEquals(testSet.size(), 1);
        assertTrue(testSet.contains(3));
    }
    @Test
    public void insertAlreadyThere(){
        //check number is already in the set
        assertEquals(testSet.size(),1);
    }

    @Test
    public void removeNotThere(){
        //check number is not in the set
        assertEquals(testSet.size(), 0);
    }

    @Test
    public void removeAlreadyThere(){

        //check number is in the set
        assertEquals(testSet.size(), 1);
        //remove the number
        testSet.remove(3);
        //check the number is not in the set
        assertEquals(testSet.size(),0);
        assertFalse(testSet.contains(3));
    }
}
