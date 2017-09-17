package suresh;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		  String s ;
	        Scanner sc  = new Scanner(System.in);
	        System.out.println("Enter a String to check whether ist ispalindrome or not\n");
	        s = sc.nextLine();
	        String reverse = "";
	        int len = s.length();

	        for (int i = len - 1; i > -1; i--) {
	            reverse = reverse + s.charAt(i);
	        }
	        System.out.println("Reversed String is: " + reverse);

	        if (s.equals(reverse)) {
	            System.out.println("The Given String is Palindrome");
	        } else {
	            System.out.println("The Given String is not a Palindrome");
	        }
	sc.close();

	}

}
