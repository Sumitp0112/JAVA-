import java.util.Scanner;

class RangeOfUglyNum 
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int start = sc.nextInt();
        System.out.print("Enter end number: ");
        int end = sc.nextInt();
		
		for (int i = start; i <= end; i++) 
		{
            int num = i;

            // Skip 1
            if (num == 1)
                continue;
			
			while(num > 1)
			{
				if (num % 2 == 0)
				{
					num /= 2;
				}
				else if (num % 3 == 0)
				{
					num /= 3;
				}
				else if (num % 5 == 0)
				{
					num /= 5;
				}
				else{
					break;
				}
            }
            if (num == 1)
                System.out.println(i); // It's an ugly number
		}

	}
}
