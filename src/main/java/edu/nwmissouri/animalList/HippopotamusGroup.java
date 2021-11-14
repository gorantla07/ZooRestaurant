package edu.nwmissouri.animalList;

import java.util.ArrayList;

/**
 * Provides methods to create and run a group of Hippopotamus
 *
 * @author Indu Chinthakuntla
 */
public class HippopotamusGroup {

    private static ArrayList<Hippopotamus> myGroup;

    /**
     * Create a static group of Hippopotamus
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();
        
        myGroup.add(new Hippopotamus("Himaja Reddy"));
        myGroup.add(new Hippopotamus("Bhuvan"));
        myGroup.add(new Hippopotamus("Satya"));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the hippopotamus!");
        myGroup.forEach(hippopotamus -> {
            hippopotamus.speak();
            hippopotamus.move();
        });
        System.out.println("Nice hippopotamus - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

}
