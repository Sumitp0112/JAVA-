import java.util.Scanner;
class  CountOfDigit
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		//int num = sc.nextInt();
		
		//int count = countOfDigit(num);
		
		System.out.println("Count of digit is : "+countOfDigit(sc.nextInt()));
	}
	public static int countOfDigit(int num)
	{
		int count = 0;
		while (num != 0)
		{
			count++;
			num /= 10;
		}
		return count;
	}
}
