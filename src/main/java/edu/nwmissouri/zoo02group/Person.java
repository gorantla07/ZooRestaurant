/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo02group;

/**
 *
 * @author Pavan Kumar Atmakuri
 */
public abstract class Person {
    
    protected String firstName;
    protected String lastName;
    protected int age;
    protected String gender;

    public Person()
    {
        
    }
    public Person(String firstName, String lastName, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\nage: " + age + "\ngender: " + gender + '}';
    }
    
   
    
}
