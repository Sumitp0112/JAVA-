import java.util.Scanner;

class  Switch1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("----------Welcome----------");
		
		System.out.println("Enter Your First Number: ");
		float a = sc.nextFloat();
		
		System.out.println("Enter Your Second Number: ");
		float b = sc.nextFloat();
		
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Modules");
		
		System.out.println("Select The Option: ");
		int i = sc.nextInt();
		
		switch (i)
		{
		case 1 :
			{
				System.out.println("The Addition Of Your Number Is: "+(a+b));
				break;
			}
		case 2 :
			{
				System.out.println("The Subtraction Of Your Number Is: "+(a-b));
				break;
			}
		case 3 :
			{
				System.out.println("The Multiplicatiion Of Your Number Is: "+(a*b));
				break;
			}
		case 4 :
			{
				System.out.println("The Division Of Your Number Is: "+(a/b));
				break;
			}
		case 5 :
			{
				System.out.println("The Modules Of Your Number Is: "+(a%b));
				break;
			}
		default:
			{
				System.out.println("Enter Interger Number");
			}
		}	
	}
}
