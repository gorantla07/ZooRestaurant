package edu.nwmissouri.animalList;

import java.util.ArrayList;

/**
 *
 * @author Nikhil KrishnanVenkatesh
 */
public class LionGroup {
    private static ArrayList<Lion> myGroup;

    /**
     * Create a static group of Lion
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();
        
        Lion a = new Lion("brownie");
        myGroup.add(a);
        myGroup.add(new Lion("siii"));
        myGroup.add(new Lion("cruze"));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the Lion!");
        myGroup.forEach(Lion -> {
            Lion.speak();
            Lion.move();
            Lion.speed();
            Lion.profess();
        });
        System.out.println("Nice Lion - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }
    
}
