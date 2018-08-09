package anonymous;

abstract class country{  
  abstract void place();
}
public class Anonymous {
    public static void main(String[] args) {
     country p;
        p = new country(){
            @Override
               void place(){System.out.println("nice place");}
        };
    p.place();
    }
    
}
