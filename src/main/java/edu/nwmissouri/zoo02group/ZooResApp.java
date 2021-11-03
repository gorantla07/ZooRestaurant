/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.nwmissouri.zoo02group;

import java.util.Scanner;

/**
 *
 * @author Pavan Kumar Atmakuri
 */
public class ZooResApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Maryville Zoo");
        System.out.println("Are you a \n1. vistor\n2. Staff ");
        Billing billing = new Billing();
        Checkin ci = new Checkin();
        StaffCheckin sci=new StaffCheckin();
        Visitor v=new Visitor();
        int n = s.nextInt();
        switch (n) {
            case 1 -> {
                System.out.println("Are you a\n1. Regular Customer\n2. New Customer");
                int h = s.nextInt();

                switch (h) {
                    case 1 -> {
                        System.out.println("Enter your visitor Id: ");
                        int custId = s.nextInt();
                        boolean check1 = RegularVisitor.check(custId);
                        if (check1) {
                            billing.setTotal_price(5.44);
                            ci.chooice(custId,n);
                            //checkin(custId);
                        } else {
                            System.out.println("Your Id is in Correct");
                        }

                    }
                    case 2 -> {
                        System.out.println("Enter your First Name: ");
                        String fname = s.next();
                        System.out.println("Enter your Last Name: ");
                        String lname = s.next();
                        System.out.println("Enter your age: ");
                        int age = s.nextInt();
                        System.out.println("Enter Your Gender: ");
                        String gender = s.next();
                        NewVisitor t = new NewVisitor(fname, lname, age, gender);
                        billing.setTotal_price(7.45);

                        ci.chooice(t.id,n);
                        //checkin(t.id);
                    }

                }
            }
            case 2 -> {
                System.out.println("Enter your employeeId");
                int empid = s.nextInt();
                boolean check2 = Staff.check(empid);
                if (check2) {
                    billing.setTotal_price(0.00);
                    Visitor.creat();
                    sci.chooice(empid,n);
                } else {
                    System.out.println("Your Id is in Correct");
                }

            }
        }
    }
}
