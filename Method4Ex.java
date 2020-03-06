class Method4Ex
{
	public static void main(String arg[])
	{
		Method4Ex me=new Method4Ex();
		int x=me.add(12,34);	
		System.out.println(x);
		int y=me.add(2,3)+me.add(4,5);
		System.out.println(y);
		System.out.println(sub(67,32));
		int z=me.add(1,2)+sub(5,3);
		System.out.println(z);
		
	}
	int add(int a,int b)
	{
	
	return a+b;


	}
	static int sub(int a,int b)
	{
		
	return a-b;
	}	
	
}