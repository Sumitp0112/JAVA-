import java.util.Scanner;
class Factorial
  {
    public satic void main(String [] agrs)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your number :");
      int num = sc.nextInt();
      int fact = 1;

      while(num > 0)
        {
          fact = fact * num;
          num--;
        }
      System.out.println("The factorial of given number : "+fact);
    }
  }
