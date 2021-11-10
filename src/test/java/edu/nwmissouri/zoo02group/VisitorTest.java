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
public class VisitorTest {
    
    public VisitorTest() {
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
     * Test of getVisitorId method, of class Visitor.
     */
    @Test
    public void testGetVisitorId() {
        System.out.println("getVisitorId");
        Visitor instance = new Visitor(101,"Shashi","pedha",22,"Male");
        int expResult = 101;
        int result = instance.getVisitorId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setVisitorId method, of class Visitor.
     */
    @Test
    public void testSetVisitorId() {
        System.out.println("setVisitorId");
        int visitorId = 104;
        Visitor instance = new Visitor();
        instance.setVisitorId(visitorId);
    }

    /**
     * Test of create method, of class Visitor.
     */
    @Test
    public void testCreat() {
        System.out.println("creat");
        Visitor.creat();
    }

    /**
     * Test of getVisitorList method, of class Visitor.
     */
    @Test
    public void testGetVisitorList() {
        System.out.println("getVisitorList");
        ArrayList<Visitor> expResult = new ArrayList<>();
        ArrayList<Visitor> result = Visitor.getVisitorList();
        assertEquals(Visitor.getVisitorList(), result);
    }

    /**
     * Test of setVisitorList method, of class Visitor.
     */
    @Test
    public void testSetVisitorList() {
        System.out.println("setVisitorList");
        Visitor vis = null;
        Visitor instance = new Visitor();
        instance.setVisitorList(vis);
    }
    
}
