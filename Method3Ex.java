class Method3Ex
{
	public static void main(String arg[])
	{
		Method3Ex me=new Method3Ex();
		int x=me.add();	
		System.out.println(x);
		int y=me.add()+me.add();
		System.out.println(y);
		System.out.println(sub());
		int z=me.add()+sub();
		System.out.println(z);
		
	}
	int add()
	{
	int a=90,b=34;
	return a+b;


	}
	static int sub()
	{
		int a=90,b=34;
	return a-b;
	}	
	
}