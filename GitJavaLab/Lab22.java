//Java Program to Reverse a Number

import java.util.Scanner; 
public class Lab22 {
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the number to be reversed: ");
	int a=sc.nextInt();
	Reverse(a);
	
	
	}
	
	public static void Reverse(int num) {
		
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
		
		System.out.println("Reverse: "+reverse);
	}

}
