package polymorphismexample;

public class PolymorphismExample {

    public static void main(String[] args) {
//        System.out.println("Welcome to Java");
//        System.out.println("Welcome to Netbeans ");
        
//            Calculator cr=new Calculator();
//            cr.add(12, 12);
//            cr.add(12, 23, 45);
            
            Account a1=new Account();
            Account a2=new Account(5000);
            
            System.out.println("Balance for a1 is : "+a1.getBal());
            System.out.println("Balance for a2 is : "+a2.getBal());
            
            
    }

}

