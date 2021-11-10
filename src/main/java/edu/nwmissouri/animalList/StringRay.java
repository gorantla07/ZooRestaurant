/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.animalList;

/**
 * Provides methods to create and run a group of StringRay
 * @author Saikrishna Vuppala
 */
public class StringRay extends Animal {
    /**
     * 
     * @param name 
     */

    public StringRay(String name) {
        super(name);
    }

   // @Override
    public void swim() {
        System.out.println("Generic animal swim");
    }

    @Override
    public void move() {
        System.out.println("Generic animal movement");
    }
    @Override
    public void speak() {
        System.out.println("Generic animal voice");
    }
    public static void main(String[] args){
        var d = new StringRay("Saikrishna");
                d.swim();
                d.move();
                d.speak();
    }        
}
