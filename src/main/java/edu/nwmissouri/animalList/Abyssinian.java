/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.animalList;

/**
 *Abyssinian class is derived from animal class
 * @author Vamsi krishna Areti (S544902)
 */
//class Abyssinian is extending the animal class
public class Abyssinian extends Animal {
   
   public Abyssinian(String name) 
   {
       super(name);
   }
   //overriding the speak method
    @Override
   public void speak()
    {
        System.out.println("I'm Abyssinian.");
    }
   //overriding the eat method
   
    public void eat()
    {
        System.out.println("I eat Purina Pro Plan True Nature Adult Grain Free Natural Salmon & Egg Recipe.");
    }
    //overriding the move method
   @Override
    public void move()
    {
        System.out.println("I walk on four legs.");
    }
    public void visible(){
        System.out.println("Vamsi Krishna Areti");
    }
    public void breed(){
        System.out.println("I am one of the breed from cat family.");
    }
     
}
