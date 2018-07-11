import java.util.*;

class Stock
{
	public static void main(String args[])
	{
		int num, ch, p=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to KANCHAN STATIONARY");
		Stationary s=new Stationary();
		do
		{
			System.out.println("Enter your choice:");
			System.out.println("1 for Add into the stock");
			System.out.println("2 for remove from the stock");
			System.out.println("3 for show balance");
			ch= sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Enter your choice:");
					System.out.println("1 for Adding Pen");
					System.out.println("2 for Adding rub");
					System.out.println("3 for Adding scl");
					ch= sc.nextInt();
					switch(ch)
					{
						case 1:
							System.out.println("Enter the number of pencil you want to add:");
							num=sc.nextInt();
							s.addpen(num);
							break;
						case 2:
							System.out.println("Enter the number of rubber you want to add:");
							num=sc.nextInt();
							s.addrub(num);
							break;
						case 3:
							System.out.println("Enter the number of scale you want to add:");
							num=sc.nextInt();
							s.addscl(num);
							break;
						default:
							System.out.println("Invalid Choice");
							break;
					}
					break;
				case 2:
					System.out.println("Enter your choice:");
					System.out.println("1 for removing Pen");
					System.out.println("2 for removing rub");
					System.out.println("3 for removing scl");
					ch= sc.nextInt();
					switch(ch)
					{
						case 1:
							System.out.println("Enter the number of pencil you want to remove:");
							num=sc.nextInt();
							s.removepen(num);
							break;
						case 2:
							System.out.println("Enter the number of rubber you want to remove:");
							num=sc.nextInt();
							s.removerub(num);
							break;
						case 3:
							System.out.println("Enter the number of scale you want to remove:");
							num=sc.nextInt();
							s.removescl(num);
							break;
						default:
							System.out.println("Invalid Choice");
							break;
					}
					break;
				case 3:
					s.showBal();
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
class Stationary
{
	private int pen;
	private int rub;
	private int scl;
	private int bal1;
	private int bal2;
	private int bal3;

	public void addpen(int num)
	{
		bal1= bal1 + num;
	}
	public void addrub(int num)
	{
		bal2= bal2+num;
	}
	public void addscl(int num)
	{
		bal3= bal3 + num;
	}
	public void removepen(int num)
	{
		bal1= bal1 - num;
	}
	public void removerub(int num)
	{
		bal2= bal2 - num;
	}
	public void removescl(int num)
	{
		bal3= bal3 - num;
	}
	public void showBal()
	{
		System.out.println("Balance of pencil is "+bal1);
		System.out.println("Balance of rubber is "+bal2);
		System.out.println("Balance of scale is "+bal3);
	}
}
	
	
	
	
	