// GIVE NUMBER IN ASCENDING ORDER

import java.util.Scanner;
class FirstMissingDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int num = sc.nextInt();
		missingDigit(num);
	}
	public static void missingDigit(int num)
	{
		int temp = num;
		int min = 10 ;
		int max = -1 ;
		
		while (num > 0)
		{
			int last = num % 10 ;
			
			if (last > max)
			{
				max = last ;
			}
			else if (last < min)
			{
				min = last ;
			}
			num /= 10 ;
		}
		num = temp ;
		
		for (int i = min ; i <= max ; i++ )
		{
			int rev = num ;
			boolean flag = false ;
			
			while (rev > 0)
			{
				int last = rev % 10 ;
				
				if (last == i)
				{
					flag = true ;
					break ;
				}
				rev /= 10 ;
			}
			if (!flag)
			{
				System.out.println(i);
				break ;
			}
		}
	}
}

