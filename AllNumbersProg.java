import java.util.Scanner;

class AllNumbers 
{
	static Scanner sc = new Scanner(System.in);
	
	public static boolean isArmstrong(int num)
	{
		int temp = num ;
		int count = 0;
		int sum = 0;
		
		for (int i = temp ; i>0 ;i/=10 )
		{
			count++;
		}
		for (int i = temp ;i >0  ;i /= 10 )
		{
			int last = i % 10;
			int pow = 1;
			for (int j = 0; j < count ; j++ )
			{
				pow = pow * last ; 
			}
			sum += pow;
			
		}
		return sum==num;
	}
	
	public static void automorphic(int num)
	{
			int count = 0;
			
			for (int temp = num ;temp > 0 ;temp /= 10 )
			{
				count++;
			}
			
			int square = num*num;
			int power = 1;
			
			for (int i = 0; i < count ;i++ )
			{
				power = power * 10;
			}
			
			if (square % power == num)
			{
				System.out.println("It is Automorphic number");
			}
			else
				System.out.println("Not Automorphic number");
			
	}
	
	public static void binToDeci(int num)
	{
		int bin = 0 ;
		int i = 1;
		while (num > 0)
		{
			int rem = num % 10 ;
			bin = rem * i + bin;
			i = i *2;
			num /= 10;
		}
		System.out.println(bin);
	}
	
	public static void isBuzz(int num)
	{
		if(num%10==7||num%7==0)
		{
			System.out.println("it is Buzz number");
		}
		else
		{
			System.out.println("it is not Buzz number");
		}
		
	}
	
	
	public static void coPrime(int n1,int n2)
	{
		int small = n1 < n2 ? n1:n2 ;
		while (true)
		{
			if (n1 % small == 0 && n2 % small == 0)
			{
				break ;
			}
			small--;
		}
		if (small == 1)
		{
			System.out.println("It is Co-Prime");
		}
		else
			System.out.println("NOT Co-Prime");
	}
	
	public static void countDup(int num)
	{
		int count1 = 0 ;
		for (int i = 0;i<=9 ;i++ )
		{
			int count = 0;
			int temp = num ;
			
			while (temp > 0)
			{
				if (i == temp % 10)
				{
					count++;
				}
				temp /= 10;
			}
			
			if (count > 1)
			{
				count1++;
				System.out.println(i+" present in : "+count+" times");
			}
		}
		System.out.println("Count of Duplicates Is : "+count1);
	}
	
	public static int countOfDigit(int num)
	{
		int count = 0;
		while (num != 0)
		{
			count++;
			num /= 10;
		}
		return count;
	}
	
	public static void negative(int num)
	{
		int positive = num ;
		//int positive = (num < 0) ? -num : num;
		if (num < 0)
		{
			positive = num * -1; 
		}
		System.out.println(positive);
		
	}
	
	public static void deciToBin(int num)
	{
		int bin = 0 ;
		int i = 1;
		while (num > 0)
		{
			int rem = num % 2 ;
			bin = rem * i + bin;
			i = i *10;
			num /= 2;
		}
		System.out.println(bin);
	}
	
	public static boolean isDisariumNum(int num)
	{
		int temp = num ;
		int count = 0 ;
		int sum = 0 ;
		
		while (temp != 0)
		{
			count++ ;
			temp /= 10 ;
		}
		temp = num ;
		while (temp != 0)
		{
			int last = temp % 10 ;
			int prod = 1 ;
			for (int i = 1 ; i <= count ; i++)
			{
				prod = prod * last ;
			}
			sum = sum + prod;
			temp /= 10 ;
			count--;
		}
		return sum == num;
	}
	
	public static void isDuck(int num)
	{
		int count=0;
		for (int i=num;i>0 ;i/=10 )
		{
			int last = num % 10 ;
			if (last==0)
			{
				count++;
				break;
			}
			
		}
		if (count>0)
		{
			System.out.println("number is duck Number");
		} 
		else
		{
			System.out.println("number is not duck Number");
		}
	}
	public static void duplicateNum(int num)
	{
		for (int i = 0;i<=9 ;i++ )
		{
			int count = 0;
			int temp = num ;
			
			while (temp > 0)
			{
				if (i == temp % 10)
				{
					count++;
				}
				temp /= 10;
			}
			
			if (count > 1)
			{
				System.out.println(i+" present in : "+count+" times");
			}
		}
	}
	
