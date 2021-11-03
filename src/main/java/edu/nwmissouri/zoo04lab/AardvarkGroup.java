package edu.nwmissouri.zoo04lab;

import java.util.ArrayList;

/**
 * Provides methods to create and run a group of Aardvarks
 *
 * @author Denise Case
 */
public class AardvarkGroup {

    private static ArrayList<Aardvark> myGroup;

    /**
     * Create a static group of Aardvarks
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();
        
        Aardvark a = new Aardvark("Abbie");
        myGroup.add(a);
        myGroup.add(new Aardvark("Boss"));
        myGroup.add(new Aardvark("Cass"));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the aardvarks!");
        myGroup.forEach(aardvark -> {
            aardvark.speak();
            aardvark.move();
        });
        System.out.println("Nice aardvarks - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

}
