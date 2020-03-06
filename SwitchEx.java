import java.util.Scanner;
class SwitchEx
{
	public static void main(String []arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		System.out.println(n);
		switch(n)
		{
			case 10:
			{
				System.out.println("she will shop for 1000$");
				break;
			}
			case 20:
			{
				System.out.println("she will shop for 2000$");
				break;
			}
			default:
			{
				System.out.println("she will not shop at all");
			}
			
		}
	}

}