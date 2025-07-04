import java.util.Scanner;
class UniqueNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number :");
		int num = sc.nextInt();
		
		boolean flag = true;
		
		while (num > 0)
		{
			int count = 0 ;
			int temp = num ;
			
			while (temp > 0)
			{
				if (num % 10 == temp % 10)
				{
					count++;
				}
				temp /= 10;
			}
			if (count > 1)
			{
				flag = false ;
				break ;
			}
			num /= 10 ;
		}
		if (flag)
		{
			System.out.println("It is Unique Number");
		}
		else{
			System.out.println("Not Unique Number");
		}
	}
}
