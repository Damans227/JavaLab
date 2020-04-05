//Java Program to Display Fibonacci Series


import java.util.Scanner;
public class Lab17 {
	public static void main(String[] args) {
	int num,t1=0,t2=1, sum;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the last digit for Fibonacci Series: ");
	
	
	num=sc.nextInt();
	
	for (int i=0;i<num;i++) {
		
		System.out.print(t1 + "+");
			
	sum=t1+t2;
	t1=t2;
	t2=sum;
	
		
	
	}
}
}