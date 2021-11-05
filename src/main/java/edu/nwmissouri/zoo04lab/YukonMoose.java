
package edu.nwmissouri.zoo04lab;


/**
 *
 * @author Pandiri Govinda Reddy
 */
public class YukonMoose extends Animal{
    /**
     * Constructor
     * @param name 
     */
        public YukonMoose(String name){
        super(name);
    }
    public void size(){
        System.out.println(" I'm 6 feet tall...."+this.name);
    }
    public void survive(){
        System.out.println(" I can survive under 80 degree celsius");
    }
    public void behaviour(){
        System.out.println(" I can be very aggresive");
    }
   
}
