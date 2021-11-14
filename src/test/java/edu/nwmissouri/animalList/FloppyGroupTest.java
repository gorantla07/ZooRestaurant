/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.animalList;

import edu.nwmissouri.animalList.FloppyGroup;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test Floppy Group.
 *
 * @author S545243 Satheesh Eppalapelli
 */
public class FloppyGroupTest {

    public FloppyGroupTest() {
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
     * Test of create method, of class FloppyGroup.
     */
    @Test
    public void testGroupCreate() {
        int expectedSize = 3;
        int actualSize = FloppyGroup.create();
        assertEquals(expectedSize, actualSize);
    }

    /**
     * Test of run method, of class FloppyGroup.
     */
    @Test
    public void testGroupRun() {
        FloppyGroup.create();
        FloppyGroup.run();
        assertTrue(true);
    }

}
