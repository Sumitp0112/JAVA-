//Smallest of 3 number

class Condtional4
  {
    public static void main (String [] args)
    {
      int a1 = 10;
      int a2 = 20;
      int a3 = 30;

      int ans = a1 < a2 ? a1 : a2;
      //System.out.println(ans);

      int ans1 = a3 < ans ? ans : a3;
      System.out.peintln(ans1);
    }
  }
