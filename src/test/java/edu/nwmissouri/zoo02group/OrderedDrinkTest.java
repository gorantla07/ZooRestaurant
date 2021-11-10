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
 * @author Sandhya Nidigonda
 */
public class OrderedDrinkTest {
    
    public OrderedDrinkTest() {
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
     * Test of getDrinkName method, of class OrderedDrink.
     */
    @Test
    public void testGetDrinkName() {
        System.out.println("getDrinkName");
        OrderedDrink instance=new OrderedDrink(Drinks.RED_BULL);
        Drinks expResult = Drinks.RED_BULL;
        Drinks result = instance.getDrinkName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDrinkName method, of class OrderedDrink.
     */
    @Test
    public void testSetDrinkName() {
        System.out.println("setDrinkName");
        Drinks drinkName = Drinks.FRESH_BREWED_ICED_TEA;
        OrderedDrink instance = new OrderedDrink(Drinks.RED_BULL);;
        instance.setDrinkName(drinkName);
    }
    
}
