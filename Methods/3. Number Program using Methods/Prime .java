import java.util.Scanner;

class Prime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ") ;
		int ip = sc.nextInt() ;
		int den = prime(ip) ;
		
		if (den == ip)
		{
			System.out.println("It is a Prime");
		}
		else
			System.out.println("It is not Prime");
	}
	public static int prime(int num)
	{
		int den = 2 ;
		while (den < num)
		{
			if (num % den == 0)
			{
				break ;
			}
			den++;
		}
		//System.out.println("den : "+den);
		return den;
		
	}
}
