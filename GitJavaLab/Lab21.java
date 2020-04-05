//Java Program to Count Number of Digits in an Integer

/*On each iteration, the value of num is divided by 10 and count is incremented by 1.

The for loop exits when num != 0 is false, i.e. num = 0.*/
import java.util.Scanner;
public class Lab21 {

	public static void main(String[] args) {
	
		System.out.println("Enter the number for counting the Digits: ");
		Scanner sc=new Scanner(System.in);
	
		int input=sc.nextInt();
		int output=NumberCount(input);
		
		System.out.println("Number of Digits in your number are: "+output);
	}
	
	public static int NumberCount(int num) {
		
		int count=1;
		
		 for(;count>=0; ++count) {
			 
				num/=10;
				
				if (num==0) { 
					
					break;
				} 
			 } return count;
		
	}
}
