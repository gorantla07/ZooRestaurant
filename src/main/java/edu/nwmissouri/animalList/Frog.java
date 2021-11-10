/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.animalList;;

/**
 *
 * @author Manoj Kota
 */
public class Frog extends Animal {

    /**
     *
     * @param name
     * name parameter
     */
    enum RACE
            {
        FIRST,
        SECOUND,
        THIRD
        
        
        
        
    }
    public Frog(String name) {
        super(name);
    }

    /**
     *
     * overrides speak method
     */
    @Override
    public void speak()
    {
       System.out.println("Iam Frog,Iam Frog,Iam Frog");
    }

    /**
     * overrides move method
     */
    @Override
    public void move()
    {
       System.out.println("When i move,I jump,I jump");
    }
    
    /**
     * living method
     */
    public void habitate() {
        System.out.println("It lives both on land and water");
    }

    /**
     * type of animal
     */
    public void type() {
        System.out.println("Its a amphibian");
    }
   
    /**
     * feeding method
     */
    public void feeding()
    {
       System.out.println("Feeds on algae and insects");
    }

    /**
     * live span method
     */
    public void livespan()
    {
        System.out.println("lives upto 10-12 years");
    }
    public int age(int DOB,int cuy)
    {
        return cuy-DOB;
    }
    public void agec(){
        System.out.println("Frog age: "+age(1999,2021));
    }
    public static void main(String[] args){
        Frog f=new Frog("cold");
        f.age(1999, 2021);
        f.agec();
        f.move();
        f.habitate();
        f.move();
        f.feeding();
        RACE R1=RACE.FIRST;
        RACE R2=RACE.SECOUND;
        RACE R3=RACE.THIRD;
        System.out.println("enums:"+R1+"\n"+R2+"\n"+R3);
        


        
       
           
       
    }
    
}


