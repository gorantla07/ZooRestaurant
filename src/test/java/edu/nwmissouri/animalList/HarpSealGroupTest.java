/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.animalList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Rehana Naguru
 */
public class HarpSealGroupTest {
    
    public HarpSealGroupTest() {
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
     * Test of create method, of class HarpSealGroup.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        int expResult = 3;
        int result = HarpSealGroup.create();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of run method, of class HarpSealGroup.
     */
    @Test
    public void testRun() { 
        
        HarpSealGroup.create();
        HarpSealGroup.run();
        assertTrue(true);
       
    }
    
}
