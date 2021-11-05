/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo02group;

import java.util.ArrayList;

/**
 *
 * @author Manoj Gorantla
 */
public class Visitor extends Person {
    int visitorId;
    private static ArrayList<Visitor> visitorList=new ArrayList<>();
    
    /**
     * 
     * @param vistorId
     * @param firstName
     * @param lastName
     * @param age
     * @param gender 
     */
    public Visitor(int vistorId,String firstName, String lastName, int age, String gender) {
        super(firstName, lastName, age, gender);
        this.visitorId=vistorId;
         
    }

    public Visitor(){}

    /**
     * 
     * @return visitor Id
     */
    public int getVisitorId() {
        return visitorId;
    }
    
    /**
     * 
     * @param visitorId 
     */
    public void setVisitorId(int visitorId) {
        this.visitorId = visitorId;
    }
    
    /**
     * Added the visitors
     */
   public static void creat(){  
       visitorList.add(new Visitor(101,"Shashi","pedha",22,"Male"));
       visitorList.add(new Visitor(102,"Manoj","Gorantla",26,"Male"));
       visitorList.add(new Visitor(103,"Pavan","Atmakuri",22,"Male"));
       visitorList.add(new Visitor(104,"Madhava","Nelluri",22,"Male"));
   }
    
   /**
    * 
    * @return visitor list
    */
    public static ArrayList<Visitor> getVisitorList() {
        return visitorList;
    }
    /**
     * 
     * @param vis 
     */
    public void setVisitorList(Visitor vis) {
        visitorList.add(vis);
    }
    
}
