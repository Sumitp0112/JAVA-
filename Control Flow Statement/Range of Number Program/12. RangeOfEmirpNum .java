import java.util.Scanner;

class RangeOfEmirpNum 
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int start = sc.nextInt();
        System.out.print("Enter end number: ");
        int end = sc.nextInt();
		
        for (int num = start; num <= end; num++) 
		{
			int count1 = 0;
            for (int i = 1; i <= num; i++) 
			{
                if (num % i == 0) 
				{
                    count1++;
                }
            }

            if (count1 == 2) 
			{
                // Reverse the number
                int n = num;
                int rev = 0;
                while (n > 0) 
				{
                    int d = n % 10;
                    rev = rev * 10 + d;
                    n = n / 10;
                }

                // Check if reversed number is prime and not equal to original
                if (rev != num) 
				{
                    int count2 = 0;
                    for (int i = 1; i <= rev; i++) 
					{
                        if (rev % i == 0) 
						{
                            count2++;
                        }
                    }

                    if (count2 == 2) 
					{
                        System.out.print(num + " ");
                    }
                }
            }
        }
    }
}
