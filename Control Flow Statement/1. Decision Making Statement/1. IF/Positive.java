import java.util.Scanner;

class Positive 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number: ");
		int num = sc.nextInt();
		
		if(num>0)
		{
			System.out.println("Numbr Is Positive");
		}
		if(num<0)
		{
			System.out.println("Number Is Negative");
		}
		if(num==0)
		{
			System.out.println("Number Is Zero");
		}
		
	}
}
