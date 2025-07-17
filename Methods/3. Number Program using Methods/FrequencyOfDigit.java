import java.util.Scanner;
class FrequencyOfDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int num = sc.nextInt();
		frequencyOfDigit(num);
	}
	public static void frequencyOfDigit(int num)
	{
		
		for (int i =0; i<=9 ;i++ )
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
			if (count > 0)
			{
				System.out.println(i+" present in : "+count+" times");
			}
		}
	}
}
