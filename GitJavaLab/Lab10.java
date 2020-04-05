//Java Program to Find all Roots of a Quadratic Equation

import java.util.Scanner;
public class Lab10{
	public static void main(String[] args) {
		
		double r1,r2;
		double a,b,c,d;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value for a: ");
		a=sc.nextDouble();
		
		System.out.println("Enter value for b: ");
		b=sc.nextDouble();
		
		System.out.println("Enter value for c: ");
		c=sc.nextDouble();
		

		d= (b*b)-(4*a*c);
		
		r1= (-b + Math.sqrt(d))/(2*a);
		r2= (-b - Math.sqrt(d))/(2*a);
		
		
		if (d==0) {
			
			System.out.println("Equation has a single root which is: "+ r1);
		}
		else if(d>=0) {
			System.out.println("Root1: "+ r1);
			System.out.println("Root2: "+ r2);
			
		} 
		else {	System.out.println("No root available");
		}
		
		
		
	}
	
	
}