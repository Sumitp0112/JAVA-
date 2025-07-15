import java.util.Scanner;
class BuzzNum 
{
	public static void main(String[] args) 
	{
		Scanner sc	= new Scanner(System.in);
		System.out.println("Enter the Number ");
		int num=sc.nextInt();
		isBuzz(num);
		
	}
	public static void isBuzz(int num)
	{
		if(num%10==7||num%7==0)
		{
			System.out.println("it is Buzz number");
		}
		else
		{
			System.out.println("it is not Buzz number");
		}
		
	}
	
}
