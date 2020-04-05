//Java Program to Check Whether a Character is Alphabet or Not

/*In Java, char variable stores the ASCII value of a character 
 * (number between 0 and 127) rather than the character itself.
The ASCII value of lowercase alphabets are from 97 to 122. And,
 the ASCII value of uppercase alphabets are from 65 to 90.*/

import java.util.Scanner;
public class Lab13 {
	public static void main(String[] args) {
		
	char input;
	
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter the Character to be checked: ");
	
	input=sc.next().charAt(0);
	
	int ascii=input;
	
	if((input >= 'a' && input <='z')||(input>= 'A' && input<='Z')) {
		
		System.out.println("YES, " +input+ " is an ALPHABET with ASCII value as " + ascii);
		
		
	} else {
		System.out.println("NO, " +input+ "  is not an ALPHABET with ASCII value as " + ascii);
		
	}

}
	
}
