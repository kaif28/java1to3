
package classroom;


public abstract class Studentname extends classroom {
 
    public Studentname(String sn,int cn)
    {
        super(sn,cn);
    } 
    public void Studentname()
    {
        System.out.println("student name is kaif rangara");
    } 
     public void roomnum()
    {
        System.out.println("student name is"  +Studentname);
            System.out.println("class roomnum is"  +roomnum);
    }
    
}
 class test
 {
 
         public static void main(String []args) {
         
             Studentname  s=new Studentname ("core java",2) {};
             s.Studentname();
           s.roomnum();
         }
 }   
                 
     
