import java.util.Scanner;
class CountDuplicate
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int num = sc.nextInt();
		countDup(num);
	}
	public static void countDup(int num)
	{
		int count1 = 0 ;
		for (int i = 0;i<=9 ;i++ )
		{
			int count = 0;
			int temp = num ;
			
			while (temp > 0)
			{
				if (i == temp % 10)
				{
					count++;
				}
				temp /= 10;
			}
			
			if (count > 1)
			{
				count1++;
				//System.out.println(i+" present in : "+count+" times");
			}
		}
		System.out.println(count1);
	}
}
