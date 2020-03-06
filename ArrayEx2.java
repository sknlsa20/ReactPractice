class ArrayEx2
{
	public static void main(String arg[])
	{
		int a[][][]={{{10,20},{30,40}},{{50,60},{70,80}}};

		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{	
				for(int k=0;k<2;k++)
				{
				System.out.print(a[i][j][k]+"   ");
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}	
}