		public static boolean isEmirpNum(int num)
	{
			int count1 = 0;
			int count2 = 0;
            for (int i = 1; i <= num; i++) 
			{
                if (num % i == 0) 
				{
                    count1++;
                }
            }

            if (count1 == 2) 
			{
                // Reverse the number
                int n = num;
                int rev = 0;
                while (n > 0) 
				{
                    int d = n % 10;
                    rev = rev * 10 + d;
                    n = n / 10;
                }
				

                // Check if reversed number is prime and not equal to original
                if (rev != num) 
				{
                    
                    for (int i = 1; i <= rev; i++) 
					{
                        if (rev % i == 0) 
						{
                            count2++;
                        }
                    }
              }
         }
		 return count2 == 2;
	}
	
	public static void evenOdd()
	{
		System.out.print("Enter your number : ");
		int num = sc.nextInt();
		if (num % 2 == 0)
		{
			System.out.println(num+" : Is even");
		}
		else
			System.out.println(num+" : Is odd");
	}
	
	public static boolean isEvil(int num)
	{
		String bin="";
		while(num>0)
		{
			int last=num%2;
			bin = last+bin;
			num/=2;
		}
		int rev=Integer.parseInt(bin);
		int count =0;
		while(rev>0)
		{
			int last=rev%10;
			if (last==1)
			{
				count++;
			}
			rev/=10;
		}
		return count%2==0;
	}
	
	public static int factor(int num)
	{
		int fact = 1;
		for(int den = 1 ; den <= num/2 ; den++ )
        {
          if(num % den == 0)
          {
            System.out.println(den);
          }
        }
		return fact;
	}
	
	public static void factorOfDigit(int num)
	{
		int temp = num ;
		
		while (num > 0)
		{
			int last = num % 10 ;
			
			for(int den = 1 ; den <= last ; den++ )
			{
			  if(last % den == 0)
			  {
				System.out.println(last+" factor is : "+den);
			  }
			}
			num /= 10;
		}
	}
	
	public static void isFascinating(int num)
	{
		int one=0,two=0,three=0,four=0,five=0,six=0,seven=0,eight=0,nine=0 ;
		
		int count = (int)Math.log10(num)+1;
		//System.out.println("count :"+count);
		
		if (count == 3)
		{
			int merge = 0 ;
			
			for (int i = 1 ;i<=count ;i++ )
			{
				int mul = num * i ;
				merge = merge * 1000 + mul ;
			}
			while (merge > 0)
			{
				switch (merge % 10)
				{
				case 1:
					{
						one++ ; break ;
					}
				case 2:{ two++ ; break ; }
				case 3:
					{
						three++ ;
						break ;
					}
				case 4:
					{
						four++ ;
						break ;
					}
				case 5:
					{
						five++ ;
						break ;
					}
				case 6:
					{
						six++ ;
						break ;
					}
				case 7:
					{
						seven++ ;
						break ;
					}
				case 8:
					{
						eight++ ;
						break ;
					}
				case 9:
					{
						nine++ ;
						break ;
					}
				
				}
				merge /= 10 ;
				
			}
			if (one==1&&two==1&&three==1&&four==1&&five==1&&six==1&&seven==1&&
				eight==1&&nine==1)
			{
				System.out.println("It is a Fascinating number");
			}
			else
				System.out.println("Not Fascinating number");
		}
		else{
			System.out.println("Invalid Number");
		}
	}
	
	public static void factorial(int num)
	{
		int fact = 1 ;
		while(num > 0)
        {
          fact = fact * num;
          num--;
        }
      System.out.println("The factorial of given number : "+fact);
	}
	
	
	public static void firstTowMiss(int num)
	{
		int missingCount = 0;
		for (int i  = 0; i<=9 ;i++ )
		{
			int temp = num ;
			int count = 0;
			//int missingCount = 0;
			while (temp > 0)
			{
				int last = temp % 10 ;
				if (last == i)
				{
					count++;
				}
				temp /= 10;
			}
			if (count == 0)
			{
				System.out.println(i);
				missingCount++;
			}
			if (missingCount == 2)
			{
				break;
			}
			
		}
	}
	
