/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 *
 * @author Satish Vagulapuram
 */
public class SunBear extends Animal {
    
    // Creating a Constructor that takes String name and calls super()

    public SunBear(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("I sound like hen-Clucking sound");
    }

    @Override
    public void move() {
        System.out.println("I climb trees");

    }
}
