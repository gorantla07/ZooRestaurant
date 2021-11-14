/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.animalList;

import edu.nwmissouri.animalList.RelayHorseGroup;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test RelayHorse Group.
 * 
 * @author Bhuvan Chandra Sarakam (S544899)
 */
public class RelayHorseGroupTest {

    public RelayHorseGroupTest() {
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
     * Test of create method, of class RelayHorseGroup.
     */
    @Test
    public void testGroupCreate() {
        int expectedSize = 3;
        int actualSize = RelayHorseGroup.create();
        assertEquals(expectedSize, actualSize);
    }

    /**
     * Test of run method, of class RelayHorseGroup.
     */
    @Test
    public void testGroupRun() {
        RelayHorseGroup.create();
        RelayHorseGroup.run();
        assertTrue(true);
    }

}
