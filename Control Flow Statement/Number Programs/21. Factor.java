import java.util.Scanner;
class Factor
  {
    public static void main(String [] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your number : ");
      int num = sc.nextInt();

      for(int den = 1 ; den <= num/2 ; den++ )
        {
          if(num % den == 0)
          {
            System.out.println(den);
          }
        }
      System.out.println(num);
    }
  }
