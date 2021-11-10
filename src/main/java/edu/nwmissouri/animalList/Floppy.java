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

    /**
     ** Custom confess function
     *
     * @param valueOne double input
     * @param valueTwo int input
     * 
     */
    public void confess() {
        double a = 3.5;
        int b = 3;
        double c = getFloppyAddition(a, b);
        System.out.printf("I know FloppyAddition! %4.2f plus %d is %4.2f \n", a, b, c);
    }

    /**
     * Custom getFloppyAddtion function 
     *
     * @param valueOne double input
     * @param valueTwo int input
     * @return double sum
     */
    public double getFloppyAddition(double valueOne, int valueTwo) {
        return valueOne + valueTwo;
    }
    
    /**
     * Enum function with plant values
     * 
     */
    public enum Planet {
        MERCURY,
        VENUS,
        EARTH,
        MARS,
        JUPITER,
        SATURN,
        URANUS,
        NEPTUNE;
    }

    /**
     * Main method
     * @param args 
     */
    public static void main(String[] args) {
        Floppy floppy = new Floppy("Satheesh");
        floppy.speak();
        floppy.move();
        floppy.location();
        floppy.character();
        floppy.confess();
        for (Planet planet : Planet.values()) {
            System.out.println(planet);
        }
    }
}
