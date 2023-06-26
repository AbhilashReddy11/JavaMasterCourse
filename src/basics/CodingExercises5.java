package basics;

public class CodingExercises5 {

	public static void main(String[] args) {
	System.out.println(isPalindrome2(125));	
	
	System.out.println(firstAnsLastDigitsSum(-5));	
	System.out.println(getEvenDigitSum(20000));	
	System.out.println( hasSharedDigit(9,25));	
	System.out.println( hasSameLastDigit(2,252,125));	
	System.out.println( GreatestCommonDivisor(12,30));

	System.out.println(isPerfectNumber(8));
	System.out.println(getDigitCount(999));
	System.out.println(reverse(100000));
	digitsToWords(200);
	
//	printFactors(6);
	}
	public static boolean isPalindrome(int number) {
		int dup=number;
		int sum=0;
		while(dup>0) {
		int rem=dup%10;
		sum=(sum*10)+rem;  
		dup=dup/10;
		}
		if(number==sum) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean isPalindrome2(int number) {
		String strnum=String.valueOf(number);
	
		String reversedString = new StringBuilder(strnum).reverse().toString();
	
		if(strnum.equals(reversedString)==true) {
			return true;
		}else {
			return false;
		}
		}
	public static int firstAnsLastDigitsSum(int num) {
		int tempnum=num;
		if (tempnum<0) {
			return -1;
		}
		
		int lastDigit = tempnum % 10; 

	    while (tempnum >= 10) {
	    	tempnum /= 10; 
	    }
	    int firstDigit=tempnum;
	    return lastDigit+firstDigit;
	}
	
	public static int getEvenDigitSum(int num) {
		int tempnum=num;
		int sum=0;
		if(tempnum<0) {
			return -1;
		}
		while(tempnum>0) {
			int rem=tempnum%10;
			if(rem%2==0 && rem!=0) {
				sum=sum+rem;
				
			}
			tempnum=tempnum/10;
			
		}
		return sum;
			
		
	}
	public static boolean hasSharedDigit(int num1,int num2) {
		if (num1<=9 || num1>=99 ||num2<=9 || num2>=99 ) {
			return false;
		}
		int digit1Ofnum1=num1%10;
		int digit2Ofnum1=num1/10;
		int digit1Ofnum2=num2%10;
		int digit2Ofnum2=num2/10;
		if(digit1Ofnum1==digit1Ofnum2||digit1Ofnum1==digit2Ofnum2||digit2Ofnum1==digit1Ofnum2||digit2Ofnum1==digit2Ofnum2) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static boolean hasSameLastDigit(int num1,int num2,int num3) {
			if(num1<10||num1>=999||num2<10||num2>=999||num3<10||num3>=999) {
			return false;
		}
		int lastdigit1=num1%10;
		int lastdigit2=num2%10;
		int lastdigit3=num3%10;
		if(lastdigit1==lastdigit2||lastdigit1==lastdigit3||lastdigit2==lastdigit3) {
			return true;
			
		}else {
			return false;
		}
		
	}
	
	public static void printFactors(int num) {
		int fac=1;
		if(num<0) {
			System.out.println("Invalid");
		}else {
			System.out.print("factors of "+num +" are: ");
			
			while(fac<=num) {
				if(num%fac==0) {
					System.out.print(fac+" ");
					}
					fac++;
				}
			}
		}

	public static int 	GreatestCommonDivisor(int num1,int num2) {
		if (num1<0||num2<0) {
			return -1;
		}
		while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
		return num1;
	}
	public static boolean isPerfectNumber(int num) {
		int sum=0;
		int fac=1;
		if (num<0) {
			return false;
		}
		while(fac<num) {
			if(num%fac==0) {
				sum+=fac;
				}
				fac++;
			}
		if (sum==num) {
			return true;
			
		}else {
			return false;
		}
	}
	public static int 	getDigitCount(int num) {
		if(num<0) {
			return -1;
		}
		if (num==0) {
			return 1;
		}
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
			
		}
		return count;
	}
	public static int 	reverse(int num) {
		if(num<0) {
			return -1;
		}
		if(num==0) {
			return 0;
		}
		int dup=num;
		int sum=0;
		while(dup>0) {
		int rem=dup%10;
		sum=(sum*10)+rem;  
		dup=dup/10;
		}
		return sum;
	}
	public static void 	digitsToWords(int num) {
		if(num<0) {
			 System.out.println("invalid");
		}
	
	 String[] digitWords = {
		        "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
		    };
	int rev=reverse(num);
	int numOfDigits=	getDigitCount(num);
	int count=0;
		while(rev>0) {
			int rem=rev%10;
			System.out.print(digitWords[rem]);
			count++;
			rev=rev/10;
		}
		while(count!=numOfDigits) {
			System.out.print(" ");
			System.out.print(digitWords[0]);	
			count++;
		}
	}
	 
	}

