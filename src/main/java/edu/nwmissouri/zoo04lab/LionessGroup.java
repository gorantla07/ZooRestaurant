
package edu.nwmissouri.zoo04lab;

import java.util.ArrayList;

/**
 * Provides methods to create and run a group of Lioness's
 *
 * @author Sreebharath Mallampati
 */
public class LionessGroup {

    private static ArrayList<Lioness> myLionessGroup;

    /**
     * Create a static group of Lioness
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myLionessGroup = new ArrayList<>();
        
        Lioness lionessObj = new Lioness("Lioness 1");
        myLionessGroup.add(lionessObj);
        myLionessGroup.add(new Lioness("Lioness 2"));
        myLionessGroup.add(new Lioness("Lioness 3"));

        return myLionessGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the Lioness!");
        myLionessGroup.forEach(x -> {
            x.speak();
            x.move();
        });
        System.out.println("Nice Lioness - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

}
