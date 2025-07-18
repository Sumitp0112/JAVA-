import java.util.Scanner;
class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		if (isPalindrome(num))
		{
			System.out.println("It is a Palindrome");
		}
		else
			System.out.println("It is Not Palindrome");
	}
	public static boolean isPalindrome(int num)
	{
		int rev = 0;
		int temp = num ;
		while (temp > 0)
		{
			rev = rev * 10 + (temp % 10);
			temp /= 10;
		}
		return rev == num;
	}
}
