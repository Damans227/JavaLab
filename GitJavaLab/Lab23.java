//Java Program to Calculate the Power of a Number
import java.util.Scanner;
public class Lab23 {
	
	public static void main(String[] args)
	{
		int e,b;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the base: ");
	b=sc.nextInt();
	
	System.out.println("Enter the exponent: ");
	e=sc.nextInt();
	
	Calculation(e,b);
		
	
	}
	
	public static void Calculation(int exponent, int base) {
		int result=1;
		
	
		for(; exponent!=0;--exponent){
			
			result*=base;
			
		}
		
		System.out.println("Result of your calculation is: " + result);
		
		
	}

}
