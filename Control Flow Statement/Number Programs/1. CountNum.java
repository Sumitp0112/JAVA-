import java.util.Scanner;
class  CountNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		
		int num = sc.nextInt();
		int i = 0;
		
		while (num != 0)
		{
			num = num / 10;
			i++;
		}
		System.out.println(i);
    }
}
