class Method1Ex
{
	public static void main(String arg[])
	{
		System.out.println("this is main method");
		run(3);		
		Method1Ex me=new Method1Ex();
		me.walk(4);
	}
	
	static void run(int n)
	{
		for(int i=0;i<n;i++)
		{
		System.out.println("welcome to run method");
		}
	}

	void walk(int m)
	{
		for(int i=0;i<m;i++)
		{
		System.out.println("this is walk method");
		}
	}

}