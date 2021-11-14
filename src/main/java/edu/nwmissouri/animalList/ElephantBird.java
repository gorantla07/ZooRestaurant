package edu.nwmissouri.animalList;

/**
 *Elephant Bird class derived from animal class
 * 
 * @author Hemanth Kumar Reddy Pidaparathy
 */
public class ElephantBird extends Animal {
    
  
    
    /**
     * ElephantBird name
     *
     * @param name
     */
    public ElephantBird(String name) {
        super(name);
    }
    
    /**
     * Elephant Bird speak
     *
     */
    @Override
    public void speak() {
        System.out.printf("I'm %s. I'm an ElephantBird!",this.name);
    }
    
    /**
     *Elephant Bird move
     * 
     */
    @Override
    public void move() {
        System.out.println("When I move, I run,run,run.\n");
    }
    
    public void profes(){
        double a = 2.5;
        int b = 2;
        double c = getElephantBirdAddition(a,b);
        System.out.printf("I know ElephantBird addition! %4.2f plus %d is %4.2f \n",a,b,c);
    }

    double getElephantBirdAddition(double first, int second) {
        return first+second; //To change body of generated methods, choose Tools | Templates.
    }
    
 
}
