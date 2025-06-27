import java.util.Scanner;

class RangeOfHappyNum
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
			int num = start;
			int sum = 0;
		
			do
			{
				sum = 0;
				while (num > 0)
				{
					int last = num % 10;
					sum += last*last;
					num /= 10;
				}
				num = sum;
			}
			while (sum >= 10);
			if (sum == 1)
			{
				System.out.println(start);
			}
			start++;
		}
	}
}
