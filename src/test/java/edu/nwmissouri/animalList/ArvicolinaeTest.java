package edu.nwmissouri.animalList;

import edu.nwmissouri.animalList.Arvicolinae;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;



/**
 *Test ArvicolinaeTest using JUnit5
 * 
 * 
 * @author NIKHIL KUMAR AKARAPU
 */

//test class
public class ArvicolinaeTest {
    
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public ArvicolinaeTest() {
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
     * Test speak method, of class ArvicolinaeTest.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSpeak() throws Exception {
        String expected = "I'm an Arvicolinae!";
        var arvicolinae = new Arvicolinae("Allie");
        arvicolinae.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test move method, of class ArvicolinaeTest.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testMove() throws Exception {
        String expected = "When I move, I walk, walk, walk.";
        var arvicolinae = new Arvicolinae("Allie");
        arvicolinae.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test custom function ArvicolinaeAddition()
     *
     * @throws Exception
     */
    @Test
    public void testArvicolinaeAddition() throws Exception {
        
        // set up test, figure out expected by hand
        double first = 5.0;
        int second = 10;
        double expected = 15.0;

        // call function to get the actual
        var arvicolinae = new Arvicolinae("Nikhil");
        double actual = arvicolinae.getArvicolinaeAddition(first, second);

        // assertEquals(expected, actual);
        assertEquals(expected, actual);
    }

    
}