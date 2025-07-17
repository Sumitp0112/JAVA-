import java.util.Scanner;
class CovertNegToPos
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Negative number : ");
		
		int num = sc.nextInt();
		negative(num);
	}
	public static void negative(int num)
	{
		int positive = num ;
		//int positive = (num < 0) ? -num : num;
		if (num < 0)
		{
			positive = num * -1; 
		}
		System.out.println(positive);
		
	}
}
