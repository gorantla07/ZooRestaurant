 package edu.nwmissouri.zoo04lab;


import java.util.ArrayList;

/**
 * Provides methods to create and run a group of Unicorn
 *
 * @author Sujith Reddy
 */
public class UnicornGroup {

    private static ArrayList<Unicorn> myUnicornGroup;

    /**
     * Create a static group of Unicorn
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myUnicornGroup = new ArrayList<>();
        
        Unicorn p = new Unicorn("Unicorn1");
        myUnicornGroup.add(p);
        myUnicornGroup.add(new Unicorn("Unicorn2"));
        myUnicornGroup.add(new Unicorn("Unicorn3"));

        return myUnicornGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("ooooh");
        System.out.println("unicorn is flying");
        myUnicornGroup.forEach(Unicorn -> {
            Unicorn.speak();
            Unicorn.move();
        });
        System.out.println("Nice Unicorn - that was superb!");
        System.out.println("go go unicorn");       
        System.out.println("***********************************");

    }

}
