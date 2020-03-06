import java.util.Scanner;
class ArrrayEx1
{
	public static void main(String arg[])
	{
		int a[]=new int[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 4 values");
		for(int i=0;i<4;i++)
		{
			a[i]=sc.nextInt();
		}

		
		
		for(int i=0;i<4;i++)
		{
			System.out.println(a[i]);
		}
		
	
	}
}
	