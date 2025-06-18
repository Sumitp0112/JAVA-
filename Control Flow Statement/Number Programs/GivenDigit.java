import java.util.Scanner;

class GivenDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		System.out.println("Enter a Digit: ");
		int digit = sc.nextInt();
		int last = 0;
		int temp = digit;
		int rev = 0;
		
		while (num > 0)
		{
			last = num % 10;
			//rev = rev*10 + last;
			num /= 10;
			if (temp == last)
			{
				System.out.println("The given digit is present in Number");
				return;
			}
		}
		System.out.println("Bhaii/Behn ye Digit Number main Nhi hai");
					
	}
}
