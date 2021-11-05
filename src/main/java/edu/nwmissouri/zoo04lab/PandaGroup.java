package edu.nwmissouri.zoo04lab;

import java.util.ArrayList;

/**
 * Provides methods to create and run a group of Aardvarks
 *
 * @author Preethi Jadhav
 */
public class PandaGroup {

    private static ArrayList<Panda> myPandaGroup;

    /**
     * Create a static group of Panda
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myPandaGroup = new ArrayList<>();
        
        Panda p = new Panda("Panda1");
        myPandaGroup.add(p);
        myPandaGroup.add(new Panda("Panda2"));
        myPandaGroup.add(new Panda("Panda3"));

        return myPandaGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the Pandas!");
        myPandaGroup.forEach(panda -> {
            panda.speak();
            panda.move();
        });
        System.out.println("Nice Pandas - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

}
