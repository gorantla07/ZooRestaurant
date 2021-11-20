/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.animalList;

import java.util.Scanner;

/**
 * Cow class (derived subclass of the superclass Animal)
 *
 * @author Harika_Chintala
 */
public class Cow extends Animal {

    /**
     * Cow Constructor
     *
     * @param name - the name of this cow
     */
    public Cow(String name) {
        super(name);
    }
    //@Override

    public void eat() {
        System.out.println("I eat like Yumm yumm yumm!!");
    }

    @Override
    public void speak() {
        System.out.println("I am a Cow.. " + this.name);
    }

    //@Override
    public void child() {
        System.out.println("I can give birth to one child at once");
    }
    //@Override

    public void color() {
        System.out.println("I can be in black, brown and white color ");
    }

    @Override
    public void move() {
        System.out.println("When I move, I move, move, move...");
    }

    /**
     *
     * @param morningMilkProdection is of type double
     * @param eveningMilkProduction is of type double
     * @return double value
     */
    public double getCowAddition(double morningMilkProdection, double eveningMilkProduction) {
        return morningMilkProdection + eveningMilkProduction;
    }

    /**
     *
     */
    public void studentCow() {
        double morningMilkProdection = 2.3;
        double eveningMilkProduction = 1.5;
        double perDayMilkProduction = getCowAddition(morningMilkProdection, eveningMilkProduction);
        System.out.println("I am " + this.name + ", I produce " + morningMilkProdection + "liters Of milk in the morning and " + eveningMilkProduction + "liters in the Evening, Overall I will produce " + perDayMilkProduction + "\"liters per\" day");
    }

    public enum EnumDirections {
        EAST, WEST, SOUTH, NORTH;
    }

    public void directionToGo(EnumDirections d) {
        if (null == d) {
            System.out.println("\"I am travelling towards EAST\"");
        } else {
            switch (d) {
                case EAST ->
                    System.out.println("\"I am travelling towards EAST\"");
                case WEST ->
                    System.out.println("\"I am travelling towards WEST\"");
                case SOUTH ->
                    System.out.println("\"I am travelling towards SOUTH\"");
                default ->
                    System.out.println("\"I am travelling towards NORTH  \"");
            }
        }
    }

    public static void castingAndException() {

        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("TypeCasting: double to int");            
            double x = 23.4;
            System.out.println("Original value: " + x);
            System.out.println("Casted value : " + (int) x);            
            System.out.println("please enter an index number that you want to search a number in an array");
            int val = scan.nextInt();
            int[] myNumbers = {1, 2, 3};
            System.out.println("The value in an array at index "+val+" is: "+myNumbers[val]);
        } 
        catch (Exception e) {
            System.out.println("Something went wrong, \""+e.getMessage()+"\"");
            System.out.println("Please enter valid array index");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }

    }

}
