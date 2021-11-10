/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.animalList;

/**
 *
 * @author Satya Sai Vinuthna Tummala
 */
public class Kangaroov extends Animal {
    /**
     * Kangaroo Constructor
     * @param name - the name of this Kangaroo
     */
    
    public Kangaroov(String name){
        super(name);
    }

    @Override
    public void move() {
        System.out.println("I will move with four legs :)");
    }

    @Override
    public void speak() {
         System.out.printf("I'm %s. I'm a Kangaroo! \n", this.name);
    }
    
    
}
