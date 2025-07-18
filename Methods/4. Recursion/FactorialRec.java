import java.util.Scanner;
class FactorialRec 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		System.out.println(factorial(sc.nextInt()));
	}
	public static int factorial(int num)
	{
		//return num == 1 ? 1:num*factorial(num-1);
		
		if (num == 0)
		{
			return 1;
		}
		return num*factorial(num-1);
	}
}
