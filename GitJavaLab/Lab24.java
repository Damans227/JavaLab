
//Java Program to Check Whether a Number is Palindrome or Not
import java.util.Scanner;

public class Lab24 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number to be Checked: ");
		int a=sc.nextInt();
		int b=Reverse(a);
		
		if (b==a) {
			
			System.out.println("It's a plaindrome");
			
		} else {
			
			System.out.println("It's not a plaindrome");
		}
		
		
		}
		
		public static int Reverse(int num) {
			
			int reverse=0;
			int rem;
			
			for (int counter=0;num!=0;counter++)
				
			{
			
			rem=num%10;
			reverse=reverse*10 + rem;
			num/=10;
			
			if(num==0) {
				
				break; 
			}
			}
			
			return reverse;
		}

	}
