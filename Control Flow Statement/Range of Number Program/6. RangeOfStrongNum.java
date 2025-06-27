import java.util.Scanner;

class RangeOfStrongNum
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
			int sum = 0;
			
			while (temp > 0)
			{
				int last = temp %10 ;
				int fact = 1;
				while (last > 0)
				{
					fact = fact * last;
					last--;
				}
				sum = sum + fact;
				temp /= 10;
			}
			if (sum == start)
			{
				System.out.println(start);
			}
			start++;
		}
	}
}
