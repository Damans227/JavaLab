//Java Program to Find G.C.D Using Recursion

import java.util.Scanner;
public class Lab36 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first number: ");
		int num1=sc.nextInt();
		
		System.out.println("Enter your second number: ");
		int num2=sc.nextInt();
		
		int gcd=GCD(num1,num2);
		
		System.out.println("Your GCD for "+num1+" and "+num2+" is: "+gcd);	
	}
	
	public static int GCD(int n1, int n2) {
		
		if(n2!=0) {
			
			return GCD(n2, n1%n2);
				}
		
		else {
			
			return n1;
		}
		
	}

}
