import java.util.Scanner;

class RangeOfArmstrongNum
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
			int temp1 = start;
			int count = 0;
			int sum = 0;
			
			for (int temp = start ;temp > 0; temp /= 10 )
			{
				count++;
			}
			for ( int temp = start ; temp != 0 ; temp /= 10 )
			{
				int last = temp % 10;
				int power = 1;
				
				for (int i = 0 ;i < count ; i++ )
				{
					power = power * last;
				}
				sum = sum + power;
				
			}
			if (sum == temp1)
			{
				System.out.println(start);
			}
			start++;
		}
	}
}
