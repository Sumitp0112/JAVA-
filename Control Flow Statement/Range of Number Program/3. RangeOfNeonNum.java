import java.util.Scanner;
class RangeOfNeonNum 
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
			int mul = temp*temp;
			
			while (mul > 0)
			{
				sum = sum + (mul % 10);
				mul /= 10;
			}
			if (sum == start)
			{
				System.out.println(start);
			}
			start++;
		}
	}
}
