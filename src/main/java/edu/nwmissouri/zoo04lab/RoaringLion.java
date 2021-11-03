/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 *
 * @author Anil Kumar Kolla(S545232@nwmissouri.edu)
 */
public class RoaringLion extends Animal{

    /**
     * this constructor passing the animal name to parent class
     * @param name
     */
    public RoaringLion(String name) {
        super(name);
    }
 
    /**
     * this function prints the animal sound
     */
    public void speak() {
        System.out.println("I am a " + this.name + ", I love to Roar.");
    }
    
    /**
     * this function prints the animal movement
     */
    public void move() {
        System.out.println("I run for Haunting");
    }
}
