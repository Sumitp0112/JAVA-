// Entered pin Validation

import java.util.Scanner;
class PinValidation
{
	public static void main(String[] args) 
	{
      Scanner sc = new Scanner(System.in);
	  int oldPin = 1234;
	  int attempt = 0;
	  
	  do
	  {
		  System.out.println("Enter your PIN : ");
		  int pin = sc.nextInt();
		  if (pin == oldPin)
		  {
			  System.out.println("Login Success!!");
			  break;
		  }
		  else
		  {
			System.out.println("Incorrect pin!!");
			attempt++ ;
		  }
	  }
	  while (attempt < 4);
	  if (attempt == 4)
	  {
		  System.out.println("Max attempt reached!!");
	  }
  }
}
