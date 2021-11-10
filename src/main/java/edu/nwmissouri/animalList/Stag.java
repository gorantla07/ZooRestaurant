/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.animalList;

/**
 * This is the Stag class which extends Animal
 * @author Rahul Konda
 */
public class Stag extends Animal{
    
    /**
     * Stag Constructor
     * @param name - the name of this Stag
     */
    public Stag(String name){
        super(name);
    }
     //@Override
    public void eat(){
        System.out.println("I'm CARNIVOROUS, I eat grass.");
    }


    @Override
    public void speak(){
        System.out.println("I'm a STAG, I have LONG HORNS! My name is "+this.name);
    }
    @Override
    public void move() {
        System.out.println("When I feel SUSPICIOUS, I RUN very fast!");
    }
     //@Override
    public void color(){
        System.out.println("I'm brown in colour with white spots on me");
    }
    
    public static void main(String[] args) {
        var a = new Stag("Rahul");
        a.eat();
        a.speak();
        a.move();
        a.color();
    }
}
