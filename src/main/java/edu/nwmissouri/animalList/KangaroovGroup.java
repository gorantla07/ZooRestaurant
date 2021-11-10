package edu.nwmissouri.animalList;
import java.util.ArrayList;
/**
 *
 * @author Satya Sai Vinuthna Tummala
 */
public class KangaroovGroup {
    private static ArrayList<Kangaroov> myGroup;

    /**
     * Create a static group of Kangaroov
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();

        Kangaroov kangaroo = new Kangaroov("Savannahs");
        myGroup.add(kangaroo);
        myGroup.add(new Kangaroov("Pastures"));
        myGroup.add(new Kangaroov("Tasmania"));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the kangaroos!");
        myGroup.forEach(Kangaroov -> {
            Kangaroov.speak();
            Kangaroov.move();
        });
        System.out.println("Nice kangaroos - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

}
