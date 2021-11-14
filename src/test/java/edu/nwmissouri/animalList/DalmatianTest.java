package edu.nwmissouri.animalList;

import edu.nwmissouri.animalList.Dalmatian;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test Dalmatian using JUnit5
 *
 * @author Nikhil Porika
 */
public class DalmatianTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    /**
     * Test speak method, of class Dalmatian.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSpeak() throws Exception {
        String expected = "I am Dalmatian,I can speak";
        var dalmatian = new Dalmatian("Rolly");
        dalmatian.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test move method, of class Dalmatian.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testMove() throws Exception {
        String expected = "I am Dalmatian,I can run, run , run";
        var dalmatian = new Dalmatian("Rolly");
        dalmatian.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test custom function DalmatianAddition()
     *
     * @throws Exception
     */
    @Test
    public void testDalmatianAddition() throws Exception {

        // set up test, figure out expected by hand
        double first = 5.0;
        int second = 10;
        double expected = 15.0;

        // call function to get the actual
        var dalmatian = new Dalmatian("Rolly");
        double actual = dalmatian.getDalmatianaddition(first, second);

        assertEquals(expected, actual);
    }

}
