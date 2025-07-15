import java.util.Scanner;
class MinDigit
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		System.out.println(minDigit(sc.nextInt()));
	}
	public static int minDigit(int num)
	{
		int min = 10 ;
		while (num != 0)
		{
			int last = num % 10;
			if (last < min)
			{
				min = last;
			}
			num /= 10;
		}
		return min;
	}
}
