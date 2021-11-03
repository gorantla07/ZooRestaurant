package edu.nwmissouri.zoo04lab;

import java.util.ArrayList;

/**
 * Provides methods to create and run a group of BengalTiger
 *
 * @author Vamsi Bhogireddy
 */
public class BengalTigerGroup {

    private static ArrayList<BengalTiger> myGroup;

    /**
     * Create a static group of BengalTiger
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();
        
        BengalTiger a = new BengalTiger("Abbie");
        myGroup.add(a);
        myGroup.add(new BengalTiger("Boss"));
        myGroup.add(new BengalTiger("Cass"));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the BengalTiger!");
        myGroup.forEach(BengalTiger -> {
            BengalTiger.speak();
            BengalTiger.move();
        });
        System.out.println("Nice BengalTiger - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

}
