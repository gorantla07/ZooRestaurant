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
 * @author Manoj Gorantla
 */
public class BillingTest {

    Checkin ci = new Checkin();
    Billing billing = new Billing();
    StaffCheckin sci = new StaffCheckin();

    public BillingTest() {
    }

    @BeforeAll
    public static void setUpClass() {
        ArrayList<OrderedItem> itemOrders = new ArrayList<>();
        ArrayList<OrderedDrink> drinkOrders = new ArrayList<>();
        itemOrders.add(new OrderedItem(Items.VEG_BIRYANI));
        drinkOrders.add(new OrderedDrink(Drinks.FOUNTAIN_SODA_20_OZ));
        Checkin.setDrinkOrders(drinkOrders);
        Checkin.setItemOrders(itemOrders);
        StaffCheckin.setDrinkOrders(drinkOrders);
        StaffCheckin.setItemOrders(itemOrders);
        

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
     * Test of getTotal_price method, of class Billing.
     */
    @Test
    public void testGetTotal_price() {
        System.out.println("getTotal_price");
        Billing instance = new Billing();
        double expResult = 57.18000000000001;
        double result = instance.getTotal_price();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTotal_price method, of class Billing.
     */
    @Test
    public void testSetTotal_price() {
        System.out.println("setTotal_price");
        double tp = 12.80;
        Billing instance1 = new Billing();
        instance1.setTotal_price(tp);
    }

    /**
     * Test of findCost method, of class Billing.
     */
    @Test
    public void testFindCost() {
        System.out.println("findCost");
        Billing instance = new Billing();
        instance.findCost();
    }

    /**
     * Test of printBill method, of class Billing.
     */
    @Test
    public void testPrintBill() {

        Visitor v = new Visitor();
        RegularVisitor.check(101);
        billing.setTotal_price(5.44);
        System.out.println("printBill");
        int id = 101;
        int n = 1;
        billing.findCost();
        String expResult = "-------------------------------------------------------\n"
                + "		     Visitor Details\n"
                + "-------------------------------------------------------\n"
                + "Name: Shashi pedha\n"
                + "age: 22\n"
                + "gender: Male\n"
                + "-------------------------------------------------------\n"
                + "SELECTED ITEMS                     PRICES\n"
                + "-------------------------------------------------------\n"
                + "ENTRANCE FEE                       5.44\n"
                + "VEG_BIRYANI                       9.99\n"
                + "FOUNTAIN_SODA_20_OZ                2.99\n"
                + "-------------------------------------------------------\n"
                + "Total Price:			     18.42\n"
                + "-------------------------------------------------------";
        String result = billing.printBill(id, n);
        assertEquals(expResult, result);
    }

    @Test
    public void testPrintBill2() {

        Staff.check(1001);
        billing.setTotal_price(0.00);
        System.out.println("printBill");
        int id = 1001;
        int n = 2;
        String expResult = "-------------------------------------------------------\n"
                + "		     Staff Details\n"
                + "-------------------------------------------------------\n"
                + "Name: Uday allipi\n"
                + "age: 26\n"
                + "gender: Male\n"
                + "-------------------------------------------------------\n"
                + "SELECTED ITEMS                     PRICES\n"
                + "-------------------------------------------------------\n"
                + "ENTRANCE FEE                       0.0\n"
                + "VEG_BIRYANI                       9.99\n"
                + "FOUNTAIN_SODA_20_OZ                2.99\n"
                + "-------------------------------------------------------\n"
                + "Total Price:			     31.4\n"
                + "-------------------------------------------------------";
        String result = billing.printBill(id, n);
        assertEquals(expResult, result);
    }

}
