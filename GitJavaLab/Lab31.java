//Java Program to Display Factors of a Number
import java.util.Scanner;

public class Lab31 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for which you'd like to display factors:");
		
		int a=sc.nextInt();
		Factors(a);		
	}	
	public static void Factors(int num) {
		
		System.out.print("Factors of " + num + " are: ");
		
		for(int i=1;i<=num; i++) {
			
			if(num%i==0) {
				
				System.out.print(i + " ");
				
			}
		}
	}
}
