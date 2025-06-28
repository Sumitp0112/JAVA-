import java.util.Scanner;

class RangeOfTechNum
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
			int temp = start;
			int sum = 0;
			
			while (temp > 0)
			{
				int last = temp % 100;
				sum = sum +last;
				temp /= 100;
			}
			int square = sum*sum;
			if (square == start)
			{
				System.out.println(start);
			}
			start++;
		}
	}
}
