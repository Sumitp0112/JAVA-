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

class Driving 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Age: ");
		int Age = sc.nextInt();
		
		if (Age>=18)
		{
			System.out.println("Enter Your RTO Marks: ");
			double marks = sc.nextDouble();
			
			if (marks>=60)
			{
				System.out.println("Excellent Your Eligible For Driving Licence");
				System.out.println("Prepar For Your Driving Trials");
			}
			else if (marks<60)
			{
				System.out.println("Ohh!! No Your RTO Exam Score Is Low");
				System.out.println("Your Not Eligible For Driving Licence");
				System.out.println("Reapplied RTO Test");
			}
		}else
		{
			System.out.println("Your Not Eligible For Driving Licence");
		}
	}
}
