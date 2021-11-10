/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.zoo02group;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Tejaswini Challa
 */
public class DrinksTest {
    
    public DrinksTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of values method, of class Drinks.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        Drinks[] expResult = null;
        Drinks[] result = null;
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of valueOf method, of class Drinks.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String string = "";
        Drinks expResult = null;
        assertEquals(expResult, null);
    }

    /**
     * Test of getDrinkPrice method, of class Drinks.
     */
    @Test
    public void testGetDrinkPrice() {
        System.out.println("getDrinkPrice");
        Drinks instance = Drinks.FOUNTAIN_SODA_20_OZ;
        double expResult = 2.99;
        double result = instance.getDrinkPrice();
        assertEquals(expResult, result);
    }
    
}
