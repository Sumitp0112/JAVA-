import java.util.Scanner;
class CoPrime 
{
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int n1 = sc.nextInt();
		System.out.println("Enter second number : ");
		int n2 = sc.nextInt();
		coPrime(n1,n2);
		
	}
	public static void coPrime(int n1,int n2)
	{
		int small = n1 < n2 ? n1:n2 ;
		while (true)
		{
			if (n1 % small == 0 && n2 % small == 0)
			{
				break ;
			}
			small--;
		}
		if (small == 1)
		{
			System.out.println("It is Co-Prime");
		}
		else
			System.out.println("NOT Co-Prime");
	}
}
