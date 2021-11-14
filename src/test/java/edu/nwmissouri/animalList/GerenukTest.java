
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */package edu.nwmissouri.animalList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
/**
 * Test Aardvark using JUnit5
 *
 * @author Tejaswini Challa
 */
public class GerenukTest {
   
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
     * Test of speak method, of class Gerenuk.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSpeak() throws Exception {
        String expected = "I'm Gazelle. I'm an Aardvark!";
        var gerenuk = new Gerenuk("Gazelle");
        gerenuk.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of move method, of class Gerenuk.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testMove() throws Exception {
        String expected = "I can move with four legs";
        var gerenuk = new Gerenuk("Gazelle");
         gerenuk.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }
     /**
     * Test custom function gerenukAddition()
     *
     * @throws Exception
     */
    @Test
    public void testGerenukAddition() throws Exception {
        
        // set up test, figure out expected by hand
        double first = 5.0;
        int second = 10;
        double expected = 15.0;

        // call function to get the actual
        var gerenuk = new Gerenuk("Gazelle");
        double actual = gerenuk.getGerenukAddition(first, second);

        // assertEquals(expected, actual);
        assertEquals(expected, actual);
    }

} 

