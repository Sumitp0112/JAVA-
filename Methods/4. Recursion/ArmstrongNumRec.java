import java.util.Scanner;
class ArmstrongNumRec 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int digits = count(num, 0);
		if (isArmstrong(num,num,0,digits))
		{
			System.out.println("It is a Armstrong number");
		}
		else
			System.out.println("NOT Armstrong number");
	}
	public static int power(int base, int raise)
	{
		return raise == 0 ? 1: base*power(base,raise-1);
	}
	public static int count(int num , int ct)
	{	
		
		
		//return num == 0 ? ct : count(num / 10,ct+1);
		
		if (num == 0)
		{
			return ct ;
		}
		return count(num / 10 ,ct+1);
	}
	public static boolean isArmstrong(int num,int temp,int sum,int ct)
	{
		return num == 0 ? sum == temp :isArmstrong(num/10,temp,sum+power(num % 10,ct),ct);
	}
}
