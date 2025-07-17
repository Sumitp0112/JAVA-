import java.util.Scanner;
class EmirpNumber 
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int num = sc.nextInt();
        if (isEmirpNum(num))
        {
			System.out.println("It ia a Emirp Number");
        }
		else
			System.out.println("NOT Emirp Number");
	}
	public static boolean isEmirpNum(int num)
	{
			int count1 = 0;
			int count2 = 0;
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
                    
                    for (int i = 1; i <= rev; i++) 
					{
                        if (rev % i == 0) 
						{
                            count2++;
                        }
                    }
              }
         }
		 return count2 == 2;
    }
	
}
