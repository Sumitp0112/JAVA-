import java.util.Scanner;

class RangeOfPerfectNum
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
			//int sum = 0 ;
			int fact = 0 ;
			for (int i =  1; i <= temp/2 ;i++ )
			{
				if (temp % i == 0)
				{
					fact = fact + i;
				}
			}
			if (fact == start)
				{
					System.out.println(start);
				}
				start++;
		}
	}
}
