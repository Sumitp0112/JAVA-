import java.util.Scanner;

class RangeOfAutomorphicNum
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
			int temp1 = start ;
			int count = 0;
			
			for (int temp = start ;temp > 0 ;temp /= 10 )
			{
				count++;
			}
			
			int square = start*start;
			int power = 1;
			
			for (int i = 0; i < count ;i++ )
			{
				power = power * 10;
			}
			
			if (square % power == temp1)
			{
				System.out.println(start);
			}
			
			start++;
		}
	}
}
