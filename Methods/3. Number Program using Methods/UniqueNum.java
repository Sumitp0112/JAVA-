import java.util.Scanner;
class UniqueNum 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		uniqueNum(num);
		
		
	}
	public static void uniqueNum(int num)
	{
		boolean flag=true;
		while(num>0)
		{
			int count=0;
			int temp=num;
			while(temp>0)
			{
				if (num%10==temp%10)
				{
					count++;
				}
				temp/=10;
			}
			if(count>1)
			{
				flag=false;
				break;
			}
			num/=10;
		}
		if (flag)
		{
			System.out.println("it is an unique number");
		}
	    else
		{
			System.out.println("not an unique number");
		}
			
	}
		
}
