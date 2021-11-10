package edu.nwmissouri.animalList;

import java.util.ArrayList;

/**
 *
 * @author Sai Kaushik Beeram
 */
public class PumaGroup {
    private static ArrayList<Puma> myGroup;

    /**
     * Create a static group of Pumas
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();
        
        Puma p = new Puma("Abbie");
        myGroup.add(p);
        myGroup.add(new Puma("Boss"));
        myGroup.add(new Puma("Cass"));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the Pumas!");
        myGroup.forEach(Puma -> {
            Puma.speak();
            Puma.move();
        });
        System.out.println("Nice Pumas - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }


}
