import java.util.Scanner;

class NeonNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		if (isNeon(sc.nextInt()))
		{
			System.out.println("It is a neon number ");
		}
		else
			System.out.println("Not neon Number");
		
	}
	public static boolean isNeon(int num)
	{
		int sqr = num*num;
		int sum = 0;
		while (sqr > 0)
		{
			sum += sqr % 10;
			sqr /= 10 ;
		}
		return sum==num;
	}
}
