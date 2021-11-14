/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.animalList;

import edu.nwmissouri.animalList.BearcatGroup;
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
public class BearcatGroupTest {

    public BearcatGroupTest() {
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
     * Test of create method, of class BearcatGroup.
     */
    @Test
    public void testCreate() {
        int expResult = 3;
        int result = BearcatGroup.create();
        assertEquals(expResult, result);
    }

    /**
     * Test of run method, of class BearcatGroup.
     */
    @Test
    public void testRun() {
        BearcatGroup.create();
        BearcatGroup.run();
        assertTrue(true);
    }

}