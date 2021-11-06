/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo02group;

/**
 * this person abstract class 
 * @author Harika Chintala
 */

public abstract class Person {
    
    protected String firstName;
    protected String lastName;
    protected int age;
    protected String gender;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
    
    /**
     * Constructor without parameters
     */
    public Person()
    {
        
    }
    /**
     * Constructor with Parameters
     * @param firstName
     * @param lastName
     * @param age
     * @param gender 
     */
    public Person(String firstName, String lastName, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }
    /**
     * toString method, used to display 
     * @return string type
     */
    @Override
    public String toString() {
        return "Name: " + this.getFirstName() + " " + this.getLastName() + "\nage: " + this.getAge() + "\ngender: " + this.getGender();
    }
    
   
    
   
    
}
