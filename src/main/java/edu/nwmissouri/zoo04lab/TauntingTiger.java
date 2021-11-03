
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

enum Nameofmonths{
January,
february,
march,
april,
may;
}

/**
 * This Class extends Animal class
 * @author Sarath Arrepu
 */
public class TauntingTiger extends Animal {
    /**
     * This is the parametrized constructor
     * @param name
     */
    public TauntingTiger(String name) {
        super(name);
    }
    /**
     * This method is about the animal speaking
     */
    @Override
    public void speak() {
        System.out.println("I roar");
    }
    /**
     * This method is about the animal movement
     */
    @Override
    public void move() {
        System.out.println("I hunt");
    }
     /**
     * This method returns value by multiplying two values
     */
    public double amul(double a,double b){
        return a*b;
    }
    /**
     * This method returns value by adding two values
     */
     public double amuladd(double a,double b){
        return a+b;
    }
     /**
     * This method is about the animal eating
     */
    
    public void eat() {
        System.out.println("I eat meat");
    }
    /**
     * This method is about the animal type
     */
     public void type() {
        System.out.println("I am a wild animal");
        
        
    }
       public static void main(String[] args){
           TauntingTiger tommy = new TauntingTiger("tommy");
           for(int i =0;i<4;i++){
           double a = 10;
           double b = 5;
           tommy.eat();
           tommy.eat();
           tommy.speak();
           tommy.move();
           tommy.type();
           System.out.println(tommy.amul(a, b));
           System.out.println(tommy.amuladd(a, b));
           System.out.println("My Birthday is in May Month "+Nameofmonths.may);
           }
       }
    
    
}
