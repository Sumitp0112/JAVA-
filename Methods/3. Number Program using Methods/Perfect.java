import java.util.Scanner;
class Perfect 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number ");
		int num = sc.nextInt();
		if (isPerfect(num))
		{
			System.out.println("It is a Perfect number ");
		}
		else
			System.out.println("Not Perfect number ");
		
	}
	public static boolean isPerfect(int num)
	{
		int sum = 0;
		
		for (int i = 1 ; i <= num/2 ;i++ )
		{
			if (num % i == 0)
			{
				sum += i;
			}
		}
		return sum==num ;
	}
}
