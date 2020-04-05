//Java Program to Find the Sum of Natural Numbers using Recursion

import java.util.Scanner;
public class Lab34 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the number you want to calculate Natural Sum For: ");
	
int num=sc.nextInt();

int result= NaturalSum(num);

System.out.println("Sum of natural numbers: "+ result);
	
}

public static int NaturalSum(int n) {
	
	if (n!=0) {
		
		return n + NaturalSum(n-1);
		
	} else {return n;
	
	}
	
}
}
