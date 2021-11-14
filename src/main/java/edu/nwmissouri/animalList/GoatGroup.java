package edu.nwmissouri.animalList;

import java.util.ArrayList;

/**
 * Provides methods to create and run a group of Goats
 *
 * @author Rohan Kondaveeti
 */
public class GoatGroup {

    private static ArrayList<Goat> myGroup;

    /**
     * Create a static group of Goats
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();

        Goat g = new Goat("Boer goat");
        myGroup.add(g);
        myGroup.add(new Goat("Anglo_Nubian goat"));
        myGroup.add(new Goat("Saanen goat"));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("GGGGGGGGGGGGGGGGGGGGGGGGGGG");
        System.out.println("Hey - look at the goats!");
        myGroup.forEach(goat -> {
            goat.speak();
            goat.move();
        });
        System.out.println("Nice goats - that was fun!");
        System.out.println("GGGGGGGGGGGGGGGGGGGGGGGGGGG");
    }
}
