package edu.nwmissouri.animalList;

import edu.nwmissouri.animalList.SunBearGroup;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Akhil Mulamalla
 */
public class SiberianTigerGroupTest {

   /**
     * Test of create method, of class SunBearGroup.
     */
    @Test
    public void testGroupCreate() {
        int expectedSize = 3;
        int actualSize = SunBearGroup.create();
        assertEquals(expectedSize, actualSize);
    }

    /**
     * Test of run method, of class SunBearGroup.
     */
    @Test
    public void testGroupRun() {
        SunBearGroup.create();
        SunBearGroup.run();
        assertTrue(true);
    }

}
