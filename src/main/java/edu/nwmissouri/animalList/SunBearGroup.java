package edu.nwmissouri.animalList;

import java.util.ArrayList;

/**
 *
 * @author Satish Vagulapuram
 */
public class SunBearGroup {
    
    private static ArrayList<SunBear> myGroup;

    /**
     * Create a static group of SunBear
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();
        
        SunBear a = new SunBear("Sun");
        myGroup.add(a);
        myGroup.add(new SunBear("Rain"));
        myGroup.add(new SunBear("Cloud"));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the SunBear!");
        myGroup.forEach(SunBear -> {
            SunBear.speak();
            SunBear.move();
        });
        System.out.println("Nice SunBear - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }
}
