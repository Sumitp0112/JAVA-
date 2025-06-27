import java.util.Scanner;

class RangeOfSpyNum 
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
			int prod = 1;
			
			while (temp > 0)
			{
				int last = temp % 10;
				sum = sum + last ;
				prod = prod * last;
				temp /= 10;
			}
			if (sum == prod)
			{
				System.out.println(start);
			}
			start++;
			
		}
	}
}
