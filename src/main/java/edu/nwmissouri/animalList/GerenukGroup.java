package edu.nwmissouri.animalList;

import java.util.ArrayList;

/**
 * Provides methods to create and run a group of Gerenuks
 *
 * @author Tejaswini Challa
 */
public class GerenukGroup {

    private static ArrayList<Gerenuk> myGroup;

    /**
     * Create a static group of Gerenuk
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();
        
        Gerenuk g = new Gerenuk("Gazelle");
        myGroup.add(g);
        myGroup.add(new Gerenuk("Antelope"));
        myGroup.add(new Gerenuk("Giraffe"));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the gerenuks!");
        myGroup.forEach(gerenuk -> {
            gerenuk.speak();
            gerenuk.move();
        });
        System.out.println("Nice gerenuks - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

}
