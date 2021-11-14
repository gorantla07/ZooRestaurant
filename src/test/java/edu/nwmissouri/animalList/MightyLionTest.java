package edu.nwmissouri.animalList;

import edu.nwmissouri.animalList.MightyLion;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Test MightyLion using JUnit5
 *
 * @author Vijay Kumar Chunchu
 */
public class MightyLionTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public MightyLionTest() {
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
     * Test speak method, of class MightyLion.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSpeak() throws Exception {
        String expected = "I am cango Lion. I will roar.";
        var mightyLion = new MightyLion("cango");
        mightyLion.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * This is Test of  move method, of class MightyLion.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testMove() throws Exception {
        String expected = "I will Walk and run";
        var mightylion = new MightyLion("cango");
        mightylion.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * this is  Test  of custom function mightylionAddition()
     *
     * @throws Exception
     */
    @Test
    public void testMightyLionAddition() throws Exception {
        
        // set up test, figure out expected by hand
        double first = 3.0;
        int second = 6;
        double expected = 9.0;

        // call function to get the actual
        var mightylion = new MightyLion("cango");
        double actual = mightylion.getMightyLionAddition(first, second);

        // assertEquals(expected, actual);
        assertEquals(expected, actual);
    }

}
