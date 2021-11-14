/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.animalList;

import edu.nwmissouri.animalList.Rabbit;
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
 * @author S545031
 */
public class RabbitTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public RabbitTest() {
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
     * Test of speak method, of class Rabbit.
     */
    @Test
    public void testSpeak() throws Exception {
        String expected = "I'm a Rabbit!";
        var rabbit = new Rabbit("Keerthana");
        rabbit.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of move method, of class Rabbit.
     */
    @Test
    public void testMove() throws Exception {
        String expected = "I hop";
        var rabbit = new Rabbit("");
        rabbit.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of favorite food method, of class Rabbit.
     */
    @Test
    public void testFavfood() throws Exception {
        String expected = "I Love eating Clover!!";
        var rabbit = new Rabbit("Keerthana");
        rabbit.favfood();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of skin type method, of class Rabbit.
     */
    @Test
    public void testSkintype() throws Exception {
        String expected = "I am very soft and fur";
        var rabbit = new Rabbit("Keerthana");
        rabbit.skintype();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of color method, of class Rabbit.
     */
    @Test
    public void testColor() throws Exception {
        String expected = "I can be White or Brown!!";
        var rabbit = new Rabbit("Keerthana");
        rabbit.color();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

 

 

}
