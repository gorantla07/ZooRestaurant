/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.zoo02group;

import java.util.ArrayList;
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
public class StaffTest {

    public StaffTest() {
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
     * Test of create method, of class Staff.
     */
    @Test
    public void testCreat() {
        System.out.println("creat");
        Staff.creat();
    }

    /**
     * Test of getStaffList method, of class Staff.
     */
    @Test
    public void testGetStaffList() {
        System.out.println("getStaffList");
        ArrayList<Staff> expResult = new ArrayList<>();
        expResult.add(new Staff(1001, "Uday", "allipi", 26, "Male"));
        expResult.add(new Staff(1002, "Rohit", "Gangguru", 24, "Male"));
        expResult.add(new Staff(1003, "Nikhil", "Nagabandi", 25, "Male"));
        expResult.add(new Staff(1004, "Parasana", "allipi", 22, "Male"));
        Staff.creat();
        ArrayList<Staff> result = Staff.getStaffList();
        assertEquals(Staff.getStaffList(), result);
    }

    /**
     * Test of setStaffList method, of class Staff.
     */
    @Test
    public void testSetStaffList() {
        System.out.println("setStaffList");
        ArrayList<Staff> StaffList = new ArrayList<>();
        StaffList.add(new Staff(1001, "Uday", "allipi", 26, "Male"));
        StaffList.add(new Staff(1002, "Rohit", "Gangguru", 24, "Male"));
        StaffList.add(new Staff(1003, "Nikhil", "Nagabandi", 25, "Male"));
        StaffList.add(new Staff(1004, "Parasana", "allipi", 22, "Male"));
        Staff.setStaffList(StaffList);
    }

    /**
     * Test of getStaffId method, of class Staff.
     */
    @Test
    public void testGetStaffId() {
        System.out.println("getStaffId");
        Staff.creat();
        Staff instance = new Staff(1001,"Uday","allipi",26,"Male");
        int expResult = 1001;
        int result = instance.getStaffId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStaffId method, of class Staff.
     */
    @Test
    public void testSetStaffId() {
        System.out.println("setStaffId");
        int staffId = 1004;
        Staff instance=new Staff(1001,"Uday","allipi",26,"Male");
        instance.setStaffId(staffId);
    }

    /**
     * Test of check method, of class Staff.
     */
    @Test
    public void testCheck() {
        System.out.println("check");
        Staff.creat();
        int empid = 1002;
        boolean expResult = true;
        boolean result = Staff.check(empid);
        assertEquals(expResult, result);
    }
    @Test
    public void testCheck1() {
        System.out.println("check");
        Staff.creat();
        int empid = 1009;
        boolean expResult = false;
        boolean result = Staff.check(empid);
        assertEquals(expResult, result);
    }

}
