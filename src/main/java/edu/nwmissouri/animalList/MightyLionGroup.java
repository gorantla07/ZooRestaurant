
   
package edu.nwmissouri.animalList;

import java.util.ArrayList;

/**
 * Provides methods to create and run a group of MightyLions
 *
 * @author Vijay Kumar Chunchu (S545712)
 */
public class MightyLionGroup {

    private static ArrayList<MightyLion> myGroup;

    /**
     * Create a static group of MightyLions
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();
        
        MightyLion a = new MightyLion("Barbary Lion");
        myGroup.add(a);
        myGroup.add(new MightyLion("Asiatic Lion"));
        myGroup.add(new MightyLion("African Lion"));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the MightyLions!");
        myGroup.forEach(mightylion -> {
            mightylion.speak();
            mightylion.move();
        });
        System.out.println("Nice MightyLions - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

}
