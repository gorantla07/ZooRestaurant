package edu.nwmissouri.animalList;

import java.util.ArrayList;

/**
 * Provides methods to create and run a group of Crocodile
 *
 * @author Ruthvik bhairav
 */
public class CrocodileGroup {

    private static ArrayList<Crocodile> myGroup;

    /**
     * Create a static group of Crocodile
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();
        
        Crocodile a = new Crocodile("Abbie");
        myGroup.add(a);
        myGroup.add(new Crocodile("Boss"));
        myGroup.add(new Crocodile("Cass"));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the Crocodile!");
        myGroup.forEach(crocodile -> {
            crocodile.speak();
            crocodile.move();
        });
        System.out.println("Nice Crocodile - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

}
