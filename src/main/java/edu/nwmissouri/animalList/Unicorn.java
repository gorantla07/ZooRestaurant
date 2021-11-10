/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.animalList;

/**
 *
 * @author Sujithreddy
 */
public class Unicorn extends Animal {
    /**
     * unicorn constructor
     * @param name - the name of this instance of an animal
     */
    
    public Unicorn(String name){
        super(name);
    }

    @Override
    public void move() {
        System.out.println("I will climb trees ");
    }

    @Override
    public void speak() {
         System.out.printf("I'm %s. I'm an unicorn! \n", this.name);
    }
    
    
}
