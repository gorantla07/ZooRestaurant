package edu.nwmissouri.animalList;

/**
 *
 * @author Hemanth Sai Reddy Velamuri
 */
public class BlackPanther extends Animal {
    
    /**
     * String declaration.
     *
     * @param name
     */
    public BlackPanther(String name) {
        super(name);
    }
    
    /**
     * BlackPanther Speak
     *
     */
    @Override
    public void speak() {
        System.out.printf("I'm %s. I am a BlackPanther!",this.name);
    }
    
    /**
     *
     * BlackPanther move
     */
    @Override
    public void move() {
        System.out.println("When I move, I run, run, run.\n");
    }
}
