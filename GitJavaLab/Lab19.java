
//Java Program to Find LCM of two Numbers

/*The LCM of two integers is the smallest
positive integer that is perfectly divisible by 
both the numbers (without a remainder).*/


import java.util.Scanner;
public class Lab19 {
	public static void main(String[] args) {
	int a, b,ans;
	Scanner sc=new Scanner(System.in);
	Lab19 obj=new Lab19();
	
	System.out.println("Enter first number: ");
	a=sc.nextInt();
	System.out.println("Enter second number: ");
	b=sc.nextInt();
	ans=obj.LCM(a, b);
	System.out.println("LCM of "+ a +" and "+ b +" is "+ans );
	
	}
	
	
	public int LCM(int n1, int n2) {
		
		int lcm;
		lcm=(n1>n2)?n1:n2;
		
	for(int i=lcm;(n1<=lcm)&&(n2<=lcm); ++i) {
		
		if((i%n1==0)&&(i%n2==0)) {
		lcm=i;
		break;
		
		}

	} return lcm;
		
	}

}




