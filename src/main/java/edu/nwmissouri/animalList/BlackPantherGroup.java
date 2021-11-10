package edu.nwmissouri.animalList;

import java.util.ArrayList;

/**
 *
 * @author Hemanth Sai Reddy Velamuri
 */
public class BlackPantherGroup {
    
    private static ArrayList<BlackPanther> myGroup;

    /**
     * Create a static group of BlackPanthers
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();
        
       BlackPanther a = new BlackPanther("Nikhil");
        myGroup.add(a);
        myGroup.add(new BlackPanther("Jack"));
        myGroup.add(new BlackPanther("Rose"));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the BlackPanthers!");
        myGroup.forEach(BlackPanther -> {
            BlackPanther.speak();
            BlackPanther.move();
        });
        System.out.println("Nice BlackPanther - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }
    
}
