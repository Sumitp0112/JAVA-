import java.util.Scanner;

class AutomorphicNum
{
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start number :");
		int num = sc.nextInt();
	
		automorphic(num);
	}
	public static void automorphic(int num)
	{
			int count = 0;
			
			for (int temp = num ;temp > 0 ;temp /= 10 )
			{
				count++;
			}
			
			int square = num*num;
			int power = 1;
			
			for (int i = 0; i < count ;i++ )
			{
				power = power * 10;
			}
			
			if (square % power == num)
			{
				System.out.println("It is Automorphic number");
			}
			else
				System.out.println("Not Automorphic number");
			
	}
}
