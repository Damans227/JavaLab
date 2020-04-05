//Java Program to Generate Multiplication Table
import java.util.Scanner;
public class Lab16 {
	
	public static void main(String[] args) {
		
		int num1;
		
		
		System.out.println("What table would you like to print ? ");
		Scanner sc = new Scanner(System.in);

		num1=sc.nextInt();
 
for(int i=1; i<=10; ++i ) {
	
	
System.out.println(num1 + " x " +i+" = " + (num1*i));

}
	
	}

}
