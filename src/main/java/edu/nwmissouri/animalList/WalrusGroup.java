package edu.nwmissouri.animalList;

import java.util.ArrayList;

/**
 * Provides methods to create and run a group of Walrus
 * @author Rehaman Naguru Abdur
 */
public class WalrusGroup {
    
    private static ArrayList<Walrus> myGroup;

    /**
     * Create a static group of Walrus
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();
        
        Walrus w = new Walrus("BlackWalrus");
        myGroup.add(w);
        myGroup.add(new Walrus("PacificWalrus"));
        myGroup.add(new Walrus("NorthrenWalrus"));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("********************************");
        System.out.println("Hey - look at the Walrus!");
        myGroup.forEach(Walrus -> {
            Walrus.speak();
            Walrus.move();
        });
        System.out.println("Nice Walrus ");
        
        System.out.println("*******************************");
    }

}
