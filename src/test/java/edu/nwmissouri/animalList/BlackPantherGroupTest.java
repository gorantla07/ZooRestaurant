/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.animalList;

import edu.nwmissouri.animalList.BlackPantherGroup;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test BlackPanther Group.
 * 
 * @author Hemanth Sai Reddy Velamuri
 */
public class BlackPantherGroupTest {

    public BlackPantherGroupTest() {
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
     * Test of create method, of class BlackPantherGroup.
     */
    @Test
    public void testGroupCreate() {
        int expectedSize = 3;
        int actualSize = BlackPantherGroup.create();
        assertEquals(expectedSize, actualSize);
    }

    /**
     * Test of run method, of class BlackPantherGroup.
     */
    @Test
    public void testGroupRun() {
        BlackPantherGroup.create();
        BlackPantherGroup.run();
        assertTrue(true);
    }

}
