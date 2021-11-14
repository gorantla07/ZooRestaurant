/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.animalList;

import edu.nwmissouri.animalList.BengalTiger;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author S545411
 */
public class BengalTigerTest {
     private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    public BengalTigerTest() {
    }
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }



    /**
     * Test of speak method, of class BengalTiger.
     */
    @Test
    public void testSpeak() {
         String expected = "My name is Tiger.";
        var BengalTiger = new BengalTiger("Tiger");
        BengalTiger.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);

             }

    /**
     * Test of move method, of class BengalTiger.
     */
    @Test
    public void testMove() {
        String expected ="I am one of the strongest animal in the world and move with four legs";
        var BengalTiger = new BengalTiger("Tiger");
        BengalTiger.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
       
    }

    /**
     * Test of place method, of class BengalTiger.
     */
    @Test
    public void testPlace() {
        String expected = "My existence is in many locations in the world";
        var BengalTiger = new BengalTiger("Tiger");
        BengalTiger.place();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
       
    }

    /**
     * Test of perim method, of class BengalTiger.
     */
    @Test
    public void testPerim() {
    }

    /**
     * Test of perimeter method, of class BengalTiger.
     */
    @Test
    public void testPerimeter() {
    }

    /**
     * Test of main method, of class BengalTiger.
     */
    @Test
    public void testMain() {
        int l=4;
        int b=5;
        int actual=18;
        int parm=2*(l+b);
       assertEquals(actual,parm);
    }
    
}
