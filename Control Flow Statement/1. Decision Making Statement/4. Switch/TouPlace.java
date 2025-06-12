import java.util.Scanner;

class TouPlace
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Nashik");
		System.out.println("2. Pune");
		System.out.println("3. Ratanagiri");
		System.out.println("4. Kolhapur");
		System.out.println("5. Mumbai");
		
		System.out.println("Enter A City: ");
		int city = sc.nextInt();
		
		switch (city)
		{
		case 1:
			{
				System.out.println("Tourist place is Panchavti, Trimbakeshwar, Harihar Fort, Ramshej Fort, Sinner etc. ");
				break;
			}
		case 2:
			{
				System.out.println("Tourist place is Dagdusheth Ganapati Mandir, Shanivarvada Sarsbag, Tulshibag etc. ");
				break;
			}
		case 3:
			{
				System.out.println("Tourist place is Ganpatipule, Malwan, Devbag, Kasheli Beach, etc. ");
				break;
			}
		case 4:
			{
				System.out.println("Tourist place is Jotiba Mandir, Mahalakshmi Mandir, Masai Pathar etc. ");
				break;
			}
		case 5:
			{
				System.out.println("Tourist place is India Gate, Taj Hotel, Alibag, etc. ");
				break;
			}
		default:
			{
				System.out.println("Enter Correct City");
			}
		}
		
	}
}
