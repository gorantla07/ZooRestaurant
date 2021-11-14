/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.animalList;

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
 * @author Pavan Kumar Atmakuri
 */
public class BearcatTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    public BearcatTest() {
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
     * Test of move method, of class Bearcat.
     */
    @Test
    public void testMove() {
        String expected ="I will climb trees :)";
        var bearcat= new Bearcat("Pavan");
        bearcat.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
        
    }

    /**
     * Test of speak method, of class Bearcat.
     */
    @Test
    public void testSpeak() {
        String expected ="I'm Pavan. I'm a Bearcat!";
        var bearcat= new Bearcat("Pavan");
        bearcat.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
        
    }

    /**
     * Test of breed method, of class Bearcat.
     */
    @Test
    public void testBreed() {
        String expected ="I'm Binturong breed";
        var bearcat= new Bearcat("Pavan");
        bearcat.breed();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of cal method, of class Bearcat.
     */
    @Test
    public void testCal() {
        int a=55;
        double p=10;
        double expected=49.5;
        var bearcat= new Bearcat("Pavan");
        double k=bearcat.discount(a, p);
        assertEquals(expected, k);
        
    }
    
}
