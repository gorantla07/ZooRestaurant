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
 * @author Pavan Kumar Atmakuri
 */
public class RegularVisitorTest {
    
    public RegularVisitorTest() {
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
     * Test of check method, of class RegularVisitor.
     */
    @Test
    public void testCheck() {
        System.out.println("check");
        boolean expResult = true;
        boolean result = RegularVisitor.check(101);
        assertEquals(expResult, result);
    }
    @Test
    public void testCheckFalse() {
        System.out.println("check");
        boolean expResult = true;
        boolean result = RegularVisitor.check(108);
        assertNotEquals(expResult, result);
    }
    
}
