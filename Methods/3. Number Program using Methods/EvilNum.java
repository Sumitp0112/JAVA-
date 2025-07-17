import java.util.Scanner;
class  EvilNum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		if (isEvil(num))
		{
			System.out.println("Number is Evil ");
		}
		else
		{
			System.out.println("Number is  not Evil ");
		}
	}
	public static boolean isEvil(int num)
	{
		String bin="";
		while(num>0)
		{
			int last=num%2;
			bin = last+bin;
			num/=2;
		}
		int rev=Integer.parseInt(bin);
		int count =0;
		while(rev>0)
		{
			int last=rev%10;
			if (last==1)
			{
				count++;
			}
			rev/=10;
		}
		return count%2==0;
	}
}
