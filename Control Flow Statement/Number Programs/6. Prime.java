import java.util.Scanner;

class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Number: ");
		int num = sc.nextInt();
		for (int i = 2 ; i <= num/2 ; i++ )
		{
			if (num%i==0)
			{
				System.out.println("Is Not Prime Number");
				return;
			}
		}
		System.out.println("Is Prime ");
	}
}
