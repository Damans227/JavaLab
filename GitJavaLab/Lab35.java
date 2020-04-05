import java.util.Scanner;
public class Lab35 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the number you want to calculate the factorial for: ");
	
int num=sc.nextInt();

int result= Factorial(num);

System.out.println("Factorial of your number: "+ result);
	
}

public static int Factorial(int n) {
	
	if (n>=1) {
		
		return n * Factorial(n-1);
		
	} else {return 1;
	
	}
	
}
}