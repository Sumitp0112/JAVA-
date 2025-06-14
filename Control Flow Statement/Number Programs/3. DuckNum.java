import java.util.Scanner;

class DuckNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Number: ");
		
		int num = sc.nextInt();
		if (num == 0)
		{
			System.out.println("Is a duck Number");
		}
		else
		{
			System.out.println("Is not duck Number");
		}
	}
}
