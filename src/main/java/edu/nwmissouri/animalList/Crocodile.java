package edu.nwmissouri.animalList;
/**
@author ruthvik bhairav
**/
public class Crocodile extends Animal {
        public Crocodile(String name){
         super(name);
    }
    
    @Override
    public void speak() {
        System.out.println("I'm an Crrocodile!");
    }
    
    @Override
    public void move() {
        System.out.println("When I move, I walk, walk, walk.");
    }
    
}

