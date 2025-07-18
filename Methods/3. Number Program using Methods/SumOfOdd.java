import java.util.Scanner;

class SumOfOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int num = sc.nextInt();
		sumOfOdd(num);
	}
	public static void sumOfOdd(int num)
	{
		int sum = 0;
		while (num != 0)
		{
			int last = num % 10 ;
			if (last % 2 == 1)
			{
				sum += last;
			}
			num /= 10;
		}
		System.out.println(sum);
	}
}

