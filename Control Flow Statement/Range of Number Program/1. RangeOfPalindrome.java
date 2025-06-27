import java.util.Scanner;

class RangeOfPalindrome
  {
    public static void main(String [] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter start number : ");
      int start = sc.nextInt();
	  
	  System.out.println("Enter end number : ");
      int end = sc.nextInt();
	  
	  while (start <= end)
		  {
				int temp = start;
				int rev = 0;
			
				while (temp > 0)
				{
					rev = rev*10 + (temp%10);
					temp /= 10;
				}
				if (rev == start)
				{
					System.out.println(start);
				}
				start++;
		}
  }
  
}
