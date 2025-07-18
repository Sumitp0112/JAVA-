import java.util.Scanner;
class HarshadNum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int num = sc.nextInt();
		int sum = harshadNum(num);
		if (num % sum == 0)
		{
			System.out.println("it is harshad number");
		}
		else
			System.out.println("NOT harshad Number");
		
	}
	public static int harshadNum(int num)
	{
		int temp = num ;
		int sum = 0 ;
		while (temp > 0)
		{
			int last = temp % 10 ;
			sum += last ;
			temp /= 10 ;
		}
		return sum;
		
	}
}
