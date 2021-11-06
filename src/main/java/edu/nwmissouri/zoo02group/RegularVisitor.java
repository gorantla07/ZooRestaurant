/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo02group;

import java.util.ArrayList;

/**
 * checking visitor is there are not  
 * @author Rohan Kondaveeti 
 */
public class RegularVisitor{
    
    
    
    public static boolean check(int vistid)
   {
       
       Visitor.creat();
       for(Visitor v:Visitor.getVisitorList())
       {
       if(v.getVisitorId()==vistid)
       {
           System.out.println("Hello "+v.firstName+" Welcome into Maryville Zoo");
           return true;
       }
       }
       return false;
   }
    
}
