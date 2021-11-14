/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.animalList;

import edu.nwmissouri.animalList.RelayHorseGroup;
import edu.nwmissouri.animalList.FerociousTigerGroup;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Saitej Veerabathini
 */
public class FerociousTigerGroupTest {
    
    /**
     *Constructor Ferocious Tiger Group Test
     */
    public FerociousTigerGroupTest() {
    }
    
    /**
     *
     */
    @BeforeAll
    public static void setUpClass() {
    }

    /**
     *
     */
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     *
     */
    @BeforeEach
    public void setUp() {
    }

    /**
     *
     */
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of create method, of class FerociousTigerGroup.
     */
    @Test
    public void testCreate() {
        int expectedSize = 3;
        int actualSize = FerociousTigerGroup.create();
        assertEquals(expectedSize, actualSize);
    }

    /**
     * Test of run method, of class FerociousTigerGroup.
     */
    @Test
    public void testRun() {
        RelayHorseGroup.create();
        RelayHorseGroup.run();
        assertTrue(true);
    }
    
}
