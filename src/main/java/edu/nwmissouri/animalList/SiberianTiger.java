package edu.nwmissouri.animalList;

/**
 *
 * @author Mulamalla Akhil Kumar Reddy
 * 
 */
public class SiberianTiger extends Animal{
    
    /**
     * This is a constructor
     * @String name
     */
    public SiberianTiger (String name){
        super(name);
    }

    /*thi is roar method*/
    @Override
    public  void speak() {
        System.out.println("I'm a Tiger, my roar can be heard as far as 1.8 miles (3 km) away");
    }

    /*this is Run method*/
    @Override
    public void move() {
        System.out.println("I can Run 80 kilometers per hour (km/h)");
    }
    }
