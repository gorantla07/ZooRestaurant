/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 * RelayHorse class extends from parent class Animal
 *
 * @author BUHVAN CHANDRA SARAKAM S544899
 */
public class RelayHorse extends Animal {
    
    /**
     * RelayHorse constructor
     * @param name - the name of this RelayHorse
     */
    public RelayHorse(String name){
        super(name);
    }
    
    @Override
    public void speak() {
        System.out.printf("\nI'm %s. I'm an RelayHorse!\n", this.name);
    }
    
    @Override
    public void move() {
        System.out.println("When I move, I Run, Run, Run.");
    }
    
}
