package edu.nwmissouri.animalList;

import edu.nwmissouri.animalList.Goat;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Test Aardvark using JUnit5
 *
 * @author Rohan Kondaveeti
 */
public class GoatTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public GoatTest() {
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
     * Test of speak method, of class Goat.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSpeak() throws Exception {
        String expected = "I'm an Goat. I'm a pet of Rohan.";
        var goat = new Goat("Rohan");
        goat.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of move method, of class Goat.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testMove() throws Exception {
        String expected = "I can walk with four legs.";
        var goat = new Goat("Rohan");
        goat.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of move method, of class Goat.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testEat() throws Exception {
        String expected = "I eat like Yumm yumm yumm!!";
        var goat = new Goat("Rohan");
        goat.eat();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of location method, of class Goat.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testChild() throws Exception {
        String expected = "I can give birth to one child at once.";
        var goat = new Goat("Rohan");
        goat.child();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of character method, of class Goat.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testColor() throws Exception {
        String expected = "I can be in black, brown and white color.";
        var goat = new Goat("Rohan");
        goat.color();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

  

}
