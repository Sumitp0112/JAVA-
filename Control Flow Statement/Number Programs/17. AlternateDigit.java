import java.util.Scanner;
class AlternateDigit
  {
    public satic void main(String [] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your number : ");
      int num = sc.nextInt();

      while(num != 0)
        {
          int last = num % 10;
          num /= 100;
          System.out.println(last);
        }
    }
  }
