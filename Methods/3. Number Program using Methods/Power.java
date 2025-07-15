import java.util.Scanner;
class  Power
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base number : ") ;
		int base = sc.nextInt() ;
		
		System.out.println("Enter raise number : ") ;
		int raise = sc.nextInt() ;
		
		System.out.println(power(base,raise));
		
	}
	public static int power(int base, int raise)
	{
		int pow = 1;
		while (raise > 0)
		{
			pow = pow * base;
			raise--;
		}
		return pow ;
	}
}
