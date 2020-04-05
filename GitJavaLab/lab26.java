//Java Program to Check Armstrong Number

import java.util.Scanner;
public class lab26 {
	


	static int sum=0;

	
	public static void main(String[] args) {
				
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your number to be checked for Armstrong");
		
		int num=sc.nextInt();
		int temp1=num;
		int temp2=num;
		

		int digits=1;
		for(;temp1>=0;digits++) {
			
			temp1/=10;
			if(temp1==0) {
				
				break;
			}
			
		}
				
	for(int i=1;temp2>=0; i++) {
	 
			 int rem= temp2%10;
			 temp2/=10;
			 
			sum+=Math.pow(rem, digits);
			
			if(temp2==0) {
				
				break;
			}
			
		}	
	
		if (num==sum) {
			
			System.out.println("This is an Armstrong number");
		}
		else {System.out.println("This is NOT an Armstrong number");
			
			
		}
		
	
		
	}
	
}
	
	

		

