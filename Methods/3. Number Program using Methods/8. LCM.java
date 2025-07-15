import java.util.Scanner;
class LCM
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int first = sc.nextInt();
		
		System.out.println("Enter second number : ");
		int second = sc.nextInt();
		
		LCM(first,second);
	}
	public static void LCM(int n1 , int n2 )
	{
		int large = n1 > n2 ? n1:n2;
		int i = 1;
		while (true)
		{
			if ((large * i) % n1 == 0 && (large * i) % n2  == 0)
			{
				System.out.println(large * i);
				break ;
				
			}
			i++;
		}
	}
}
