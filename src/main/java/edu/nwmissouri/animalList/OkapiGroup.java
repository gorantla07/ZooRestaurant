package edu.nwmissouri.animalList;

import java.util.ArrayList;

/**
 * Provides methods to create and run a group of Okapis
 *
 * @author Pranay Bhargav Reddy Bakaram
 */
public class OkapiGroup {

    private static ArrayList<Okapi> myGroup;

    /**
     * Create a static group of Okapi
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();
        
        Okapi o = new Okapi("Abbie");
        myGroup.add(o);
        myGroup.add(new Okapi("Boss"));
        myGroup.add(new Okapi("Cass"));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the Okapis!");
        myGroup.forEach(okapi -> {
            okapi.speak();
            okapi.move();
        });
        System.out.println("Nice okapi - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

}
