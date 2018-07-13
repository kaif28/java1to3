
package classroom;

public abstract class classroom {

  String Studentname;
   int roomnum;

    public classroom  (String sn, int cn)
    {
       this.Studentname=sn;
        this.roomnum=cn;       
                
    }
    public abstract void Studentname(); 
    
     public abstract void roomnum(); 
  
}
