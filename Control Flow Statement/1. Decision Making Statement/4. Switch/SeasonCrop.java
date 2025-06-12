import java.util.Scanner;

class SeasonCrop 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Kharif(Monsoon)");
		System.out.println("2. Radi(Winter)");
		System.out.println("3. Zaid(Summer)");
		
		System.out.println("Enter The Season:");
		
		int season = sc.nextInt();
		
		switch (season)
		{
		case 1:
			{
				System.out.println("Ther is a monsoon season");
				System.out.println("Major crops include rice, cotton, jute etc. ");
				break;
			}
		case 2:
			{
				System.out.println("Ther is a Winter season");
				System.out.println("Major crops include Wheat, oat, Bajra etc. ");
				break;
			}
		case 3:
			{
				System.out.println("Ther is a season");
				System.out.println("Major crops include Pumkin, Tomato, Melon etc. ");
				break;
			}
		default:
			{
				System.out.println("Invalid Season");
			}
		}
	}
}
