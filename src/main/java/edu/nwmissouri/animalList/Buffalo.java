/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.animalList;

/**
 *
 * @author Bhaskar
 */
public class Buffalo extends Animal {

    /**
     * *
     * Constructor for Buffalo
     *
     * @param name - the name of this Buffalo
     */
    public Buffalo(String name) {
        super(name);
    }

    /**
     * *
     * Override method for buffalo speak
     */
    @Override
    public void speak() {
        System.out.printf("I'm %s. I'm a Buffalo!", this.name);
    }
     
    /**
     * *
     * Override method for buffalo move
     */
    @Override
    public void move() {
        System.out.println("I usually walk with four legs");
    }

}
