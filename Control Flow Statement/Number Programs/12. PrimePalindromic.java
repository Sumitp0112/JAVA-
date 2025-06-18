import java.util.Scanner;

class  PrimePalindromic
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		int temp = num;
		int rev = 0;
		boolean isPrime = true;
		boolean isPalindrome = true ;
		for (int i =2 ; i <=num/2 ;i++ )
		{
			if (num %i == 0)
			{
				isPrime = false;
			}
		}
		while (num > 0)
		{
			int last = num % 10;
			rev = rev*10 + last;
			num /=10;
			System.out.println(num);
			isPalindrome = true;
		}
		if (isPalindrome && isPrime )
		{
			System.out.println("Is Prime Palindromic Number");
		}
		else{
			System.out.println("Is not Prime Palindrome Number");
		}
	}
}
