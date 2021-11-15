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
public class ItemsTest {
    
    public ItemsTest() {
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
     * Test of values method, of class Items.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        Items[] expResult = null;
        Items[] result = Items.values();
        assertArrayEquals(expResult, null);
    }

    /**
     * Test of valueOf method, of class Items.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String string = "";
        Items expResult = null;
        assertEquals(expResult, null);
    }

    /**
     * Test of getItemPrize method, of class Items.
     */
    @Test
    public void testGetItemPrize() {
        System.out.println("getItemPrize");
        Items instance = Items.VEG_BIRYANI;
        double expResult = 9.99;
        double result = instance.getItemPrize();
        assertEquals(expResult, result);
    }
    
}
