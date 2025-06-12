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

class If3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number: ");
		
		int num = sc.nextInt();
		
		if(num%5 == 0 && num%2 != 0)
		{
			System.out.println("Hi Five");
		}
		if(num%2==0 && num%5!=0)
		{
			System.out.println("Hi Two");
		}
		if(num%5==0 && num%2==0)
		{
			System.out.println("Hi Five Two");
		}
	}
}