	public static void frequencyOfDigit(int num)
	{
		
		for (int i =0; i<=9 ;i++ )
		{
			int count = 0;
			int temp = num ;
			
			while (temp > 0)
			{
				if (i == temp % 10)
				{
					count++;
				}
				temp /= 10;
			}
			if (count > 0)
			{
				System.out.println(i+" present in : "+count+" times");
			}
		}
	}
	
	public static void isHappyNum(int num)
	{
		int temp = num;
		int sum = 0;
		do
		{
			sum = 0;
			while (temp > 0)
			{
				int last = temp % 10;
				sum += last*last ;
				temp /= 10 ;
			}
			temp = sum ;
		}
		while (sum >= 10);
		
		System.out.println(sum);
		if (sum==1)
		{
			System.out.println("It is a Happy number ");
		}
		else
			System.out.println("Not Happy Number ");
	}
	
	public static int harshadNum(int num)
	{
		int temp = num ;
		int sum = 0 ;
		while (temp > 0)
		{
			int last = temp % 10 ;
			sum += last ;
			temp /= 10 ;
		}
		return sum;
		
	}
	
	public static void HCF(int n1 , int n2 )
	{
		int small = n1 < n2 ? n1:n2;
		
		while (true)
		{
			if (n1 % small == 0 && n2 % small == 0)
			{
				System.out.println(small);
				break ;
				
			}
			small--;
		}
	}
	
	public static void LCM(int n1 , int n2 )
	{
		int large = n1 > n2 ? n1:n2;
		int i = 1;
		while (true)
		{
			if ((large * i) % n1 == 0 && (large * i) % n2  == 0)
			{
				System.out.println(large * i);
				break ;
				
			}
			i++;
		}
	}
	
	public static int maxDigit(int num)
	{
		int max = -1 ;
		while (num != 0)
		{
			int last = num % 10;
			if (last > max)
			{
				max = last;
			}
			num /= 10;
		}
		return max;
	}
	
	public static int minDigit(int num)
	{
		int min = 10 ;
		while (num != 0)
		{
			int last = num % 10;
			if (last < min)
			{
				min = last;
			}
			num /= 10;
		}
		return min;
	}
	
	public static void missingDigit(int num)
	{
		int temp = num;
		int min = 10 ;
		int max = -1 ;
		
		while (num > 0)
		{
			int last = num % 10 ;
			
			if (last > max)
			{
				max = last ;
			}
			else if (last < min)
			{
				min = last ;
			}
			num /= 10 ;
		}
		num = temp ;
		
		for (int i = min ; i <= max ; i++ )
		{
			int rev = num ;
			boolean flag = false ;
			
			while (rev > 0)
			{
				int last = rev % 10 ;
				
				if (last == i)
				{
					flag = true ;
					break ;
				}
				rev /= 10 ;
			}
			if (!flag)
			{
				System.out.println(i);
			}
		}
	}
	
	public static boolean isNeon(int num)
	{
		int sqr = num*num;
		int sum = 0;
		while (sqr > 0)
		{
			sum += sqr % 10;
			sqr /= 10 ;
		}
		return sum==num;
	}
	
	public static boolean isPalindrome(int num)
	{
		int rev = 0;
		int temp = num ;
		while (temp > 0)
		{
			rev = rev * 10 + (temp % 10);
			temp /= 10;
		}
		return rev == num;
	}
	
	public static boolean isPerfect(int num)
	{
		int sum = 0;
		
		for (int i = 1 ; i <= num/2 ;i++ )
		{
			if (num % i == 0)
			{
				sum += i;
			}
		}
		return sum==num ;
	}
	
	public static int power(int base, int raise)
	{
		int pow = 1;
		while (raise > 0)
		{
			pow = pow * base;
			raise--;
		}
		return pow ;
	}
	
	public static int reverseNum(int num)
	{
		int rev = 0 ;
		
		while (num > 0)
		{
			int last = num % 10;
			rev = rev * 10 + last ;
			num /= 10;
		}
		return rev;
	}
	
	public static int strong(int num)
	{
		int sum = 0 ;
		
		while (num > 0)
		{
			int fact = 1;
			
			int last = num % 10 ;
			while (last > 0)
			{
				fact = fact * last;
				last--;
			}
			sum += fact ;
			num /= 10 ;
		}
		return sum;
	}
	
	public static int sumOfDigit(int num)
	{
		int sum = 0;
		while (num != 0)
		{
			sum = sum + num % 10 ;
			num /= 10 ;
		}
		return sum;
	}
	
