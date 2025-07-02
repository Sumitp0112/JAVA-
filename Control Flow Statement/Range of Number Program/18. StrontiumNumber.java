import java.util.Scanner;
class StrontiumNumber
{
 public static void main(String[] args)
 {
	System.out.print("Enter a number: ");
	int num=new Scanner(System.in).nextInt();
	int temp=num,count=0;

	while(temp>0)
	{ temp/=10;
 	 count++;
	}
	
	if(count!=4)
	{ System.out.println("Please enter a 4 digit number");
	return;
	}

	if(num*2/10%10==num*2/100%10)
	System.out.println(num+" is a Strontium number");
	else
	System.out.println(num+" is not a Strontium number");
 }
}
