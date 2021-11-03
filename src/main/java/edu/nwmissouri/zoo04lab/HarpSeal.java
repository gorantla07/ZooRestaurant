/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;



/**
 * HarpSeal class (derived subclass of the superclass Animal)
 * @author Rehana Naguru
 */
public class HarpSeal extends Animal{
    /*
    HarpSeal Constructor 
    @param name -the name of this HarpSeal
    */
    public HarpSeal(String name){
        super(name);
    }
    
    @Override
    public void speak(){
        System.out.println("I am HarpSeal and I communicate vocally by making noise with my throat and air.");
    }
    @Override
    public void move(){
        System.out.println("I swim in sea iceand I move on ice by pulling my front flippers, which have strong claws.");
    } 
    public void funfacts(){
        System.out.println("I am HarpSeal, I am more migratory and I can travel more than 3100 miles.");
    }
    
    public void location(){
        System.out.println("I am native to northern part of Arctic Ocean and Atlantic Ocean.");
    } 
    
    public void food(){
        System.out.println("I eat many types of fish and invertibrates.");
    } 
    public void calculate() {
        double p = 5.0;
        int q = 4;
        double r = getHarpSealAdd(p, q);
        System.out.printf("I know Addition ! %4.2f addition %d is %4.2f \n", p, q, r);
    }
     public double getHarpSealAdd(double a, int b) { 
        
         return a+b;
    }
    
    
     public static void main(String[] args) {
        var a = new HarpSeal("Rehana");
        a.speak();
        a.move();
        a.funfacts();
        a.location();
        a.food();
        a.calculate();
        
        }
        
} 


