package edu.nwmissouri.zoo04lab;

import java.util.ArrayList;


/**
 *
 * @author Saitej Veerabathini
 */
public class FerociousTigerGroup {
    private static ArrayList<FerociousTiger> myGroup;

    /**
     * Create a static group of Aardvarks
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();
        
        FerociousTiger a = new FerociousTiger("Ron");
        myGroup.add(a);
        myGroup.add(new FerociousTiger("Harry"));
        myGroup.add(new FerociousTiger("Stark"));

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
