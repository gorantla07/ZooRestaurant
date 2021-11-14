/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.animalList;

/**
 *
 * @author Revanth Pagilla
 */
public class Liger extends Animal {
    /**
     * Liger constructor
     * @param name - the name of this instance of an animal
     */
    
    public Liger(String name){
        super(name);
    }

    @Override
    public void move() {
        System.out.println("When I move, I walk, walk, walk.");
    }

    @Override
    public void speak() {
         System.out.printf("I roar loud. I'm an Liger! \n", this.name);
    }
    
    
    public void eat() {
         System.out.printf("I hunt very badly \n", this.name);
    }
     
    /**
     *
     * @param valueOne double input
     * @param valueTwo int input
     * @return double sum
     */
    public double getLigerAddition(double valueOne, int valueTwo) {
        return valueOne + valueTwo;
    }

 

}


