import java.util.Scanner;

class RangeOfTechNum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start number :");
		int start = sc.nextInt();
		System.out.println("Enter end number :");
		int end = sc.nextInt();
		
		while (start <= end)
		{
			int num = start;
            		int temp = num;
           		int count = 0;
			
			while (temp > 0) 
			{
		                count++;
                		temp = temp / 10;
            		}
			
			if (count % 2 == 0)
			{
				int divisor = 1;
                		for (int i = 0; i < count / 2; i++) 
				{
                    			divisor *= 10;
                		}
				
				int firstHalf = num / divisor;
				
				int secondHalf = num % divisor;
				
				int sum = firstHalf + secondHalf;
				
				int square = sum * sum;
				
				if (square == num)
				{
					System.out.println(num);
				}
			}
			start++;
		}
	}
}
