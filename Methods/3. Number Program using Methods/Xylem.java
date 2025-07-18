import java.util.Scanner;
class Xylem 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a number: ");
		int num=new Scanner(System.in).nextInt();
		xylem(num);
	}
	public static void xylem(int num)
	{
		int sumOut=0,sumIn=0,temp=num;

		if(num<100)
		{
			System.out.println("Entered number should have at least 3 digits");
			return;
		}
		while(temp != 0)
		{
			int last = temp % 10 ;
			
			if(temp==num || temp<10)
				sumOut += last ;
			else
				sumIn += last ;

			temp/=10;
		}
		if(sumOut == sumIn)
			System.out.println(num+" is an Xylem number");
		else
			System.out.println(num+" is not an Xylem number");

	}
}
