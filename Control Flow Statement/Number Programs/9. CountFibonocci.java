import java.util.*;

class CountFibonocci 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int num = sc.nextInt();
		int n1 = 1,n2=1,n3=2;
		int count = 0;
		for ( ;n1 <= num ; count++ )
		{
			n3 = n1 + n2;
			n1=n2;
			n2=n3;
		}
		System.out.println(count);
	}
}
