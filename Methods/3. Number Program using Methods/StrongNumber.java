import java.util.Scanner;
class StrongNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number ");
		int num = sc.nextInt();
	
		if (num == strong(num))
		{
			System.out.println("It is a Strong Number");
		}
		else
			System.out.println("Not Strong Number");
		
	}
	public static int strong(int num)
	{
		int sum = 0 ;
		
		while (num > 0)
		{
			int fact = 1;
			
			int last = num % 10 ;
			while (last > 0)
			{
				fact = fact * last;
				last--;
			}
			sum += fact ;
			num /= 10 ;
		}
		return sum;
	}
}
