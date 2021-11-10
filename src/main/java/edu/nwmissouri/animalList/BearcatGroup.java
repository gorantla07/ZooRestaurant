package edu.nwmissouri.animalList;

import java.util.ArrayList;

/**
 *
 * @author Pavan Kumar Atmakuri
 */
public class BearcatGroup {

    private static ArrayList<Bearcat> myGroup;

    /**
     * Create a static group of Bearcat
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();

        myGroup.add(new Bearcat("Shashi"));
        myGroup.add(new Bearcat("Madhav"));
        myGroup.add(new Bearcat("Afridi"));

        return myGroup.size();
    }

    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the bearcat!");
        for (Bearcat bearcat : myGroup) {
            bearcat.speak();
            bearcat.move();
            bearcat.breed();
            bearcat.cal();
        }

        System.out.println("Nice bearcat - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }
}
