import java.util.Scanner;
class HCF
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int first = sc.nextInt();
		
		System.out.println("Enter second number : ");
		int second = sc.nextInt();
		
		HCF(first,second);
	}
	public static void HCF(int n1 , int n2 )
	{
		int small = n1 < n2 ? n1:n2;
		
		while (true)
		{
			if (n1 % small == 0 && n2 % small == 0)
			{
				System.out.println(small);
				break ;
				
			}
			small--;
		}
	}
}
