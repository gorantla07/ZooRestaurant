/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.animalList;
import edu.nwmissouri.animalList.Lion;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
/**
 *
 * @author Nikhil Krishnan Venkatesh
 */
public class LionTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public LionTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testSpeak() throws Exception {
        String expected = "I'm Brown. I'm an Lion!";
        var Lion = new Lion("Brown");
        Lion.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    @Test
    public void testMove() throws Exception {
        String expected = "When I move, I walk, walk, walk.";
        var Lion = new Lion("Brown");
        Lion.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }
      
    @Test
    public void testLionAddition() throws Exception {
        
        // set up test, figure out expected by hand
        double first = 5.0;
        int second = 10;
        double expected = 15.0;

        // call function to get the actual
        var Lion = new Lion("Brown");
        double actual = Lion.getLionAddition(first, second);

        // assertEquals(expected, actual);
        assertEquals(expected, actual);
    }

}

