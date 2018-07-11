
package inharetance;
public class Inharetance {
    public static void main(String[] args) {
        System.out.println("Object of  MS1");
        MS1 MS1=new MS1();
        MS1.start();
        MS1.stop();
        
        System.out.println("Object of  MS2");
        MS2 MS2=new MS2();
        MS2.openRoof();
        MS2.closeRoof();
        MS2.start();
        MS2.stop();
    }
    
}
