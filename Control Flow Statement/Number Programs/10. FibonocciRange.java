import java.util.Scanner;

class FibonacciRange 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Starting Number : " );
		int start = sc.nextInt();
		
		System.out.println("Enter Ending Number : " );
		int last = sc.nextInt();
		
		int n1 = 0;
		int n2 = 1;
		int n3 = 2;
		
		while (n1 <= last)
		{
			n3 = n1 + n2;
			if (n1 >= start)
			{
				System.out.println(n1);	
			}
			n1 = n2;
			n2 = n3;
		}
	}
}
