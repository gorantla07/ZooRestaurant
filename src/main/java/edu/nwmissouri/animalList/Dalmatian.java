/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.animalList;

/**
 *This is a class
 * @author Nikhil Porika
 */
public class Dalmatian extends Animal {

    /**
     * Dalmatian Constructor
     *
     * @param name - the name of this is Dalmatian
     */
    public Dalmatian(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("I am Dalmatian,I can speak");
    }

    @Override
    public void move() {
        System.out.println("I am Dalmatian,I can run, run , run");
    }

}
