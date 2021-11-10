package edu.nwmissouri.animalList;

import java.util.ArrayList;

/**
 *
 * @author Himaja Reddy Maddi
 */
public class GiraffeGroup {
    
    private static ArrayList<Giraffe> myGroup;

    /**
     * Create a static group of Giraffe
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();

        myGroup.add(new Giraffe("Tom"));
        myGroup.add(new Giraffe("Spike"));
        myGroup.add(new Giraffe("Jerry"));

        return myGroup.size();
    }

    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the giraffe!");
        for (Giraffe giraffe : myGroup) {
            giraffe.speak();
            giraffe.move();
        }

        System.out.println("Nice Giraffe - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }
}
