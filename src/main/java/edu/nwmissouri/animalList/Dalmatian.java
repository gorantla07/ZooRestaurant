/* m
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.animalList;

/**
 * Dalmatian class (derived subclass of the superclass Animal)
 *
 * @author Nikhil Porika
 */
public class Dalmatian extends Animal {

    /**
     * Dalmatian Constructor
     *
     * @param name - the name of this is Dalmatian
     */
    /**
     * This determines the animal color
     */
    enum Colorofanimal {
        WHITEBALCK,
        WHITELIVERBROWN,
        WHITELEMON,
        WHITEORANGE,
        WHITEBALCKTAN,
    }

    public Dalmatian(String name) {
        super(name);
    }

    /**
     * Determines the animal speak
     */
    @Override
    public void speak() {
        System.out.println("I am Dalmatian,I can speak");
    }

    /**
     * Determines the animal move
     */
    @Override
    public void move() {
        System.out.println("I am Dalmatian,I can run, run , run");
    }

    /**
     * Determines the animal eat
     */
    public void eat() {
        System.out.println("Dalmatian eats Cheeze and potatoes");

    }

    /**
     * This method will initialize the values and calls the addition method
     */
    public void cal() {
        double a = 8.5;
        double b = 4.3;
        double c = getDalmatianaddition(a, b);
        System.out.println("The Addition is a and b is : " + c);
    }

    /**
     * This method will calculate the addition of two numbers
     *
     * @param number1 it will take the first double value
     * @param number2 it will take the second double value
     * @return it returns the addition of 2 numbers
     */
    public double getDalmatianaddition(double number1, double number2) {
        return number1 + number2;
    }

    /**
     * This is the main method which makes use of move,speak ,eat,addition
     * method
     *
     * @param args an array of command-line arguments for the application
     */
   
}
