/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.animalList;

/**
 *
 * @author Indu Chinthakuntla
 */
public class Hippopotamus extends Animal {

    private String name;

    public Hippopotamus(String name) {
        super(name);

    }

    @Override
    public void speak() {
        System.out.println("I'm an Hippopotamus!");
    }

    @Override
    public void move() {
        System.out.println("When I move, I walk, walk, walk.");
    }

    
}
