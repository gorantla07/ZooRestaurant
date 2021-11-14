package edu.nwmissouri.animalList;

import java.util.ArrayList;

/**
 *
 * @author Anil Kumar Kolla(S545232@nwmissouri.edu)
 */
public class RoaringLionGroup {
    
    private static ArrayList<RoaringLion> myGroup;

    /**
     * Create a static group of Aardvarks
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();
        
        RoaringLion roaringlion = new RoaringLion("Simba");
        myGroup.add(roaringlion);
        myGroup.add(new RoaringLion("Mufasa"));
        myGroup.add(new RoaringLion("Scar"));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the aardvarks!");
        myGroup.forEach(roaringlion -> {
            roaringlion.speak();
            roaringlion.move();
        });
        System.out.println("Nice Roaring Lions - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

}
