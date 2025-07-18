import java.util.Scanner;

class FibonacciRec 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of  : ");
        int num = sc.nextInt();

        System.out.println("Fibonacci Series is :");
        printFibonacci(0, 1, 1, num);
    }
    public static void printFibonacci(int n1, int n2, int count, int num) 
	{
        if (count > num)
            return;

        System.out.print(n1 + " ");
		int n3 = n1 + n2;
        printFibonacci(n2, n3, count + 1, num);
    }
}

