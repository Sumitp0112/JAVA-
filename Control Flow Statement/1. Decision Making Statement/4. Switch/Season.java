import java.util.Scanner;

class Season 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Month: ");
		String mon = sc.next();
		
		switch (mon)
		{
			case "march":
			case "april":
			case "may":
			case "june":
			{
				System.out.println("Ther are Summer Season");
				break;
			}
			case "july":
			case "august":
			case "september":
			case "october":
			{
				System.out.println("Ther are Mansoon Season");
				break;
			}
			case "november":
			case "december":
			case "january":
			case "february":
			{
				System.out.println("Ther are Winter Season");
				break;
			}
		}
	}
}
