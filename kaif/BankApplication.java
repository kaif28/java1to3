import java.util.*;

class BankApplication
{
		public static void main(String args[])
		{
			int mon,ch,p=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Welcome to SBI");
			Account a1=new Account();
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
			}while(p==1);	
		}
}

class Account
{
	private int acno;
	private String name;
	private int bal;
	
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
}