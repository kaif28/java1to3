import java.util.*;

class BankApplication
{
		public static void main(String args[])
		{
			int mon,ch,p=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Welcome to SBI");
			System.out.println("Enter Amount you have  :");
			int val=sc.nextInt();
			Account a1=new Account(val);
			a1.showBal();
			a1.deposite(2000);
			a1.showBal();
			int t=a1.getBalance();
			Intrest it=new Intrest();
			it.calcInt(a1);
			/*
			do
			{
				System.out.println("Enter your Choice : ");
				System.out.println("1 for deposit");
				System.out.println("2 for withdraw");
				System.out.println("3 for Balance");
				ch=sc.nextInt();
				switch(ch)
				{
					case 1:
						System.out.println("Enter amount you want to deposit : ");
						mon=sc.nextInt();
						a1.deposite(mon);
						break;
					case 2:
						System.out.println("Enter amount you want to withdraw : ");
						mon=sc.nextInt();
						a1.withdraw(mon);
						break;
					case 3:
						a1.showBal();
						break;
					default:
						System.out.println("Invalid Choice");
						break;
					}
				System.out.println("Do you want to continue? \n press 1 for yes \n press 2 for no.");
				p=sc.nextInt();
			}while(p==1);*/	
		}
}

class Account
{
	private int acno;
	private String name;
	private int bal;
	
	/*public Account()			//simple Constructor 
	{
		bal=2000;
		System.out.println("Simple Constructor Executed");
	}*/
	public Account(int t)			//Parameterized Constructor 
	{
		bal=t;
		System.out.println("Parameterized Constructor Executed");
	}
	
	public void deposite(int mon)
	{
		bal=bal+mon;
	}
	
	public void withdraw(int mon)
	{
		bal=bal-mon;
	}
	public void showBal()
	{
		System.out.println("Balance is "+bal);
	}
	public int getBalance()
	{
		return bal;
	}
}

class Intrest
{
	public void calcInt(Account o)
	{
		int ti=o.getBalance()+((o.getBalance()*10)/100);
		System.out.println("Total is : "+ti);
	}
}

