/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 *
 * @author Manish Gouud Bandharapu
 */
public class Glyptodon extends Animal{
    
    /**
     * Animal addition
     * @param name
     */
    public Glyptodon(String name){
        super(name);
    }
    
    /**
     * Animal speak
     */
    @Override
    public void speak() {
        System.out.printf("I'm %s. I'm a Lion!",this.name);
    }
    
    /**
     * Animal move
     */
    @Override()
    public void move() {
        System.out.println("when I move, I run, I roar.\n");
        
    }
    
}
