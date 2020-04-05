//Find GCD of two numbers using for loop and if statement
/*The HCF or GCD of two integers is the largest integer that 
 * can exactly divide both numbers (without a remainder)
 */

import java.util.Scanner;
public class Lab18 {
	
	public static void main(String[] args) {
		int a,b,answer;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1: ");
		a=sc.nextInt();
		System.out.println("Enter number 2: ");
		b=sc.nextInt();
		
		Lab18 obj=new Lab18();
		answer=obj.HCF(a, b);
		
		System.out.println("The HCF of " + a + " and "+ b +" is "+ answer);
		
		
	}

	 public int HCF(int n1, int n2) {
		 int gcd=1;
		 
		 for(int i=1; (i<=n1)&&(i<=n2); ++i) {
			 
			 if((n1%i==0)&&(n2%i==0)) {
				 
				 gcd=i;
				 
			 }
			 
		 } return gcd;
		 
	 }
	
}
