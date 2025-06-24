import java.util.Scanner;
class SumOfFactor
  {
    public static void main(String [] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your number : ");
      int num = sc.nextInt();
	  int sum = 0;
	  
      for(int den = 1 ; den <= num ; den++ )
        {
          if(num % den == 0)
          {
            sum = sum + den;
			System.out.println("Factor is :"+den);
          }
        }
      System.out.println("sum of factor is :"+sum);
    }
}
