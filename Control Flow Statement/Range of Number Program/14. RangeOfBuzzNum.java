import java.util.Scanner;
class RangeOfBuzzNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start number :");
		int start = sc.nextInt();
		System.out.println("Enter end number :");
		int end = sc.nextInt();
		
		for (int i = start; i <= end ; i++ )
		{
			int num = i;
			
			if (num % 10 == 7 || num % 7 == 0)
			{
				System.out.println(i);
			}
		}
	}
}
