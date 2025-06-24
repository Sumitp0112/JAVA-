import java.util.Scanner;
class Power
  {
    public static void main(String [] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your base number :");
      int base = sc.nextInt();
      System.out.println("Enter your raise number :");
      int raise = sc.nextInt();
      int power = 1;
      while(raise > 0)
        {
          power = power * basee;
          raise--;
        }
      System.out.println("The power of given number is :"+power);
    }
  }

// or //

import java.util.Scanner;

class Power 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		System.out.println("Enter a power : ");
		int power = sc.nextInt();
		
		int ans = 1;
		
		for (int i = 0 ; i < power ; i++ )
		{
			ans = ans*num;
		}
		System.out.println(ans);
	}
}
