/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo02group;

/**
 * storing the ne visitor details
 * @author Rohan Kondaveeti
 */
public class NewVisitor{
    
   public String fname;
   public String lname;
   public int age;
   public String gender;
   public int id=104;

    public NewVisitor(String fname, String lname, int age, String gender) {
        Visitor.creat();
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.gender = gender;
        id++;
        Visitor v=new Visitor(this.id,this.fname,this.lname,this.age,this.gender);
        v.setVisitorList(v);
        System.out.println("Hello "+v.firstName+" Welcome into Maryville Zoo");
    }
   
    
}
