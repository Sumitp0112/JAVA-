import java.util.Scanner;

class EvenOdd 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		evenOdd();
	}
	public static void evenOdd()
	{
		System.out.println("Enter your number : ");
		int num = sc.nextInt();
		if (num % 2 == 0)
		{
			System.out.println(num+" even");
		}
		else
			System.out.println(num+" odd");
	}
}
