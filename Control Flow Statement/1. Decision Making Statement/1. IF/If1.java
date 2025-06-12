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

class If1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Bill Amount: ");
		double Amt = sc.nextDouble();
		
		System.out.println("Having A Cupon Code?");
		boolean ip = sc.nextBoolean();
		
		if(ip)
		{
			Amt -=100;
			System.out.println("Rs. 100.0 of Applied");
		}
		System.out.println("Amount Payable: " +Amt);
		
	}
}
