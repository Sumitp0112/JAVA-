/*
Syntax = if(condition)
          {
              Statement;
          }
          else if(condition)
          {
              Statement;
          }
          else if(condition)
          {
              Statement;
          }
          .
          .
          else{
                Statement;
          }
*/
import java.util.Scanner;
class CheckChar  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		
		char ch = sc.next().charAt(0);
		
		if (ch>='a' && ch<='z')
		{
			System.out.println("It is Lowercase character");
		}
		else if (ch>='A' && ch<='Z')
		{
			System.out.println("It is Uppercase Character");
		}
		else if (ch>='0' && ch<='9')
		{
			System.out.println("It is Digit");
		}
		else 
		{
			System.out.println("It is special character");
		}
	}
}
