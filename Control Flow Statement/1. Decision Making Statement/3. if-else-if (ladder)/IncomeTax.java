/*
Syntax = if(condition)
          {
              Statement;
          }
          else if(condition)
          {
              Statement;
          }
          else if(condition)
          {
              Statement;
          }
          .
          .
          else{
                Statement;
          }
*/
import java.util.Scanner;

class IncomeTax 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Annual Income: ");
		
		double income = sc.nextDouble();
		
		double tax = 0.0;
		
			if (income <= 300000) 
			{
				tax = 0;
				System.out.println("Tax For Your Income Is 0%");
			} 
			else if (income <= 600000) 
			{
				tax = income * 0.05;
				//tax = (income - 300000) * 0.05;
				System.out.println("Tax For Your Income Is 5%");
				System.out.println("Your Tax Amount Is :"+tax);
			} 
			else if (income <= 900000) 
			{
				tax = income * 0.10;
				//tax = (300000 * 0.05) + (income - 600000) * 0.10;
				System.out.println("Tax For Your Income Is 10%");
				System.out.println("Your Tax Amount Is :"+tax);
			} 
			else if (income <= 1200000) 
			{
				tax = income * 0.15;
				//tax = (300000 * 0.05) + (300000 * 0.10) + (income - 900000) * 0.15;
				System.out.println("Tax For Your Income Is 15%");
				System.out.println("Your Tax Amount Is :"+tax);
			} 
			else if (income <= 1500000) 
			{
				tax = income * 0.20;
				//tax = (300000 * 0.05) + (300000 * 0.10) + (300000 * 0.15) + (income - 1200000) * 0.20;
				System.out.println("Tax For Your Income Is 20%");
				System.out.println("Your Tax Amount Is :"+tax);
			} 
			else
			{
				tax = income * 0.30;
				//tax = (300000 * 0.05) + (300000 * 0.10) + (300000 * 0.15) + (300000 * 0.20) + (income - 1500000) * 0.30;
				System.out.println("Tax For Your Income Is 30%");
				System.out.println("Your Tax Amount Is :"+tax);
			}
	}
}
