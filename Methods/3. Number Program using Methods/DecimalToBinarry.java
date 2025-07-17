import java.util.Scanner;
class DecimalToBinarry
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Decimal numebr :");
		int num = sc.nextInt();
		deciToBin(num);
	}
	public static void deciToBin(int num)
	{
		int bin = 0 ;
		int i = 1;
		while (num > 0)
		{
			int rem = num % 2 ;
			bin = rem * i + bin;
			i = i *10;
			num /= 2;
		}
		System.out.println(bin);
	}
}
