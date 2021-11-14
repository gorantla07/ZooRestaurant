/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.animalList;

/**
 * BengalTiger class (derived subclass of the superclass Animal)
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
    /**
     * 
     * @param a
     * @param b
     * @return 
     * returns integer
     */
    public int per(int a,int b){
        return 2*(a+b);
    }
    /**
     * perimeter of solid
     */
    public void perimeter(){
        System.out.println("perimeter"+per(1,2));
    }

    
}
