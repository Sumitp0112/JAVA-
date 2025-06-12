import java.util.Scanner;

class If3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number: ");
		
		int num = sc.nextInt();
		
		if(num%5 == 0 && num%2 != 0)
		{
			System.out.println("Hi Five");
		}
		if(num%2==0 && num%5!=0)
		{
			System.out.println("Hi Two");
		}
		if(num%5==0 && num%2==0)
		{
			System.out.println("Hi Five Two");
		}
	}
}
