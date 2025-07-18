import java.util.Scanner;

class ArmstrongNumRec1 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();          
        int digits = count(num, 0);    

        if (isArmstrong(num, num, 0, digits)) 
		{
            System.out.println("It is an Armstrong number");
        } 
		else
		{
            System.out.println("NOT Armstrong number");
        }
    }
    public static int power(int base, int raise) 
	{
        return raise == 0 ? 1 : base * power(base, raise - 1);
    }
    public static int count(int num, int ct) 
	{
        if (num == 0) 
		{
            return ct == 0 ? 1 : ct;
        }
        return count(num / 10, ct + 1);
    }
    public static boolean isArmstrong(int num, int temp, int sum, int ct) 
	{
        if (num == 0) 
		{
            return sum == temp;               
        }
        int digit = num % 10;                  
        return isArmstrong(num / 10,temp,sum + power(digit, ct),ct);
    }
}