	public static void sumOfEven(int num)
	{
		int sum = 0;
		while (num != 0)
		{
			int last = num % 10 ;
			if (last % 2 == 0)
			{
				sum += last;
			}
			num /= 10;
		}
		System.out.println(sum);
	}
	
	public static void sumOfOdd(int num)
	{
		int sum = 0;
		while (num != 0)
		{
			int last = num % 10 ;
			if (last % 2 == 1)
			{
				sum += last;
			}
			num /= 10;
		}
		System.out.println(sum);
	}
	
	public static void swap(int n1 , int n2)
	{
		int temp = n1 ;
		n1 = n2;
		n2 = temp;
		
		System.out.println("first : "+n1);
		System.out.println("second : "+temp);

	}
	
	public static void checkTechNum(int num)
	{
		int temp = num ;
		int sum = 0 ;
		int count = 0 ;
		while(temp>0)
		{
			count++;
			temp=temp/=10;
		}
		if(count%2==0)
		{
			int divisior=1;
			for(int i =0;i<count/2;i++)
			{
				divisior*=10;
			}
			int firstHalf=num/divisior;
			int secondHalf=num % divisior;
			sum=firstHalf+secondHalf;
			int square=sum*sum;
			if (square == num)
			{
				System.out.println("it is a tech number");
			}
			else{
				System.out.println("it is not a tech number");
			}
		}
		
	}
	
	public static int reverse(int num)
	{
		int rev = 0;
		while (num != 0)
		{
			rev = rev * 10 + (num % 10);
			num /= 10;
		}
		return rev;
	}
	public static boolean prime(int num)
	{
		int den = 2;
		while (den < num)
		{
			if (num % den == 0)
			{
				break ;
			}
			den++;
		}
		return num == den ;
	}
	
	public static void isUglyNum(int num)
	{
		while (num > 1)
		{
			if (num % 2 == 0)
			{
				num /= 2;
			}
			else if (num % 3 == 0)
			{
				num /= 3;
			}
			else if (num % 5 == 0)
			{
				num /= 5 ;
			}
			else
				break ;
		}
		if (num == 1)
		{
			System.out.println("It is a Ugly number");
		}
		else
			System.out.println("Not ugly number");
	}
	
	public static void uniqueNum(int num)
	{
		boolean flag=true;
		while(num>0)
		{
			int count=0;
			int temp=num;
			while(temp>0)
			{
				if (num%10==temp%10)
				{
					count++;
				}
				temp/=10;
			}
			if(count>1)
			{
				flag=false;
				break;
			}
			num/=10;
		}
		if (flag)
		{
			System.out.println("it is an unique number");
		}
	    else
		{
			System.out.println("not an unique number");
		}
			
	}
	
