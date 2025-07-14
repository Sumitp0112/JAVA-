import java.util.Scanner;

class Factor 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int fact = factor(sc.nextInt());
	}
	public static int factor(int num)
	{
		int fact = 1;
		for(int den = 1 ; den <= num/2 ; den++ )
        {
          if(num % den == 0)
          {
            System.out.println(den);
          }
        }
		return fact;
	}
}
