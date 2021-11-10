/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.animalList;

/**
 *
 * @author Vamsi krishna Areti (S5449902)
 */
//class Abyssinian is extending the animal class
public class Abyssinian extends Animal {
    //creating constructor for Abyssinian class
   public Abyssinian(String name) 
   {
       super(name);
   }
   //overriding the talk method
    @Override
   public void speak()
    {
        System.out.println("I'm Abyssinia.");
    }
   //overriding the eat method
   
    public void eat()
    {
        System.out.println("I eat Purina Pro Plan True Nature Adult Grain Free Natural Salmon & Egg Recipe.");
    }
    //overriding the walk method
   @Override
    public void move()
    {
        System.out.println("I walk on four legs.");
    }
     public static void main(String[] args) {
        var aby = new Abyssinian("Areti");
        aby.speak();
        aby.move();
        aby.eat();
    }
}
