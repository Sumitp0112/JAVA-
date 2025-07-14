import java.util.Scanner;

class SumOfDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int num = sc.nextInt();
		
		int sum = sumOfDigit(num);
		System.out.println("Sum of Digit is : "+sum);
	}
	public static int sumOfDigit(int num)
	{
		int sum = 0;
		while (num != 0)
		{
			sum = sum + num % 10 ;
			num /= 10 ;
		}
		return sum;
	}
}
