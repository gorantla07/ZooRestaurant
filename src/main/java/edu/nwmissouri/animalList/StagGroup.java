package edu.nwmissouri.animalList;

import java.util.ArrayList;

/**
 * This class of StagGroup provides methods to create and run a group of stags
 * @author Rahul Konda
 */
public class StagGroup {
    
    private static ArrayList<Stag> myGroup;

    /**
     * Create a static group of Stag
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();

        myGroup.add(new Stag("Konda"));
        myGroup.add(new Stag("Rahul"));
        myGroup.add(new Stag("Bunny"));

        return myGroup.size();
    }

    public static void run() {
        System.out.println("================================");
        System.out.println("Hey - look at the Stag!");
        for (Stag stag : myGroup) {
            stag.speak();
            stag.move();
        }

        System.out.println("Nice stag - that was fun!");
        System.out.println("================================");
    }
    
}
