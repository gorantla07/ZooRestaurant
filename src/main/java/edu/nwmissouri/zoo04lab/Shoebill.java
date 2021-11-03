/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 * This class is about Shoebill extends Animal
 * @author Gayatri Devabhaktuni
 */
public class Shoebill extends Animal {
    public Shoebill(String name){
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("I'm a Shoebill \n---------------\nsound like a Machine Gun!");
    }

    @Override
    public void move() {
        System.out.println("When I move, I fly and walk.");
    }

   // @Override
    public void eat() {
        System.out.println("I Love eating Fish");
    }
    public static void main(String[] args){
        var sb = new Shoebill("Gayatri");
        sb.speak();
        sb.eat();
        sb.move();
    }

}
