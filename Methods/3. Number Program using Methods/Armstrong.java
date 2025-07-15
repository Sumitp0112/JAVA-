import java.util.Scanner;

class Armstrong 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		
		int num = sc.nextInt();
		if (isArmstrong(num))
		{
			System.out.println("It is Armstrong");
		}
		else
			System.out.println("Not Armstrong");
		
	}
	public static boolean isArmstrong(int num)
	{
		int temp = num ;
		int count = 0;
		int sum = 0;
		
		for (int i = temp ; i>0 ;i/=10 )
		{
			count++;
		}
		for (int i = temp ;i >0  ;i /= 10 )
		{
			int last = i % 10;
			int pow = 1;
			for (int j = 0; j < count ; j++ )
			{
				pow = pow * last ; 
			}
			sum += pow;
			
		}
		return sum==num;
	}
}
