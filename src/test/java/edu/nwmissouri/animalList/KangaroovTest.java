package edu.nwmissouri.animalList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
/**
 *
 * @author Satya Sai Vinuthna Tummala
 */
public class KangaroovTest {
   private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public KangaroovTest() {
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
     * Test of speak method, of class Kangaroo.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSpeak() throws Exception {
        String expected = "I'm Allie. I'm a Kangaroo!";
        var Kangaroov = new Kangaroov("Allie");
        Kangaroov.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of move method, of class Kangaroov.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testMove() throws Exception {
        String expected = "I will move with four legs :)";
        var Kangaroov = new Kangaroov("Allie");
         Kangaroov.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

} 

