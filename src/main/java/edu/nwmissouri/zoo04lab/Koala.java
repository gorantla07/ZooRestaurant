/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 *
 * @author Vinay Manavarthi
 */
public class Koala extends Animal {

    private String name;

    public Koala(String name) {
        super(name);
    }

    public void speak() {
        System.out.println("Koala sound");
    }

    public void move() {
        System.out.println("Koala movement");
    }
}
