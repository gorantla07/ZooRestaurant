package edu.nwmissouri.animalList;

/**
 * Floppy class (derived subclass of the superclass Animal)
 *
 * @author S545243 Satheesh Eppalapelli
 */
public class Floppy extends Animal {

    /**
     * Floppy constructor
     *
     * @param name - the name of this Floppy
     */
    public Floppy(String name) {
        super(name);
    }
    
    /**
     * speak override function of super class animal
     */
    @Override
    public void speak() {
        System.out.printf("I'm an Floppy! I'm a pet of %s. \n", this.name);
    }
    
    /**
     * move override function of super class animal
     */
    @Override
    public void move() {
        System.out.println("When I move, I walk, walk, walk.");
    }

    /**
     * location function
     */
    public void location() {
        System.out.println("I live in water!");
    }

    /**
     * character function
     */
    public void character() {
        System.out.println("The Floppy Fish has a base of different shades of blue with yellow fins, and a yellow tail.");
    }

   
    
   
 
}
