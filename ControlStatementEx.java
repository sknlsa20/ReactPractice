class ControlStatementEx
{
	int a=90;
	static int b=145;
	public static void main(String arg[])
	{
		int c=87;
		ControlStatementEx ce=new ControlStatementEx();
		if(ce.a>b)
		{
			if(ce.a>c)
			{
				System.out.println("a is bigger");
			}
			else
			{
				System.out.println("c is bigger");
			}
		}
		else if(b>c)
		{
			
			System.out.println("b is bigger");
		}
		else
		{
			System.out.println("c is bigger");
		}
		
		
	}
}