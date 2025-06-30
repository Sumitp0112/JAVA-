import java.util.Scanner;

class RangeOfEvilNum
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter starting  number: ");
		int start = sc.nextInt();
        System.out.print("Enter endinig number: ");
        int end = sc.nextInt();
		
		while (start <= end)
		{
			int num = start;
			String bin = "";
			while (num > 0)
			{
				int last = num % 2;
				bin = bin + last;
				num /= 2;
			}
			int rev = Integer.parseInt(bin);
			int count = 0;
			
			while (rev > 0)
			{
				int last = rev % 10;
				if (last == 1)
				{
					count++;
				}
				rev /= 10;
			}
			if (count % 2 == 0)
			{
				System.out.println(start);
			}
			start++;
		}
	}
}
