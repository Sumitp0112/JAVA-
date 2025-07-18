import java.util.Scanner;
class TechNum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int num = sc.nextInt();
		 checkTechNum( num);
		
	}
	public static void checkTechNum(int num)
	{
		int temp = num ;
		int sum = 0 ;
		int count = 0 ;
		while(temp>0)
		{
			count++;
			temp=temp/=10;
		}
		if(count%2==0)
		{
			int divisior=1;
			for(int i =0;i<count/2;i++)
			{
				divisior*=10;
			}
			int firstHalf=num/divisior;
			int secondHalf=num % divisior;
			sum=firstHalf+secondHalf;
			int square=sum*sum;
			if (square == num)
			{
				System.out.println("it is a tech number");
			}
			else{
				System.out.println("it is not a tech number");
			}
		}
		
	}
	
}
