// Print odd number 1 to 100
class Odd
  {
    public static void main(String [] args)
    {
      int num = 1;
      while (num <= 100)
        {
          if (num %2 == 1)
          {
            System.out.println(num);
          }
          num++ ;
        }
    }
  }
