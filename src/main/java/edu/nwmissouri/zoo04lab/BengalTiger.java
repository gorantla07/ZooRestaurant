/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 *
 * @author vamsibhogireddy
 */
public class BengalTiger extends Animal{
    public BengalTiger(String name) 
   {
       super(name);
   }
    /*
    *method created to detect sound variation
    */
    @Override
   public void speak()
    {
        System.out.println("My name is Tiger.");
    }
   /*
    *method created to indicate size
    */
   @Override
    public void move()
    {
        System.out.println("I am one of the strongest animal in the world and move with four legs");
    }
    /*
    *method created to explain in which place it is going to survive
    */
   
    public void place()
    {
        System.out.println("My existence is in many locations in the world");
    }

    
}
