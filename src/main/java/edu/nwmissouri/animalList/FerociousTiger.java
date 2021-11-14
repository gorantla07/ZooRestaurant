/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.animalList;

/**
 * FerociousTiger class extends from parent class Animal
 * 
 * @author Saitej Veerabathini 
 */
public class FerociousTiger extends Animal{
    
    /**
     * Enumerator class for Color of FerociousTiger
     */
    enum Color {
        White,
        Gold,
        Black
    }
    
    /***
     * Constructor for FerociousTiger
     * @param name - the name of this FerociousTiger
     */
    public FerociousTiger(String name){
        super(name);
    }
    
    /***
     * Override method for FerociousTiger Speak
     */
    @Override
    public void speak() {
        System.out.printf("I'm %s.I'm a Ferocious Tiger\n", this.name);
    }
    
    /***
     * Override method for FerociousTiger Move
     */
    @Override
    public void move() {
        System.out.println("I move on 4 legs");
    }
    
    /**
     * Type method of FerociousTiger
     */
     public void type() {
        System.out.println("I'm a Carnivore animal");
    }
     
     /**
      * Lifespan method of FerociousTiger
      */
     public void lifespan(){
         System.out.println("I live upto 8-10 years");
     }
    
     /**
      * Family method of FerociousTiger
      */
     public void family(){
         System.out.println("I belong to Felidae famly");
     }
     
     public int getTotalSleep(int a, int b){
         return a+b;
     }
     
     public void sleep(){
         int morningSleep_hr = 2;
         int eveningSleep_hr = 10;
         int totalSleep_hr = getTotalSleep(morningSleep_hr,eveningSleep_hr);
         System.out.println("I am "+this.name+", I am a Ferocious Tiger. I sleep "+totalSleep_hr+" hours per day");
     }
   
     

    
}
