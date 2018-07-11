import java.util.*;
class stock 
{
	public static void main (String args[])
	{
		int num,ch,p=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome to kaif stationary");
		stationary s=new stationary();
	
	
	do
			{
				System.out.println("enter of your choice:");
				System.out.println("1 addbk");
				System.out.println("2 addchp");
				System.out.println("3 addpen");
				System.out.println("4 removebk");
				System.out.println("5 removechp");
				System.out.println("6 removepen");
				System.out.println("7 for Balance");
				ch=sc.nextInt();
				switch(ch)
				{
					case 1:
						System.out.println("Enter the num you want to add: ");
						num=sc.nextInt();
						s.addbk(num);
						break;
					case 2:
						System.out.println("Enter the num you want to add: ");
						num=sc.nextInt();
						s.addchp(num);
						break;
					case 3:
						System.out.println("Enter the num you want to add: ");
						num=sc.nextInt();
						s.addpen(num);
						break;
					case 4:
						System.out.println("Enter the num you want to remove: ");
						num=sc.nextInt();
						s.removebk(num);
						break;
					case 5:
						System.out.println("Enter the num you want to remove: ");
						num=sc.nextInt();
						s.removechp(num);
						break;
					case 6:
						System.out.println("Enter the num you want to remove: ");
						num=sc.nextInt();
						s.removepen(num);
						break;
					case 7:
						s.showBal ();
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
class stationary
{
private int bk;
private int chp;
private int pen;
private int bal1;
private int bal2;
private int bal3;	
	public void addbk(int num)
	{
		bal1=bal1+num;
	}

	public void addchp(int num)
	{
		bal2=bal2+num;
	}	

		public void addpen(int num)
	{
		bal3=bal3+num;
	}

		public void removebk(int num)
	{
		bal1=bal1-num;
	}
	
		public void removechp(int num)
	{
		bal2=bal2-num;
	}

		public void removepen(int num)
	{
		bal3=bal3-num;
	}

	public void showBal()
	{
		System.out.println("Balance of bk is "+bal1);
		System.out.println("Balance of chp is "+bal2);
		System.out.println("Balance of pen is "+bal3);
	}



}