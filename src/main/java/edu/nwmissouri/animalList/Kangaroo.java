/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.animalList;

/**
 *
 * @author Manoj Gorantla
 */
public class Kangaroo extends Animal {

    /**
     *
     * @param name is passing and referring it to super class.
     */
    public Kangaroo(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.printf("I'm %s. I'm an Kangaroo!\n", this.name);
    }

    @Override
    public void move() {
        System.out.println("In General I can jump but can't run unlike another animals");
    }

}
