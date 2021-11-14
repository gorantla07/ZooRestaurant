package edu.nwmissouri.animalList;

/**
 *
 * @author Naveen Kumar Kanaparthi
 */
public class BlackJaguar extends Animal {
    
    /**
     *
     * @param name
     */
    public BlackJaguar(String name) {
        super(name);
    }
    
    
    /**
     *speak method
     */
    @Override
    public void speak(){
        System.out.printf("I am %s. I am Jaguar!", this.name);
    }
    
    /**
     *move method
     */
    @Override
    public void move(){
        System.out.println("When I move, I walk.\n");
    }

    /**
     *behaviour method
     */
    public void behaviour(){
        System.out.println("I am very aggressive and hunt alone");
    }

    /**
     *
     * @param fs
     * @param ls
     * @return
     */
    public String name(String fs,String ls){
         return fs+ls;
     }

    /**
     *details method
     */
    public void details(){
         System.out.println("name:"+name("naveen","kanaparthi"));
     }

    /**
     *
     * @param args
     */
    }
    

