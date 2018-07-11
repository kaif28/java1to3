package polymorphismexample;
public class Calculator {
    
    public void add(int a,int b)
    {
        System.out.println("Addition is "+(a+b));
    }

    public void add(String a,int b)
    {
        System.out.println("Addition is "+(a+b));
    }
    public void add(int a,String b)
    {
        System.out.println("Addition is "+(a+b));
    }
    public void add(int a,int b,int c)
    {
        System.out.println("Addition is "+(a+b+c));
    }
    
}
