/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.animalList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author S545400
 */
public class FrogGroupTest {
    
    public FrogGroupTest() {
    }
    
    @BeforeEach
    public void setUp() {
    }

    /**
     * Test of create method, of class FrogGroup.
     */
    @Test
    public void testCreate() {
    }

    /**
     * Test of run method, of class FrogGroup.
     */
    @Test
    public void testRun() throws Exception {
        int i=4;
        int actual=4;
        int expected=Math.round(i);
        assertEquals(actual,expected);
    }

   
}
