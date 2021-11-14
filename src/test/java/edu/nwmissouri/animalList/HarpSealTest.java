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
 * @author Rehana Naguru
 */
public class HarpSealTest { 
    
      private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    public HarpSealTest() {
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
     * Test of speak method, of class HarpSeal.
     */
    @Test
    public void testSpeak() throws Exception  { 
        String expected = "I am HarpSeal and I communicate vocally by making noise with my throat and air.";
        var harpSeal = new HarpSeal("Harp");
        harpSeal.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
             
    }

    /**
     * Test of move method, of class HarpSeal.
     */
    @Test
    public void testMove() {
        String expected = "I swim in sea iceand I move on ice by pulling my front flippers, which have strong claws.";
        var harpSeal = new HarpSeal("Harp");
        harpSeal.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of funfacts method, of class HarpSeal.
     */
    @Test
    public void testFunfacts() {
         String expected = "I am HarpSeal, I am more migratory and I can travel more than 3100 miles.";
        var harpSeal = new HarpSeal("Harp");
        harpSeal.funfacts();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of location method, of class HarpSeal.
     */
    @Test
    public void testLocation() {
         String expected = "I am native to northern part of Arctic Ocean and Atlantic Ocean.";
        var harpSeal = new HarpSeal("Harp");
        harpSeal.location();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of food method, of class HarpSeal.
     */
    @Test
    public void testFood() {
         String expected = "I eat many types of fish and invertibrates.";
        var harpSeal = new HarpSeal("Harp");
        harpSeal.food();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of main method, of class HarpSeal.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        HarpSeal.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
