package edu.nwmissouri.animalList;

import java.util.ArrayList;

/**
 * Provides methods to create and run a group of Floppy
 *
 * @author S545243 Satheesh Eppalapelli
 */
public class FloppyGroup {

    private static ArrayList<Floppy> myGroup;

    /**
     * Create a static group of Floppy
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();

        Floppy a = new Floppy("Aquatic");
        myGroup.add(a);
        myGroup.add(new Floppy("Soil"));
        myGroup.add(new Floppy("Himalayas"));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the floppys!");
        myGroup.forEach(aardvark -> {
            aardvark.speak();
            aardvark.move();
        });
        System.out.println("Nice floppys - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

}
