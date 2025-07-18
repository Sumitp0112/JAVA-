import java.util.Scanner;

class IsFibonacciRec 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isFibonacci(0, 1, num))
		{
            System.out.println("It is a Fibonacci number");
        } 
		else 
		{
            System.out.println("Not a Fibonacci number");
        }
    }
    // Recursive function to check if num is in Fibonacci series
    public static boolean isFibonacci(int a, int b, int num) 
	{
        if (a == num)
            return true;
        if (a > num)
            return false;
        return isFibonacci(b, a + b, num);
    }
}

