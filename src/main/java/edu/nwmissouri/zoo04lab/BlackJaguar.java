package edu.nwmissouri.zoo04lab;

/**
 *
 * @author Naveen Kumar Kanaparthi
 */
public class BlackJaguar extends Animal {
    
    public BlackJaguar(String name) {
        super(name);
    }
    
    @Override
    public void speak(){
        System.out.printf("I am %s. I am Jaguar!", this.name);
    }
    
    @Override
    public void move(){
        System.out.println("When I move, I walk.\n");
    }
     public void behaviour(){
        System.out.println("I am very aggressive and hunt alone");
    }
    }

