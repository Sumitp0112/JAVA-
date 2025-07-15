import java.util.Scanner;
class BinarryToDecimal
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Binary numebr :");
		int num = sc.nextInt();
		binToDeci(num);
	}
	public static void binToDeci(int num)
	{
		int bin = 0 ;
		int i = 1;
		while (num > 0)
		{
			int rem = num % 10 ;
			bin = rem * i + bin;
			i = i *2;
			num /= 10;
		}
		System.out.println(bin);
	}
}
