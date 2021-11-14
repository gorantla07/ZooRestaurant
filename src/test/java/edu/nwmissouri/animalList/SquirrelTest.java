/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.animalList;

import edu.nwmissouri.animalList.Squirrel;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Squirrel test using JUnit
 * @author Nithin Reddy Kumbham
 */
public class SquirrelTest {
    
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    
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
     * Test of age method, of class Squirrel.
     */
    @Test
    public void testAge() throws Exception {
        String expected = "My age is 6 years";
        var squirrel = new Squirrel("Pinto");
        squirrel.age();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of height method, of class Squirrel.
     */
    @Test
    public void testHeight() {
        String expected = "My height is 14.3 cm";
        var squirrel = new Squirrel("Pinto");
        squirrel.height();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of weight method, of class Squirrel.
     */
    @Test
    public void testWeight() {
        String expected = "My weight is 16 lbs";
        var squirrel = new Squirrel("Pinto");
        squirrel.weight();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }
    
    
    /**
     * Test of heightweight method, of class Squirrel which adds height and weight.
     */
    @Test
    public void testHeightweight() throws Exception{
        double height = 10.0;
        double weight = 11.0;
        double expected = 21.0;
        var squirrel = new Squirrel("Pinto");
        double actual = squirrel.heightweight(height, weight);
        assertEquals(expected, actual, 0.0);
    }

    /**
     * Test of isDisabled method, of class Squirrel.
     */
    @Test
    public void testIsDisabled() throws Exception{
        String expected = "Are u kidding !, I am perfectly alright";
        var squirrel = new Squirrel("Pinto");
        squirrel.isDisabled();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of speak method, of class Squirrel.
     */
    @Test
    public void testSpeak() throws Exception{
       String expected = "I make a keech keech Sound";
        var squirrel = new Squirrel("Pinto");
        squirrel.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of move method, of class Squirrel.
     */
    @Test
    public void testMove() throws Exception{
        String expected = "I move with four legs";
        var squirrel = new Squirrel("Pinto");
        squirrel.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of sleep method, of class Squirrel.
     */
    @Test
    public void testSleep() throws Exception{
        String expected = "I njoy my sleep, I sleep for 10 hours";
        var squirrel = new Squirrel("Pinto");
        squirrel.sleep();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of gender method, of class Squirrel.
     */
    @Test
    public void testGender() throws Exception{
        String expected = "I am female";
        var squirrel = new Squirrel("Pinto");
        squirrel.gender();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    
}
