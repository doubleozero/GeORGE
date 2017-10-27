import static java.lang.System.out;
import java.util.Scanner;

public class UserInput {
	
	public String userPrompt() {
		
		Scanner scan = new Scanner(System.in);
		
		// Prompt user to enter an item
		out.print("Enter an item: ");
		String input = scan.next();
		scan.close();
		
		// Test - remove later
		out.println("Ah, you want a " + input + ". How quaint.");
		return input;
	}
}
