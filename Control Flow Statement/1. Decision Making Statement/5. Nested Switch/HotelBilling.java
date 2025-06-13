import java.util.Scanner;

class HotelBilling 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("---------Welcome to Patil Hotel---------");
		System.out.println("Enter a option: ");
		System.out.println("1. Veg");
		System.out.println("2. Non-Veg");
		
		int op = sc.nextInt();
		
		switch (op)
		{
			case 1:
			{
				System.out.println("---------Veg Menu---------");
				System.out.println("1. Poha      -----> 20.0");
				System.out.println("2. Upma      -----> 20.0");
				System.out.println("3. Vada Pav  -----> 50.0");
				System.out.println("4. Idli      -----> 25.0");
				System.out.println("5. Misal Pav -----> 70.0");
				System.out.println("Enter Your option: ");
				int ip = sc.nextInt();
				
				switch (ip)
				{
					case 1:
					case 2:
					{
						System.out.println("Enter the number of plate: ");
						int no = sc.nextInt();
						
						int total = 20*no;
						
						System.out.println("Total bill: "+total);
						break;
					}
					
					case 3:
					{
						System.out.println("Enter the number of plate: ");
						int no = sc.nextInt();
						
						int total = 50*no;
						
						System.out.println("Total bill: "+total);
						break;
					}
					case 4:
					{
						System.out.println("Enter the number of plate: ");
						int no = sc.nextInt();
						
						int total = 25*no;
						
						System.out.println("Total bill: "+total);
						break;
					}
					case 5:
					{
						System.out.println("Enter the number of plate: ");
						int no = sc.nextInt();
						
						int total = 70*no;
						
						System.out.println("Total bill: "+total);
						break;
					}
					default:
					{
						System.out.println("There are only 5 option Mere Bhai/Behn");
					}
				
				}
			}
			break;
			
			case 2:
			{
				System.out.println("----------Nov-Veg Menu---------");
				System.out.println("1. Chicken Thali     -----> 400.0");
				System.out.println("2. Fish Fry          -----> 400.0");
				System.out.println("3. Mutton Biryani    -----> 300.0");
				System.out.println("4. Chicken Biryani   -----> 250.0");
				System.out.println("5. Chicken Lollipoop -----> 170.0");
				System.out.println("Enter YPur option: ");
				int ip = sc.nextInt();
				
				switch (ip)
				{
					case 1:
					case 2:
					{
						System.out.println("Enter the number of plate: ");
						int no = sc.nextInt();
						
						int total = 400*no;
						
						System.out.println("Total bill: "+total);
						break;
					}
					case 3:
					{
						System.out.println("Enter the number of plate: ");
						int no = sc.nextInt();
						
						int total = 300*no;
						
						System.out.println("Total bill: "+total);
						break;
					}
					case 4:
					{
						System.out.println("Enter the number of plate: ");
						int no = sc.nextInt();
						
						int total = 250*no;
						
						System.out.println("Total bill: "+total);
						break;
					}
					case 5:
					{
						System.out.println("Enter the number of plate: ");
						int no = sc.nextInt();
						
						int total = 170*no;
						
						System.out.println("Total bill: "+total);
						break;
					}
					default:
					{
						System.out.println("There are only 5 option Mere Bhai/Behn");
					}
				
				}
			}
			break;
			default:
			{
				System.out.println("There are only 2 option Mere Bhai/Behn");
			}
		}
	}
}
