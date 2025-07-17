import java.util.Scanner;
class Fascinating 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int num = sc.nextInt();
		isFascinating(num);
		
	}
	public static void isFascinating(int num)
	{
		int one=0,two=0,three=0,four=0,five=0,six=0,seven=0,eight=0,nine=0 ;
		
		int count = (int)Math.log10(num)+1;
		//System.out.println("count :"+count);
		
		if (count == 3)
		{
			int merge = 0 ;
			
			for (int i = 1 ;i<=count ;i++ )
			{
				int mul = num * i ;
				merge = merge * 1000 + mul ;
			}
			while (merge > 0)
			{
				switch (merge % 10)
				{
				case 1:
					{
						one++ ; break ;
					}
				case 2:{ two++ ; break ; }
				case 3:
					{
						three++ ;
						break ;
					}
				case 4:
					{
						four++ ;
						break ;
					}
				case 5:
					{
						five++ ;
						break ;
					}
				case 6:
					{
						six++ ;
						break ;
					}
				case 7:
					{
						seven++ ;
						break ;
					}
				case 8:
					{
						eight++ ;
						break ;
					}
				case 9:
					{
						nine++ ;
						break ;
					}
				
				}
				merge /= 10 ;
				
			}
			if (one==1&&two==1&&three==1&&four==1&&five==1&&six==1&&seven==1&&
				eight==1&&nine==1)
			{
				System.out.println("It is a Fascinating number");
			}
			else
				System.out.println("Not Fascinating number");
		}
		else{
			System.out.println("Invalid Number");
		}
	}
}
