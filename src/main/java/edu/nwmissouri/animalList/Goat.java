/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.animalList;

/**
 *
 * @author Rohan Kondaveeti
 */
public class Goat extends Animal {

    public Goat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.printf("I'm an Goat. I'm a pet of %s. \n", this.name);
    }

    @Override
    public void move() {
        System.out.println("I can walk with four legs.");
    }

    public void eat() {
        System.out.println("I eat like Yumm yumm yumm!!");
    }

    public void child() {
        System.out.println("I can give birth to one child at once.");
    }

    public void color() {
        System.out.println("I can be in black, brown and white color.");
    }
    public int Exceptionclass() {
        int c = 10;
        for (int i = 3; i >= 0; i--)
		   try {
            System.out.println(c / i);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        return c;
    }
    
    public static void main(String[] args) {
        Goat g = new Goat("g");
        g.speak();
        g.move();
        g.Exceptionclass();
    }
    
   
    
   
    
}
