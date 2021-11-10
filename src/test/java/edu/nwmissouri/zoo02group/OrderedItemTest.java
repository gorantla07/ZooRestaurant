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
public class OrderedItemTest {
    
    public OrderedItemTest() {
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
     * Test of getItemName method, of class OrderedItem.
     */
    @Test
    public void testGetItemName() {
        System.out.println("getItemName");
        OrderedItem instance = new OrderedItem(Items.Afghini_chicken);
        Items expResult = Items.Afghini_chicken;
        Items result = instance.getItemName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setItemName method, of class OrderedItem.
     */
    @Test
    public void testSetItemName() {
        System.out.println("setItemName");
        Items itemName = Items.Chicken_Biriyani;
        OrderedItem instance = new OrderedItem(Items.Afghini_chicken);;
        instance.setItemName(itemName);
    }
    
}
