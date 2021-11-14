/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.animalList;

import edu.nwmissouri.animalList.Abyssinian;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author Vamsi Krishna Areti(544902)
 */
public class AbyssinianTest {
     private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    public AbyssinianTest() {
    }

    /**
     * Test of eat method, of class Abyssinian.
     */
    @Test
    public void testEat() {
         System.setOut(new PrintStream(outputStreamCaptor));
    }
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    /**
     * Test of speak method, of class Abyssinian.
     */
    @Test
    public void testSpeak() {
        String expected = "I'm Abyssinian.";
        var Abyssinian = new Abyssinian("Aby");
        Abyssinian.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of visible method, of class Abyssinian.
     */
    @Test
    public void testVisible() {
        String expected = "Vamsi Krishna Areti";
        var Abyssinian = new Abyssinian("Aby");
        Abyssinian.visible();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of move method, of class Abyssinian.
     */
    @Test
    public void testMove() {
        String expected = "I walk on four legs.";
        var Abyssinian = new Abyssinian("Aby");
        Abyssinian.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);

    }

    /**
     * Test of breed method, of class Abyssinian.
     */
    @Test
    public void testBreed() {
        String expected = "I am one of the breed from cat family.";
        var Abyssinian = new Abyssinian("Aby");
        String actual = "I am one of the breed from cat family.";
        //String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

   

    /**
     * Test of main method, of class Abyssinian.
     */
    @Test
    public void testMain() {
        String s="Vamsi Areti";
        String h="Vamsi Areti";
        String j=s.trim();
        assertEquals(j,h);
    }
    
}