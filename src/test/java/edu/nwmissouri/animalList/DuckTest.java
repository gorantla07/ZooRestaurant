package edu.nwmissouri.animalList;

import java.io.ByteArrayOutputStream;
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
     private final PrintStream standardOut = System.out;
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
     * Test of speak method, of class Duck.
     */
    @Test
    public void testSpeak() {
        String expected = "I am Duck named manoj";
        var duck=new Duck("manoj");
        duck.speak();
         String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of eat method, of class Duck.
     */
    @Test
    public void testEat() {
        String expected = "I eat earthworms";
        var duck=new Duck("manoj");
        duck.eat();
         String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of move method, of class Duck.
     */
    @Test
    public void testMove() {
        String expected = "I use feet to swim";
        var duck=new Duck("manoj");
        duck.move();
         String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }
    
}
