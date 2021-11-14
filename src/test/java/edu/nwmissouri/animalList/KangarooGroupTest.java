/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.animalList;

import edu.nwmissouri.animalList.KangarooGroup;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author s545503
 */
public class KangarooGroupTest {
    
    public KangarooGroupTest() {
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
     * Test of create method, of class KangarooGroup.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        int expResult = 3;
        int result = KangarooGroup.create();
        assertEquals(expResult, result);
    }

    /**
     * Test of run method, of class KangarooGroup.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        KangarooGroup.create();
        KangarooGroup.run();
        assertTrue(true);
    }
    
}