	public static void xylem(int num)
	{
		int sumOut=0,sumIn=0,temp=num;

		if(num<100)
		{
			System.out.println("Entered number should have at least 3 digits");
			return;
		}
		while(temp != 0)
		{
			int last = temp % 10 ;
			
			if(temp==num || temp<10)
				sumOut += last ;
			else
				sumIn += last ;

			temp/=10;
		}
		if(sumOut == sumIn)
			System.out.println(num+" is an Xylem number");
		else
			System.out.println(num+" is not an Xylem number");

	}
	
	
	public static void main(String[] args) 
	{
		System.out.println();
		System.out.println("1 : Armstrong Number") ;
		System.out.println("2 : Automorphic Number") ;
		System.out.println("3 : Binary To Decimal") ;
		System.out.println("4 : Buzz Number") ;
		System.out.println("5 : Co-Prime") ;
		System.out.println("6 : Count of Duplicate") ;
		System.out.println("7 : Count Of Digit") ;
		System.out.println("8 : Covert Negative To Positive") ;
		System.out.println("9 : Decimal TO Binary") ;
		System.out.println("10 : Disarium Number") ;
		System.out.println("11 : Duck Number") ;
		System.out.println("12 : Duplicate Number") ;
		System.out.println("13 : Emirp Number") ;
		System.out.println("14 : Even Odd Number ") ;
		System.out.println("15 : Evin Number Number ") ;
		System.out.println("16 : Factor Number ") ;
		System.out.println("17 : Factor Of Each Digit Number ") ;
		System.out.println("18 : Fascinating Number ") ;
		System.out.println("19 : Factorial Number ") ;
		System.out.println("20 : First Missing Digit Number ") ;
		System.out.println("21 : First Two Missing Digit Number ") ;
		System.out.println("22 : Frequency Of Digit Number ") ;
		System.out.println("23 : Happy Number ") ;
		System.out.println("24 : Harshad Number ") ;
		System.out.println("25 : HCF ") ;
		System.out.println("26 : LCM ") ;
		System.out.println("27 : Max Digit ") ;
		System.out.println("28 : Min Digit ") ;
		System.out.println("29 : Missing Digit ") ;
		System.out.println("30 : Neon Number ") ;
		System.out.println("31 : Palindrome Number ") ;
		System.out.println("32 : Perfect Number ") ;
		System.out.println("33 : Power ") ;
		System.out.println("34 : Reverse Number ") ;
		System.out.println("35 : Strong Number ") ;
		System.out.println("36 : Sum Of Digit ") ;
		System.out.println("37 : Sum of Even ") ;
		System.out.println("38 : Sum of Odd ") ;
		System.out.println("39 : Swap Number ") ;
		System.out.println("40 : Tech Number ") ;
		System.out.println("41 : Twisted Prime ") ;
		System.out.println("42 : Ugly Number ") ;
		System.out.println("43 : Unique Number ") ;
		System.out.println("44 : Xylem Number ") ;
		System.out.println("45 : Prime Number ") ;
		
		
		System.out.println();
		System.out.println("Enter your Option Number :");
		int ip = sc.nextInt() ;
		
		switch (ip)
		{
			case 1:
			{
				System.out.println("------------Armstrong Number-------------") ;
				System.out.println("Enter your Option Number :");
				int num = sc.nextInt();
				
				if (isArmstrong(num))
				{
					System.out.println("It is Armstrong");
				}
				else
					System.out.println("Not Armstrong");
				
				break ;
			}
			
			case 2 :
			{
				System.out.println("-----------Automorphic Number-----------");
				System.out.println("Enter your Option Number :");
				
				int num = sc.nextInt();
	
				automorphic(num);
				
				break ;
			}
			
			case 3 :
			{
				System.out.println("----------Binary To Decimal-----------");
				System.out.println("Enter your Binary Number :");
				
				int num = sc.nextInt();
				binToDeci(num);
				
				break ;
			}
			
			case 4 :
			{
				System.out.println("----------Buzz Number-------------");
				System.out.println("Enter your Number :");
				
				int num=sc.nextInt();
				isBuzz(num);
				
				break ;
			}
			
			case 5 :
			{
				System.out.println("-----------Co-Prime-----------");
				System.out.println("Enter first number : ");
				int n1 = sc.nextInt();
				System.out.println("Enter second number : ");
				int n2 = sc.nextInt();
				coPrime(n1,n2);
				
				break ;
			
			}
			
			case 6 :
			{
				System.out.println("-----------Count Of Duplicates-----------") ;
				System.out.println("Enter Your Number : ") ;
				
				int num = sc.nextInt();
				countDup(num);
				
				break ;
			}
			
			case 7 :
			{
				System.out.println("----------------Count Of Digit-----------------") ;
				System.out.println("Enter Your Number : ") ;
				System.out.println("Count of digit is : "+countOfDigit(sc.nextInt()));
				
				break ;
			}
			
			case 8 :
			{
				System.out.println("---------Covert Negative To Positive-------") ;
				System.out.println("Enter Negativ Number : ") ;
				
				int num = sc.nextInt();
				negative(num);
				
				break ;
			}
			
			case 9 :
			{
				System.out.println("---------------Decimal TO Binary--------------") ;
				System.out.println("Enter Decimal Number : ") ;
				
				int num = sc.nextInt();
				deciToBin(num);
				
				break ;
			}
			
			case 10 :
			{
				System.out.println("--------------Disarium Number-------------") ;
				System.out.println("Enter Your Number : ") ;
					
				if (isDisariumNum(sc.nextInt()))
				{
					System.out.println("It is a Disarium number ");
				}
				else
					System.out.println("Not diasarium number");
				
				break ;
			}
			
			case 11 :
			{
				System.out.println("--------------Duck Number-------------") ;
				System.out.println("Enter your number : ") ;
				
				int num=sc.nextInt();
				isDuck(num);
				
				break ;
			}
			
			case 12 :
			{
				System.out.println("----------------Duplicate Number--------------") ;
				System.out.println("Enter your number : ") ;
				
				int num = sc.nextInt();
				duplicateNum(num);
				
				break ;
			}
			
			case 13 :
			{
				System.out.println("-------------Emirp Number-------------") ;
				System.out.println("Enter your number : ") ;
				
				int num = sc.nextInt();
				if (isEmirpNum(num))
			{
				System.out.println("It ia a Emirp Number");
			}
			else
				System.out.println("NOT Emirp Number");
			
			break ;
			}
			
			case 14 :
			{
				System.out.println("----------Even Odd Number-------------") ;
				evenOdd();
				
				break ;
			}
			
			case 15 :
			{
				System.out.println("---------------Evin Number Number-------------") ;
				System.out.println("Enter the number");
				int num=sc.nextInt();
		
				if (isEvil(num))
				{
					System.out.println("Number is Evil ");
				}
				else
				{
					System.out.println("Number is  not Evil ");
				}
				
				break ;
			}
			
			case 16 :
			{
				System.out.println("--------------Factor Number-----------") ;
				System.out.println("Enter your number : ");
				int fact = factor(sc.nextInt());
				
				break ;
			}
			
			case 17 :
			{
				System.out.println("-----------Factor Of Each Digit---------") ;
				System.out.println("Enter your number : ");
				int num = sc.nextInt();
				factorOfDigit(num);
				
				break ;
			}
			
			case 18 :
			{
				System.out.println("------------Fascinating Number---------") ;
				System.out.println("Enter your number : ");
				int num = sc.nextInt();
				isFascinating(num);
				
				break ;
			}
			
			case 19 :
			{
				System.out.println("-----------Factorial Number-------------") ;
				System.out.println("Enter your number : ") ;
				int num = sc.nextInt() ;
				factorial(num) ;
				
				break ;
			}
			
			case 20 :
			{
				System.out.println("-------------First Missing Digit Number---------") ;
				System.out.println("Enter your number : ");
				int num = sc.nextInt();
				missingDigit(num);
				
				break ;
			}
			
			case 21 :
			{
				System.out.println("--------First Two Missing Digit Number-----------") ;
				System.out.println("Enter your number : ");
				int num = sc.nextInt();
				firstTowMiss(num);
				
				break ;
			}
			
			case 22 :
			{
				System.out.println("-------Frequency Of Digit Number------") ;
				System.out.println("Enter your number :");
				int num = sc.nextInt();
				frequencyOfDigit(num);
				
				break ;
			}
			
			case 23 :
			{
				System.out.println("-----------Happy Number----------") ;
				System.out.println("Enter the number : ");
				int	num = sc.nextInt();
		
				isHappyNum(num);
				
				break ;
			}
			
			case 24 :
			{
				System.out.println("-----------Harshad Number---------") ; 
				System.out.println("Enter your number : ");
			int num = sc.nextInt();
			int sum = harshadNum(num);
			if (num % sum == 0)
			{
				System.out.println("it is harshad number");
			}
			else
				System.out.println("NOT harshad Number");
			break ;
			}
			
			case 25 :
			{
				System.out.println("-------------HCF----------") ;
				System.out.println("Enter first number : ");
				int first = sc.nextInt();
		
				System.out.println("Enter second number : ");
				int second = sc.nextInt();
		
				HCF(first,second);
				
				break ;
			}
			
			case 26 :
			{
				System.out.println("-----------LCM--------------") ;
				System.out.println("Enter first number : ");
				int first = sc.nextInt();
		
				System.out.println("Enter second number : ");
				int second = sc.nextInt();
		
				LCM(first,second);
				
				break ;
			}
			
			case 27 :
			{
				System.out.println("-----------------Max Digit------------") ;
				System.out.println("Enter your Number : ");
				int num = sc.nextInt();
				System.out.println(maxDigit(num));
				
				break ;
			}
			
			case 28 :
			{
				System.out.println("------------Min Digit-----------") ;
				System.out.println("Enter your number : ");
				System.out.println(minDigit(sc.nextInt()));
				
				break ;
			}
			
			case 29 :
			{
				System.out.println("---------------Missing Digit------------") ;
				
				System.out.println("Enter your number : ");
				int num = sc.nextInt();
				missingDigit(num);
				
				break ;
			}
			
			case 30 :
			{
				System.out.println("-------------Neon Number-----------") ;
				System.out.println("Enter your number : ");
				if (isNeon(sc.nextInt()))
				{
					System.out.println("It is a neon number ");
				}
				else
					System.out.println("Not neon Number");
				
				break ;
			}
			
			case 31 :
			{
				System.out.println("----------Palindrome Number-----------") ;
				System.out.println("Enter the number : ");
				int num = sc.nextInt();
		
				if (isPalindrome(num))
				{
					System.out.println("It is a Palindrome");
				}
				else
					System.out.println("It is Not Palindrome");
				break ;
			}
			
			case 32 :
			{
				System.out.println("-----------Perfect Number---------") ;
				System.out.println("Enter your number ");
				int num = sc.nextInt();
				if (isPerfect(num))
				{
					System.out.println("It is a Perfect number ");
				}
				else
					System.out.println("Not Perfect number ");
				break ;
		
			}
			
			case 33 :
			{
				System.out.println("----------Power----------") ;
				System.out.println("Enter base number : ") ;
				int base = sc.nextInt() ;
		
				System.out.println("Enter raise number : ") ;
				int raise = sc.nextInt() ;
		
				System.out.println(power(base,raise));
				break ;
			}
			
			case 34 :
			{
				System.out.println("----------Reverse Number----------") ;
				System.out.println("Enter your number : ");
				int num = sc.nextInt();
		
				System.out.println(reverseNum(num));
				break ;
			}
			
			case 35 :
			{
				System.out.println("-----------Strong Number-----------") ;
				System.out.println("Enter your number ");
				int num = sc.nextInt();
	
				if (num == strong(num))
				{
					System.out.println("It is a Strong Number");
				}
				else
					System.out.println("Not Strong Number");
				break ;
			}
			
			case 36 :
			{
				System.out.println("---------------Sum Of Digit-----------") ;
				System.out.println("Enter your number : ");
				int num = sc.nextInt();
		
				int sum = sumOfDigit(num);
				System.out.println("Sum of Digit is : "+sum);
				break ;
			}
			
			case 37 :
			{
				System.out.println("-------------Sum of Even----------") ;
				System.out.println("Enter your number : ");
				int num = sc.nextInt();
				sumOfEven(num);
				break ;
			}
			
			case 38 :
			{
				System.out.println("------------Sum of Odd----------") ;
				System.out.println("Enter your number : ");
				int num = sc.nextInt();
				sumOfOdd(num);
				break ;
			}
			
			case 39 :
			{
				System.out.println("----------Swap Number----------") ;
				System.out.println("Enter first value");
				int first = sc.nextInt();
				System.out.println("Enter second value");
				int second = sc.nextInt();
				swap(first,second);
				break ;
			}
			
			case 40 :
			{
				System.out.println("------------Tech Number---------- ") ;
				System.out.println("Enter your number : ");
				int num = sc.nextInt();
				checkTechNum( num);
				break ;
			}
			
			case 41 :
			{
				System.out.println("-------------Twisted Prime---------") ;
				System.out.println("Enter your number : ");
				int num = sc.nextInt();
				boolean checkPrime = prime(num);
		
				if (checkPrime)
				{
					int rev = reverse(num);
					if (prime(rev))
					{
						System.out.println("It is Twisted prime");
					} 
					else
						System.out.println("Not twisted prime ");
				}
			else
				System.out.println("NOT twisted prime");
			break ;
			}
			
			case 42 :
			{
				System.out.println("----------Ugly Number--------") ;
				System.out.println("Enter the number : ");
				int num = sc.nextInt();
				isUglyNum(num);
				break ;
			}
			
			case 43 :
			{
				System.out.println("----------Unique Number---------") ;
				System.out.println("Enter the Number");
				int num=sc.nextInt();
				uniqueNum(num);
				break ;
			}
			
			case 44 :
			{
				System.out.println("-----------Xylem Number-------- ") ;
				int num=new Scanner(System.in).nextInt();
				xylem(num);
				break ;
			}
			
			case 45 :
			{
				System.out.println("-----------Prime Number-------") ;
				System.out.println("Enter the number : ") ;
				int num = sc.nextInt() ;
		
				if (prime(num))
				{
					System.out.println("It is a Prime");
				}
				else
					System.out.println("It is not Prime");
				break ;
				
			}
		}
	}
}
