/*
Syntax = if (condition)      
         {
            Statement;
         }

An if statement as a condition along with block with cantain statement. 
The condition must be a boolean type.

Control Flow of IF:
          - The statement inside the if block gets executed only if condition evaluate the true.
          - If condition evaluate is false the if block is skipped or ignored.
*/
import java.util.Scanner;
class  If2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Are You A Paid Student?");
		boolean ip = sc.nextBoolean();
		
		if(ip)
		{
			System.out.println("Pay The Fees");
			
			
		}
		System.out.println("Attend The Class");
	}
}
