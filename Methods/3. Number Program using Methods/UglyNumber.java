import java.util.Scanner;
class UglyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		isUglyNum(num);
	}
	public static void isUglyNum(int num)
	{
		while (num > 1)
		{
			if (num % 2 == 0)
			{
				num /= 2;
			}
			else if (num % 3 == 0)
			{
				num /= 3;
			}
			else if (num % 5 == 0)
			{
				num /= 5 ;
			}
			else
				break ;
		}
		if (num == 1)
		{
			System.out.println("It is a Ugly number");
		}
		else
			System.out.println("Not ugly number");
	}
}
