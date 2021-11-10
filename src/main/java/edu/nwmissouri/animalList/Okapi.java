/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.animalList;

/**
 *
 * @author Pranay bhargav reddy bakaram
 */
public class Okapi extends Animal {

    private String name;

    public Okapi(String name) {
        super(name);
    }

    public void speak() {
        System.out.println("ki ki ki ");
    }

    public void move() {
        System.out.println("hop hop hop");
    }
}
