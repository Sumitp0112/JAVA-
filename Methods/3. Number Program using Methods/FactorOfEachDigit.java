import java.util.Scanner;
class FactorOfEachDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int num = sc.nextInt();
		factorOfDigit(num);
	}
	public static void factorOfDigit(int num)
	{
		int temp = num ;
		
		while (num > 0)
		{
			int last = num % 10 ;
			
			for(int den = 1 ; den <= last ; den++ )
			{
			  if(last % den == 0)
			  {
				System.out.println(last+" factor is : "+den);
			  }
			}
			num /= 10;
		}
	}
}
