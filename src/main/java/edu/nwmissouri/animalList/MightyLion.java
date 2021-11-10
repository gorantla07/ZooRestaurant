/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.animalList;

/**
 *
 * @author S545712
 */
public class MightyLion extends Animal {
     public MightyLion(String name){
        super(name);
    }

    @Override
    public void move() {
        System.out.println("I will Walk and run");
    }

    @Override
    public void speak() {
         System.out.printf("I am %s Lion. I will roar.\n", this.name);
    }
    
   
}
