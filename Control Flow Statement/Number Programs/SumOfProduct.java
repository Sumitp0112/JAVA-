import java.util.Scanner;

class SumOfProduct 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int num = sc.nextInt();
		int sum = 0;
		int product = 1;
		
		while (num != 0)
		{
			int last = num % 10;
			sum += last;
			product *= last;
			num /= 10;
		}
		System.out.println(sum);
		System.out.println(product);
		
		if (sum == product)
		{
			System.out.println("The sum and product of given number is same");
		}
		else
			System.out.println("The sum and product of given number is NOT same");
	}
}
