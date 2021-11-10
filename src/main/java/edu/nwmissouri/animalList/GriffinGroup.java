package edu.nwmissouri.animalList;

import java.util.ArrayList;

/**
 * Generates groups of Griffins using create() and run()
 *
 * @author Alexander Dieringer
 */
public class GriffinGroup {

    // How many Griffins should be made in a group
    private static final int GROUP_SIZE = 3;

    // What names should we use for our group
    private static final String[] GROUP_NAMES = {
        "George", "Grant", "Gryph"
    };

    // Where we will be storing our Griffins
    private static ArrayList<Griffin> grifGroup;

    /**
     * Create a static group of Griffins
     *
     * @return however many Griffins are in the group
     */
    public static int create() {
        grifGroup = new ArrayList<>();
        for (int i = 0; i < GROUP_SIZE; i++) {
            String name = (i < GROUP_NAMES.length) ? GROUP_NAMES[i] : "Griff" + i;
            grifGroup.add(new Griffin(name));
        }
        return grifGroup.size();
    }

    /**
     * Run() uses the group to do things Simulates or tests various things
     */
    public static void run() {
        System.out.println("WOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOH!");
        System.out.println("Look at that flight of Griffins!");
        grifGroup.forEach(griffo -> {
            System.out.println("My name is: " + griffo.getName());
            griffo.speak();
            griffo.move();
        });
        System.out.println("Those Griffins seemed quite majestic right?!");
        System.out.println("WOOOOOOOOOOOOOOOOOH, OFF WE GO!");
    }

}
