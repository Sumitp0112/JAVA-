import java.util.Scanner;

class MaxDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number : ");
		int num = sc.nextInt();
		System.out.println(maxDigit(num));
	}
	public static int maxDigit(int num)
	{
		int max = -1 ;
		while (num != 0)
		{
			int last = num % 10;
			if (last > max)
			{
				max = last;
			}
			num /= 10;
		}
		return max;
	}
}
