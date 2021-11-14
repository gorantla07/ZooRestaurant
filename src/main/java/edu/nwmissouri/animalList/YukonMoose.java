
package edu.nwmissouri.animalList;


/**
 *
 * @author Pandiri Govinda Reddy
 */
public class YukonMoose extends Animal{

    float height() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void speak() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void move() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
  
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
    public float height(int feet, float inches){
        return feet+inches;
    }
    public void tHeight(){
        System.out.println("YukonMoose height:"+ height(7, (float) 0.6));
    }
  
}
