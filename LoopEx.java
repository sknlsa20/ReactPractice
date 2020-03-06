import java.util.Scanner;
class LoopEx
{	

	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a positive number");
		int n=sc.nextInt();
		int i=0;
		while(i<n)
		{
			System.out.println(i);
			i++;
		}
		System.out.println("-----------------------------");
		int j=0;	
		do{
			System.out.println(j);
			j++;
		}while(j<n);
		System.out.println("-----------------------------");
		for(int k=0;k<n;k++)
		{
			System.out.println(k);
		}


	}
}