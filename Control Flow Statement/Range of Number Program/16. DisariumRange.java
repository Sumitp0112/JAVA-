import java.util.Scanner;

class DisariumRange 
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
            int temp = num;
            int count = 0;

            // Count digits using for loop
            for (int t = temp; t > 0; t = t / 10) 
	    {
                count++;
            }

            // Calculate sum of digits powered with position
            int sum = 0;
            int div = 1;

            // Find divider to extract left-most digit
            for (int j = 1; j < count; j++) 
	    {
                div = div * 10;
            }

            int pos = 1;
            for (; div > 0; div = div /= 10) 
	    {
                int digit = num / div;

                int pow = 1;
                for (int k = 1; k <= pos; k++) 
		{
                    pow = pow * digit;
                }

                sum = sum + pow;
                num = num % div;
                pos++;
            }

            if (sum == temp) 
	    {
                System.out.print(temp + " ");
            }
        }
    }
}
