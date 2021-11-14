/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.animalList;

import java.io.PrintStream;

import java.io.ByteArrayOutputStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Sarath arrepu
 */
public class TauntingTigerTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public TauntingTigerTest() {
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
     * Test of speak method, of class TauntingTiger.
     */
    @Test
    public void testSpeak() {
        String expected = "I roar";
        var tommy = new TauntingTiger("tommy");
        tommy.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of move method, of class TauntingTiger.
     */
    @Test
    public void testMove() {
        String expected = "I hunt";
        var tommy = new TauntingTiger("tommy");
        tommy.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of Amul method, of class TauntingTiger.
     */
    @Test
    public void testAmul() throws Exception {
        System.out.println("amul");
        double a = 10.0;
        double b = 5.0;
        //TauntingTiger instance = null;
        var tommy = new TauntingTiger("tommy");
        double expResult = 50.0;
        double result = tommy.amul(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of Amuladd method, of class TauntingTiger.
     */
    @Test
    public void testAmuladd() throws Exception {
        System.out.println("amuladd");
        double a = 10.0;
        double b = 5.0;
        //TauntingTiger instance = null;
        var tommy = new TauntingTiger("tommy");
        double expResult = 15.0;
        double result = tommy.amuladd(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of eat method, of class TauntingTiger.
     */
    @Test
    public void testEat() {
        
        String expected = "I eat meat";
        var tommy = new TauntingTiger("tommy");
        tommy.eat();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }
    /**
     * Test of type method, of class TauntingTiger.
     */
    @Test
    public void testType() {
        String expected = "I am a wild animal";
        var tommy = new TauntingTiger("tommy");
        tommy.type();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

}
