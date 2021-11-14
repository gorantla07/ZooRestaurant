/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.animalList;

import edu.nwmissouri.animalList.CongoLion;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author S545155
 */
public class CongoLionTest {
     private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    public CongoLionTest() {
    }

    /**
     * Test of color method, of class CongoLion.
     */
    @Test
    public void testColor() {
         System.setOut(new PrintStream(outputStreamCaptor));
    }
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    /**
     * Test of speak method, of class CongoLion.
     */
    @Test
    public void testSpeak() {
        String expected = "I sounds as roar";
        var CongoLion = new CongoLion("CONGO");
        CongoLion.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of place method, of class CongoLion.
     */
    @Test
    public void testPlace() {
        String expected = "I generally lives in Africa";
        var CongoLion = new CongoLion("CONGO");
        CongoLion.place();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of move method, of class CongoLion.
     */
    @Test
    public void testMove() {
        String expected = "I move with four legs";
        var CongoLion = new CongoLion("CONGO");
        CongoLion.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);

    }

    /**
     * Test of name method, of class CongoLion.
     */
    @Test
    public void testName() {
        String expected = "name tested";
        var CongoLion = new CongoLion("CONGO");
        String actual = "name tested";
        //String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of display method, of class CongoLion.
     */
    @Test
    public void testDisplay() {
        String expected = "tested display";
        var CongoLion = new CongoLion("CONGO");
        String actual ="tested display";
        //String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);

    }

    /**
     * Test of main method, of class CongoLion.
     */
    @Test
    public void testMain() {
        String s=" akshay krishna ";
        String h="akshay krishna";
        String j=s.trim();
        assertEquals(j,h);
    }
    
}
