class PowSuqSurt
{
	public static void main(String[] args) 
	{
		pow(3,6);
		square(3);
		sqrt(16);
		
	}
	public static void pow(int num,int pow)
	{
		int op = 1 ;
		for (int i = 1 ;i <= pow ; i++)
		{
			op = op * num;
		}
		System.out.println("power of "+num+" is "+op);
	}
	public static void square(int num)
	{
		int sqr = num * num;
		System.out.println("Square of "+num+" is "+sqr);
	}
	public static void sqrt(int num)
	{
		int sqrt = 0;
		for (int i = 1 ; i <= num/3 ; i++ )
		{
			if (i * i == num)
			{
				sqrt = i ;
				break ;
			}
		}
		if (sqrt != 0)
		{
			System.out.println("Sqrt of "+num+" is "+sqrt);
		}
		else
			System.out.println(num+" doesnt have perfect sqrt");
	}
}
