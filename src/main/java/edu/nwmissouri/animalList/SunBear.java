/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.animalList;


/**
 * This class defines the nature of the SunBear animal
 * @author Satish Vagulapuram (S544905)
 */
public class SunBear extends Animal {
    
    // Creating a Constructor that takes String name and calls super()

    public SunBear(String name) {
        super(name);
    }
/**
 *  Overriding speak method extended from animal
 */
    @Override
    public void speak() {
        System.out.printf("I'm %s. I'm an SunBear!", this.name);
    }

    @Override
    public void move() {
        System.out.println("I climb trees");

    }
    public void add() {
        double a = 2.5;
        int b = 2;
        double c = getSunBearAddition(a, b);
        System.out.printf("I know SunBearAddition! %4.2f plus %d is %4.2f \n", a, b, c);
    }

    /**
     * Custom SunBear function 
     *
     * @param valueOne double input
     * @param valueTwo int input
     * @return double sum
     */
    public double getSunBearAddition(double valueOne, int valueTwo) {
        return valueOne + valueTwo;
    }

  
}
