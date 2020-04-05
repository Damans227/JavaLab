//Java Program to Make a Simple Calculator Using switch...case
import java.util.Scanner;
public class Lab32 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		double num1=sc.nextDouble();
		System.out.println("Enter second number: ");
		double num2=sc.nextDouble();
		System.out.println("Enter an Operator (+,-,/,*): ");
		char c=sc.next().charAt(0);
		calculator(num1,num2,c);
		
	}
	
	
	public static void calculator(double a, double b, char opr ) {
		 
		double result=0;
		
		switch(opr) {
		
		
		case '+':
			result= a+b;
			break;
			
		case '-':
			result=a-b;
		break;
		
		case '*':
			result=a*b;
		break;
		
		case '/':
			result=a/b;
		break;
		
		default: 
			System.out.println("Error! Operator is incorrect");
		}
		
		System.out.println("Result of your calculation: " + result);
		
		
		
		
		
		
	}

}
