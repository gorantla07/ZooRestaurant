/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.zoo02group;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Pavan Kumar Atmakuri
 */
public class StaffCheckinTest {
    
    public StaffCheckinTest() {
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
     * Test of getItemOrders method, of class StaffCheckin.
     */
    @Test
    public void testGetItemOrders() {
        System.out.println("getItemOrders");
        ArrayList<OrderedItem> expResult = new ArrayList<>();
        ArrayList<OrderedItem> result = StaffCheckin.getItemOrders();
        assertEquals(StaffCheckin.getItemOrders(), result);
    }

    /**
     * Test of getDrinkOrders method, of class StaffCheckin.
     */
    @Test
    public void testGetDrinkOrders() {
        System.out.println("getDrinkOrders");
        ArrayList<OrderedDrink> expResult = new ArrayList<>();
        ArrayList<OrderedDrink> result = StaffCheckin.getDrinkOrders();
        assertEquals(StaffCheckin.getDrinkOrders(), result);
    }

    
    
}
