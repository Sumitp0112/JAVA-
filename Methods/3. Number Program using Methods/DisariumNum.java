import java.util.Scanner;
class DisariumNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		//int num = sc.nextInt();
		if (isDisariumNum(sc.nextInt()))
		{
			System.out.println("It is a Disarium number ");
		}
		else
			System.out.println("Not diasarium number");
		
	}
	public static boolean isDisariumNum(int num)
	{
		int temp = num ;
		int count = 0 ;
		int sum = 0 ;
		
		while (temp != 0)
		{
			count++ ;
			temp /= 10 ;
		}
		temp = num ;
		while (temp != 0)
		{
			int last = temp % 10 ;
			int prod = 1 ;
			for (int i = 1 ; i <= count ; i++)
			{
				prod = prod * last ;
			}
			sum = sum + prod;
			temp /= 10 ;
			count--;
		}
		return sum == num;
	}
}
