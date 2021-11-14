/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.animalList;

import edu.nwmissouri.animalList.FerociousTiger;
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
 * @author Saitej Veerabathini
 */
public class FerociousTigerTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    public FerociousTigerTest() {
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
     * Test of speak method, of class FerociousTiger.
     */
    @Test
    public void testSpeak() throws Exception {
        String expected = "I'm Ron.I'm a Ferocious Tiger";
        var ft = new FerociousTiger("Ron");
        ft.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected,actual);
    }
    
    @Test
    public void testSleep() throws Exception{
        int morningSleep_hr = 2;
        int eveningSleep_hr = 5;
        int expected = 7;
        var ft = new FerociousTiger("Ron");
        int actual = ft.getTotalSleep(morningSleep_hr, eveningSleep_hr);
        assertEquals(expected, actual);
    }

    /**
     * Test of move method, of class FerociousTiger.
     */
    @Test
    public void testMove() throws Exception{
        String expected = "I move on 4 legs";
        var ft = new FerociousTiger("move");
        ft.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(actual,expected);
    }

    /**
     * Test of type method, of class FerociousTiger.
     */
    @Test
    public void testType() throws Exception{
        String expected = "I'm a Carnivore animal";
        var ft = new FerociousTiger("Ron");
        ft.type();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(actual,expected);
    }

    /**
     * Test of lifespan method, of class FerociousTiger.
     */
    @Test
    public void testLifespan() throws Exception{
        String expected = "I live upto 8-10 years";
        var ft = new FerociousTiger("Ron");
        ft.lifespan();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(actual,expected);
    }

    /**
     * Test of family method, of class FerociousTiger.
     */
    @Test
    public void testFamily() throws Exception{
        String expected = "I belong to Felidae famly";
        var ft = new FerociousTiger("Ron");
        ft.family();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(actual,expected);
    }

    /**
     * Test of main method, of class FerociousTiger.
     */
    @Test
    public void testMain() {
    }
    
}
