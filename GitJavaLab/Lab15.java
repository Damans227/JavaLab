
//Java Program to Calculate the Factorial of a given number 

/*The factorial of a positive number n is given by:

factorial of n (n!) = 1 * 2 * 3 * 4 * ... * n*/



import java.util.Scanner;
public class Lab15 {

	public static void main(String[] args) {
		
		int counter, fact=1;
		
		System.out.println("Enter the counter value: ");
		
		Scanner sc=new Scanner(System.in);
		
		counter=sc.nextInt();
		
		if (counter>0) {
			
			for(int i=1; i<=counter ;i++) {
				
				
				fact= fact*i; 
				
			}
			System.out.println("Factorial =  " + fact); 		
		}else {
			
			
			System.out.println("Enter counter greater than 0: ");
			
		}	
		
	}
}
