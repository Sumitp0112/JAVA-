import java.util.Scanner;
class CountOfFactor
  {
    public static void main(String [] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your number : ");
      int num = sc.nextInt();
	  int count = 0;
	  
      for(int den = 1 ; den <= num ; den++ )
        {
          if(num % den == 0)
          {
            count++;
			System.out.println("Factor is :"+den);
          }
        }
      System.out.println("Count of factor is :"+count);
    }
}
