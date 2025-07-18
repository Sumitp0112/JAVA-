import java.util.Scanner                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ;
class TwistedPrime  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int num = sc.nextInt();
		boolean checkPrime = prime(num);
		
		if (checkPrime)
		{
			int rev = reverse(num);
			if (prime(rev))
			{
				System.out.println("It is Twisted prime");
			} 
			else
				System.out.println("Not twisted prime ");
		}
		else
			System.out.println("NOT twisted prime");
	}
	public static int reverse(int num)
	{
		int rev = 0;
		while (num != 0)
		{
			rev = rev * 10 + (num % 10);
			num /= 10;
		}
		return rev;
	}
	public static boolean prime(int num)
	{
		int den = 2;
		while (den < num)
		{
			if (num % den == 0)
			{
				break ;
			}
			den++;
		}
		return num == den ;
	}
}
