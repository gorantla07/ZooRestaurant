package edu.nwmissouri.zoo04lab;

/**
 *
 * @author Sai Kaushik Beeram
 */
//custom animal extends Animal class
public class Puma extends Animal {
    
    //Declaration of string name
    
    public Puma(String name){
        super(name);
        
    }
    
    public void speak(){
        System.out.println("Puma sound");
    }
    
    public void move(){
        System.out.println("Puma movement");
    }
 }
