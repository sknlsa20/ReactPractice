class UnbranchedStatement
{
public static void main(String arg[])
{
	int n=10;

	for(int i=1;i<=10;i++)
	{
		if(i==5)
		{
		continue;
		}
		else if(i==8)
		{
		break;
		}
		else
		{
		
		System.out.println(n+" X "+i+" = "+(i*n));
		}

	}
}
}