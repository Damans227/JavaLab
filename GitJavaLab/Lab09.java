//Find Largest Among three numbers using if..else statement

import java.util.Scanner;
public class Lab09 {

	public static void main(String[]args) {
		
	double n1,n2,n3;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the first number");
	n1=in.nextDouble();
	System.out.println("Enter the second number");
	n2=in.nextDouble();
	System.out.println("Enter the third number");
	n3=in.nextDouble();
	
	if (n1>n2 && n1>n3) {	
		
		System.out.println("FIRST number is BIGGER");}
	else if((n2>n1 && n2>n3)) {
		
		System.out.println("SECOND number is BIGGER");
	}
	
	else {
		
		System.out.println("THIRD number is BIGGER");
	}
	

	}
}
