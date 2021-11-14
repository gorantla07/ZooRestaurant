package edu.nwmissouri.animalList;

import edu.nwmissouri.animalList.Aardvark;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test Aardvark using JUnit5
 *
 * @author Denise Case
 */
public class AardvarkTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    /**
     * Test speak method, of class Aardvark.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSpeak() throws Exception {
        String expected = "I'm Allie. I'm an Aardvark!";
        var aardvark = new Aardvark("Allie");
        aardvark.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test move method, of class Aardvark.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testMove() throws Exception {
        String expected = "When I move, I walk, walk, walk.";
        var aardvark = new Aardvark("Allie");
        aardvark.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test custom function ardvarkAddition()
     *
     * @throws Exception
     */
    @Test
    public void testAardvarkAddition() throws Exception {

        // set up test, figure out expected by hand
        double first = 5.0;
        int second = 10;
        double expected = 15.0;

        // call function to get the actual
        var aardvark = new Aardvark("Allie");
        double actual = aardvark.getAardvarkAddition(first, second);

        assertEquals(expected, actual);
    }

}
