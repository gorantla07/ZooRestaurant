/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;
/**
 *
 * @author S545113
 */
public class Xraytetra extends Animal {
 /* This is parameter constructor which initialize the instance variables according to parameters passed
 * @param name is passed to the constructor
 * 
 */
    public Xraytetra(String name) {
        super(name);
    }
      /**
    * This is speak method which is used to to print the message 
    * print the statement
    */
     @Override
    public void speak()
    {
         System.out.println("I am Xraytetra");
    }
    /**
    * This is move method which is used to to print the message 
    * print the statement
    */
    @Override
    public void move()
    {
        System.out.println("I can swim");
    }
}
