import java.util.Scanner;
class SwapValue
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value");
		int first = sc.nextInt();
		System.out.println("Enter second value");
		int second = sc.nextInt();
		swap(first,second);
	}
	public static void swap(int n1 , int n2)
	{
		int temp = n1 ;
		n1 = n2;
		n2 = temp;
		
		System.out.println("first : "+n1);
		System.out.println("second : "+temp);

	}
}
