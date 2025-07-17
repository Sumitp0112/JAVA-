import java.util.Scanner;
class FirstTwoMissingDig 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int num = sc.nextInt();
		firstTowMiss(num);
	}
	public static void firstTowMiss(int num)
	{
		int missingCount = 0;
		for (int i  = 0; i<=9 ;i++ )
		{
			int temp = num ;
			int count = 0;
			//int missingCount = 0;
			while (temp > 0)
			{
				int last = temp % 10 ;
				if (last == i)
				{
					count++;
				}
				temp /= 10;
			}
			if (count == 0)
			{
				System.out.println(i);
				missingCount++;
			}
			if (missingCount == 2)
			{
				break;
			}
			
		}
	}
}
