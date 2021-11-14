package edu.nwmissouri.animalList;

/**
 *
 * @author ANURAG KOLLURU
 */
public class Dinosaur extends Animal {

    /**
     *
     * @param name - String
     */
    public Dinosaur(String name) {
        super(name);
    }


    /**
     * This method is used to print speak
     */
    @Override
    public void speak() {
        System.out.printf("i'm %s. I am a DINOSAURRRRR....!\n", this.name);
    }

    /**
     * This method is used to print move
     */
    @Override
    public void move() {
        System.out.println("I hunt in the FALCON CAVE");
    }

    /**
     *
     * @param l
     * @param b
     * @return l*b
     */
    public int area(int l, int b) {
        return l * b;
    }

    /**
     * This method prints area
     */
    public void value() {
        System.out.println("At " + area(3, 2) + "th" + " Avenue");
    }

   
}
