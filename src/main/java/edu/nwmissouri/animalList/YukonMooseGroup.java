package edu.nwmissouri.animalList;

import java.util.ArrayList;

/**
* Provides methods to create and run a group of YukonMoose
*
* @author Pandiri Govinda Reddy
*/
public class YukonMooseGroup {

private static ArrayList<YukonMoose> myYukonMooseGroup;

/**
* Create a static group of YukonMoose
*
* @return the number of animals in the group
*/
public static int create() {
myYukonMooseGroup = new ArrayList<>();

YukonMoose p = new YukonMoose("YukonMoose1");
myYukonMooseGroup.add(p);
myYukonMooseGroup.add(new YukonMoose("YukonMoose2"));
myYukonMooseGroup.add(new YukonMoose("YukonMoose3"));

return myYukonMooseGroup.size();
}

/**
* Run (simulate) the group doing things
*/
public static void run() {
System.out.println("HELOOOOOOOOOOOOOOOOOOOO");
System.out.println("Hey - look at the YukonMooses!");
myYukonMooseGroup.forEach(yukonMoose -> {
yukonMoose.speak();
yukonMoose.move();
});
System.out.println("Nice YukonMooses - that was fun!");
System.out.println("HELLOOOOOOOOOOOOOOOOOO");
}

}
