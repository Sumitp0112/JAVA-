import java.util.Scanner;
class Fibonacci1Rec 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		fibo(0,1,num);
	}
	public static void fibo(int n1, int n2, int num)
	{
		if (num > 0)
		{
			int n3 = n1 + n2 ;
			System.out.print(n1+" ");
			
			fibo(n2,n3,num-1);
		}
		return;
	}
}
