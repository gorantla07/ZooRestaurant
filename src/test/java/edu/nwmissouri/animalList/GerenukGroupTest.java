package edu.nwmissouri.animalList;
import edu.nwmissouri.animalList.GerenukGroup;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test Gerenuk Group.
 * 
 * @author Tejaswini Challa
 */
public class GerenukGroupTest {
   


    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of create method, of class GerenukGroup.
     */
    @Test
    public void testGroupCreate() {
        int expectedSize = 3;
        int actualSize = GerenukGroup.create();
        assertEquals(expectedSize, actualSize);
    }

    /**
     * Test of run method, of class GerenukGroup.
     */
    @Test
    public void testGroupRun() {
        GerenukGroup.create();
        GerenukGroup.run();
        
    }

}
