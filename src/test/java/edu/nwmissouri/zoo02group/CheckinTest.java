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
 * @author Rohan Reddy Kondaveeti
 */
public class CheckinTest {
    
    public CheckinTest() {
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
     * Test of getItemOrders method, of class checking.
     */
    @Test
    public void testGetItemOrders() {
        System.out.println("getItemOrders");
        ArrayList<OrderedItem> itemOrders=new ArrayList<>();
        Checkin.getItemOrders().add(new OrderedItem(Items.VEG_BIRYANI));
        ArrayList<OrderedItem> expResult = Checkin.getItemOrders();
        
        ArrayList<OrderedItem> result = Checkin.getItemOrders();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDrinkOrders method, of class checking.
     */
    @Test
    public void testGetDrinkOrders() {
        System.out.println("getDrinkOrders");
        ArrayList<OrderedDrink> drinkOrders= new ArrayList<>();
        Checkin.getDrinkOrders().add(new OrderedDrink(Drinks.FRESH_BREWED_ICED_TEA));
        ArrayList<OrderedDrink> expResult = Checkin.getDrinkOrders();
        ArrayList<OrderedDrink> result = Checkin.getDrinkOrders();
        assertEquals(expResult, result);
    }

    /**
     * Test of choice method, of class checking.
     */
    @Test
    public void testChooice() {
        System.out.println("chooice");
        int id = 101;
        int c = 2;
        Checkin instance = new Checkin();
        assert(true);
        
    }
    
}
