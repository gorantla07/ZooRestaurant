package edu.nwmissouri.animalList;

import edu.nwmissouri.animalList.Kangaroo.Calender;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Manoj Gorantla
 */
public class KangarooGroup {
     private static ArrayList<Kangaroo> myGroup;
     

    /**
     * Create a static group of Kangaroo
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();

        myGroup.add(new Kangaroo("Orange"));
        myGroup.add(new Kangaroo("Apple"));
        myGroup.add(new Kangaroo("Lemon"));

        return myGroup.size();
    }

    public static void run() {
        Scanner s=new Scanner(System.in);
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey wassup Kangaroo!");
        for (Kangaroo kangaroo : myGroup) {
            kangaroo.speak();
            kangaroo.move();
            kangaroo.speed();
            kangaroo.region();
            kangaroo.calc();
            System.out.println("Please enter the type of enum value of July, August, September");
            Calender v=Calender.August;
            System.out.println("Kangaroo "+kangaroo.name+" from "+v);
        }

        System.out.println("Great to see you Kangaroo");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }
}
