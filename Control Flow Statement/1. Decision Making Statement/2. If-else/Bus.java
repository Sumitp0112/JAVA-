import java.util.Scanner;

class Bus
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Bus Ticket Amount");
		int Amt = sc.nextInt();
		
		System.out.println("Enter Your Age: ");
		int Age = sc.nextInt();
		
		if(Age<5)
		{
			System.out.println("Your are Aligible For Half Ticket And Your Payable Amount Is: " +Amt/2);
			
		}
		else{
			System.out.println("Your Are Not Aligible For Half Ticket Your Payable Amount Is: " +Amt); 
			
		}
	}
}
