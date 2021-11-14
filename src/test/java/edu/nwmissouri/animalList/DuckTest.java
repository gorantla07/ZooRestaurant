package edu.nwmissouri.animalList;

import edu.nwmissouri.animalList.Duck;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Sandhya Nidigonda
 */
public class DuckTest {
    
       private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    public DuckTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    
    @AfterEach
    public void tearDown() {
    }

/**
     * Test speak method, of class Duck.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSpeak() throws Exception {
        String expected = "I am Duck named Sandhya";
        var duck = new Duck("Sandhya");
        duck.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test move method, of class Duck.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testMove() throws Exception {
        String expected = "I use feet to swim";
        var duck = new Duck("Sandhya");
        duck.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test custom function duckEggsProduction()
     *
     * @throws Exception
     */
    @Test
    public void duckEggsProduction() throws Exception {
        
        
       int monthlyEggsProduction=5;
         int monthsinYear =12;
         int expected = 60;
        
        var duck = new Duck("Sandhya");
        int  actual = duck.duckEggsProduction(monthlyEggsProduction, monthsinYear);

        
        assertEquals(expected, actual);
    }

}
