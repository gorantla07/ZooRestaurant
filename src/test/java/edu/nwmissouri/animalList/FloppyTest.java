package edu.nwmissouri.animalList;

import edu.nwmissouri.animalList.Floppy;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Test Floppy using JUnit5
 *
 * @author S545243 Satheesh Eppalapelli
 */
public class FloppyTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public FloppyTest() {
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
     * Test of speak method, of class Floppy.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSpeak() throws Exception {
        String expected = "I'm an Floppy! I'm a pet of Satheesh.";
        var floppy = new Floppy("Satheesh");
        floppy.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of move method, of class Floppy.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testMove() throws Exception {
        String expected = "When I move, I walk, walk, walk.";
        var floppy = new Floppy("Satheesh");
        floppy.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of location method, of class Floppy.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testLocation() throws Exception {
        String expected = "I live in water!";
        var floppy = new Floppy("Satheesh");
        floppy.location();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of character method, of class Floppy.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testCharacter() throws Exception {
        String expected = "The Floppy Fish has a base of different shades of blue with yellow fins, and a yellow tail.";
        var floppy = new Floppy("Satheesh");
        floppy.character();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

  
}
