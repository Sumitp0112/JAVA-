import java.util.Scanner;
class CountOfNumRec
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		System.out.println(count(sc.nextInt(),0));
		
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
}
