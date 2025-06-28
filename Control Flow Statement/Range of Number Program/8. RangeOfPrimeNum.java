import java.util.Scanner;

class RangeOfPrimeNum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start number :");
		int start = sc.nextInt();
		System.out.println("Enter end number :");
		int end = sc.nextInt();
		
		while (start <= end)
		{
			int temp = start ;
			boolean isPrime = true;
			for (int i = 2 ; i <= temp/2 ; i++ )
			{
				if (temp%i==0)
				{
					//System.out.println("Is Not Prime Number");
					isPrime = false;
				}
				
			}
			if (isPrime)
			{
				System.out.println(start);
			}
			start++;
		}
	}
}
