
//Java Program to Multiply two Floating Point Numbers
import java.util.Scanner;

public class Lab03 {
	
	public static void main(String[] args) {
		
		float num1,num2, product;
		
		Scanner inputObj=new Scanner(System.in);
		
		System.out.println("Enter number 1: ");
		
		num1=inputObj.nextFloat();
		
		System.out.println("Enter number 2: ");
		
		num2=inputObj.nextFloat();
		
		product=num1*num2;
		
		System.out.println("Product is: " + product);
		
	}

}
