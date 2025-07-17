import java.util.Scanner;

class CurrencyConversion
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Rupee : ");
		double rupee = sc.nextFloat();
		rupeeToDollar(rupee);
	}
	public static void rupeeToDollar(double rupee)
	{
		System.out.println("rupee To Dollar begin ");
		double dollar = rupee / 85.50;
		System.out.println("dollar : "+dollar);
		System.out.println("rupee To Dollar end ");
		dollarToEuro(dollar);
	}
	public static void dollarToEuro(double dollar)
	{
		System.out.println("Dollar to Euro begin ");
		double euro =  dollar * 0.85;
		System.out.println("Euro : "+euro);
		System.out.println("Dollar to Euro end ");
		
	}
}
