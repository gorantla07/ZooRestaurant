/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.animalList;

enum SuperPlanet{
    EARTH,
    JUPITER,
    VENUS,
    NEPTUNE,
    URANUS,
   
}
/**
 *
 * @author Homakesavadurgaprasad OMTRI (S544929)
 */
public class Elephant extends Animal {

    /**
     * This method is used to get the string from the parent class
     *
     * @param name Elephant
     */

    public Elephant(String name) {
        super(name);
    }

    /**
     * This is used to print name of the Animal
     *
     */
@Override
    public void speak() {
        System.out.printf(" I'm %s.I'm an Elephant!", this.name);
    }

    /**
     * This is used to print Animal food
     *
     */

    @Override
    public void move() {
        System.out.println(" I could not able to swim in water but would like to walk!. ");
    }
    public void profess() {
        double a = 2.5;
        int b = 5;
        double c = getElephantAddition(a, b);
        System.out.printf("I know ElephantAddition! %4.2f plus %d is %4.2f \n", a, b, c);
    }
public double getElephantAddition(double valueOne, int valueTwo) {
        return valueOne + valueTwo;
    }

    public static void main(String[] args) {
        Elephant Tommy = new Elephant("Tommy");
        Tommy.speak();
        Tommy.move();
        Tommy.profess();
        
        System.out.println("My Super Planet is :"+SuperPlanet.EARTH);
        
    }
}
