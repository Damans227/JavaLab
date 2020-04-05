//Java Program to Display Characters from A to Z using loop
import java.util.Scanner;
public class Lab20 {
	
	public static void main(String[] args) {
		boolean ans;
		
		Lab20 obj=new Lab20();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Would you like to print A to Z  characters, enter true or false ?");
		ans=sc.nextBoolean();
		if(ans) {
			
			obj.alphabets();
		}
		else{
			System.out.println("It's Fine");
			
		}
	}
	
	
	public void alphabets() {
		
		for(char i='A';i<='Z';++i) {
			
			System.out.print(i + " ");;
			
		}
	}

}
