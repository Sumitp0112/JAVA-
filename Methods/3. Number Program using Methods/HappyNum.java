import java.util.Scanner;
class HappyNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		isHappyNum(num);
		
	}
	public static void isHappyNum(int num)
	{
		int temp = num;
		int sum = 0;
		do
		{
			sum = 0;
			while (temp > 0)
			{
				int last = temp % 10;
				sum += last*last ;
				temp /= 10 ;
			}
			temp = sum ;
		}
		while (sum >= 10);
		
		System.out.println(sum);
		if (sum==1)
		{
			System.out.println("It is a Happy number ");
		}
		else
			System.out.println("Not Happy Number ");
	}
}
