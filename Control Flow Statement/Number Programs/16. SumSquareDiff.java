import java.util.Scanner;

class SumSquareDiff

{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Staring Number : ");
		int start = sc.nextInt();
		
		System.out.println("Enter Ending Number : ");
		int end = sc.nextInt();
		
		int sumOfSquare = 0 ;
		int sum = 0;
		 
		for (int i = start ; i <= end ; i++ )
		{
			sumOfSquare += i * i;
			sum += i ;
		}
		int squareOfSum = sum * sum;
		int diff = squareOfSum - sumOfSquare;
		
		System.out.println("The Sum of a square is : "+sumOfSquare);
		System.out.println("The square of the sum is : "+squareOfSum);
		System.out.println("The Difference : "+diff);
	}
}
