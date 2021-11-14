/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.animalList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test Xraytetra Group.
 * 
 * @author Shashankaravi Chaparala
 */
public class XraytetraGroupTest {

    public XraytetraGroupTest() {
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
     * Test of create method, of class XraytetraGroup.
     */
    @Test
    public void testGroupCreate() {
        int expectedSize = 3;
        int actualSize = XraytetraGroup.create();
        assertEquals(expectedSize, actualSize);
    }

    /**
     * Test of run method, of class XraytetraGroup.
     */
    @Test
    public void testGroupRun() {
        XraytetraGroup.create();
        XraytetraGroup.run();
        assertTrue(true);
    }

}
