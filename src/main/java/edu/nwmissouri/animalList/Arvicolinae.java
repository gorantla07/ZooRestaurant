package edu.nwmissouri.animalList;
/**
 * ArvicolinaeTest class (derived subclass of the superclass Animal)
 * @author NIKHIL KUMAR AKARAPU
 */
public class Arvicolinae extends Animal{
    /* Arvicolinae constructor
    *@param name- the name of this Arvicolinae
    */
    public Arvicolinae(String name){
        super(name);
    }
    
    
    public void profess() {
        double a = 2.5;
        int b = 2;
        double c = getArvicolinaeAddition(a, b);
        System.out.printf("I know ArvicolinaeAddition! %4.2f plus %d is %4.2f \n", a, b, c);
    }

    /**
     * Custom Arvicolinae function - your class must use a unique function name
     * unique first parameter identifier unique second parameter identifier do
     * something creative
     *
     * @param valueOne double input
     * @param valueTwo int input
     * @return double sum
     */
    public double getArvicolinaeAddition(double valueOne, int valueTwo) {
        return valueOne + valueTwo;
    }
    
    public void dance(){
        System.out.println("I will dance, When am happy");
    }
    
    
    @Override
    public void speak() {
        System.out.println("I'm an Arvicolinae!");
    }
    @Override
    public void move() {
        System.out.println("When I move, I walk, walk, walk.");
    } 
    
  
}

