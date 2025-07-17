import java.util.Scanner;
class  DuckNum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int num=sc.nextInt();
		isDuck(num);
		
	}
	public static void isDuck(int num)
	{
		int count=0;
		for (int i=num;i>0 ;i/=10 )
		{
			int last = num % 10 ;
			if (last==0)
			{
				count++;
				break;
			}
			
		}
		if (count>0)
		{
			System.out.println("number is duck Number");
		} 
		else
		{
			System.out.println("number is not duck Number");
		}
	}
}
