/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.animalList;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test PolarBear using JUnit5
 * 
 * @author Maddelavedu Pravallika(S545254)
 */
public class PolarBearTest {
 
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public PolarBearTest() {
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
     * Test speak method, of class PolarBear.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSpeak() throws Exception {
        String expected = "I'm Allie. I'm an PolarBear!";
        var polarbear = new PolarBear("Allie");
        polarbear.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test move method, of class PolarBear.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testMove() throws Exception {
        String expected = "Its head from side to side when it wants to play with another";
        var polarbear = new PolarBear("Allie");
        polarbear.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test custom function polarbearAddition()
     *
     * @throws Exception
     */
    @Test
    public void testPolarBEarAddition() throws Exception {
        
        // set up test, figure out expected by hand
        double first = 5.0;
        int second = 10;
        double expected = 15.0;

        // call function to get the actual
        var polarbear = new PolarBear("Allie");
        double actual = polarbear.getPolarBearAddition(first, second);

        // assertEquals(expected, actual);
        assertEquals(expected, actual);
    }

}
    

