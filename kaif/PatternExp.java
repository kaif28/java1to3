class PatternExp
{
	public static void main(String args[])
	{
		int i,j,k,l;
		
		for(i=5;i>=1;i--)
		{
			System.out.println();
			for(l=i;l>=1;l--)
			{
				System.out.print(" ");
			}
			for(j=5;j>i;j--)
			{
				System.out.print(j);
			}
			for(k=i;k<=5;k++)
			{
				System.out.print(k);
			}
			
		}
	}
}
/*
5	1	5	5s
5	2	5	4s
5	3	5	3s
5	4	5	2s	
5	5	5	1s

	l=i;l<=5;l++
	
	l=5;l>=i;l--
*/
