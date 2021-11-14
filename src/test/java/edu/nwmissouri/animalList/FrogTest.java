/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package edu.nwmissouri.animalList;

import edu.nwmissouri.animalList.Frog;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author S545400
 */
public class FrogTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    public FrogTest() {
    }
    
    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    /**
     * Test of speak method, of class Frog.
     */
    @Test
    public void testSpeak() throws Exception{
        String expected = "Iam Frog,Iam Frog,Iam Frog";
        var Frog = new Frog("cold");
        Frog.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of move method, of class Frog.
     */
    @Test
    public void testMove() throws Exception{
        String expected = "When i move,I jump,I jump";
        var Frog = new Frog("cold");
        Frog.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);

    }

    /**
     * Test of habitate method, of class Frog.
     */
    @Test
    public void testHabitate() throws Exception{
             String expected = "It lives both on land and water";
        var Frog = new Frog("cold");
        Frog.habitate();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of type method, of class Frog.
     */
    @Test
    public void testType() throws Exception{
         String expected = "Its a amphibian";
        var Frog = new Frog("cold");
        Frog.type();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);

    }

    /**
     * Test of feeding method, of class Frog.
     */
    @Test
    public void testFeeding() throws Exception{
         String expected = "Feeds on algae and insects";
        var Frog = new Frog("cold");
        Frog.feeding();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);

    }

    /**
     * Test of livespan method, of class Frog.
     */
    @Test
    public void testLivespan() throws Exception{
        String expected = "lives upto 10-12 years";
        var Frog = new Frog("cold");
        Frog.livespan();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of age method, of class Frog.
     */
    @Test
    public void testAge() throws Exception {
         int expected = 22;
        var Frog = new Frog("cold");
        int actual=2021-1999;
        
        assertEquals(expected, actual);
    }

    /**
     * Test of agec method, of class Frog.
     */
    @Test
    public void testAgec() throws Exception{
        int expected = 22;
        var Frog = new Frog("cold");
        int actual=2022-2000;
        
        assertEquals(expected, actual);
    }

    /**
     * Test of main method, of class Frog.
     */
    @Test
    public void testMain() {
    }
    
}
