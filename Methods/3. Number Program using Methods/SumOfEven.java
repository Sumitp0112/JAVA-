import java.util.Scanner;

class SumOfEven 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int num = sc.nextInt();
		sumOfEven(num);
	}
	public static void sumOfEven(int num)
	{
		int sum = 0;
		while (num != 0)
		{
			int last = num % 10 ;
			if (last % 2 == 0)
			{
				sum += last;
			}
			num /= 10;
		}
		System.out.println(sum);
	}
}
