package edu.nwmissouri.zoo04lab;

import java.util.ArrayList;

/**
 *
 * @author Jayanth Naramsetty
 */
public class BrachiosaurusGroup {

    private static ArrayList<Brachiosaurus> myGroup;

    /**
     * Create a static group of Aardvarks
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();

        Brachiosaurus a = new Brachiosaurus("XLR 10");
        myGroup.add(a);
        myGroup.add(new Brachiosaurus("Dinosaur"));
        myGroup.add(new Brachiosaurus("Monkey"));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the brachiosaurus!");
        myGroup.forEach(brachiosaurus -> {
            brachiosaurus.speak();
            brachiosaurus.move();
        });
        System.out.println("Nice brachiosaurus - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

}
