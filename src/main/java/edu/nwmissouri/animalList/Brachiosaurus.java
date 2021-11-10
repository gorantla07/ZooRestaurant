/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.animalList;

/**
 * Brachiosaurus class creation and extends with Animal class
 * @author Jayanth Naramsetty
 */
public class Brachiosaurus extends Animal{
    
    /**
     *Brachiosaurus declaration
     * @param name
     */
    public Brachiosaurus(String name){
        super(name);
    }

    /**
     *speak() method
     */
    public void speak(){
            System.out.println("I can Roar,Grunts,Hisses,Squeaks");
        
        }

    /**
     *move() method
     */
    public void move(){
            System.out.println("i walk all around the land ");
        }
        
    /**
     *facts() methods
     */
    public void facts(){
            System.out.println("WE are group of reptiles that have lived on Earth\nfor about 245 million years. ");
        }
}
