
package cinterface;

interface Cinterface 
{
 String name ="kaif";
void cloth();
void food();
void book();

default void place() 
{
    System.out.println("I love this place");
}

static void make()
{
    return;
    }
}
interface Ainterface
{
    void pason();
    void idea();       
}
class Self implements Cinterface ,Ainterface 
{
  public void cloth () 
{
    System.out.println("this is my cloth"); 
}
    public void food () 
{
    System.out.println("this is my food"); 
}
      public void book () 
{
    System.out.println("this is my book"); 
}
      public void pason () 
{
    System.out.println("this is my pason"); 
}
       public void idea () 
{
    System.out.println("this is my idea"); 
}
       public static void main(String[] args) {
        Self sb=new Self();
        sb.cloth();
        sb.book();
        sb.food();
        sb.pason();
        sb.idea();
           System.out.println("my name is " +name);
    }
}
