import java.util.Scanner;

class EvenOddCount 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		
		int num = sc.nextInt();
		int evenCount = 0;
		int oddCount = 0;
		
		while (num != 0)
		{
			if (num %2 == 0)
			{
				 evenCount++;
			}
			else {
				 oddCount++;
			}
			num = num/10;
		}
		System.out.println(evenCount);
		System.out.println(oddCount);
	}
}
