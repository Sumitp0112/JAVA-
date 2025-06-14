import java.util.Scanner;

class Palindrome
  {
    public static void main(String [] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your number : ");
      int num = sc.nextInt();
      int temp = num;
      int rev = 0;
      while (num != 0)
        {
          int last = num % 10;
          rev = rev*10 + last;
          num /= 10;
        }
      if (temp == rev)
      {
      System.out.println("Is a palindromic number");
    }
      else
        System.out.println("Is NOt palindromic number");
  }
  
}
