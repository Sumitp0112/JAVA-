import java.util.Scanner;

class Interview 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Percentage: ");
		float perc = sc.nextFloat();
		
		if(perc >= 60 && perc <=100)
		{
			System.out.println("Your Aligible For Interview");
			
		}
		if(perc <60 && perc >=1)
		{
			System.out.println("You Are Not Aligible For Interview");
			
		}
	}
}
