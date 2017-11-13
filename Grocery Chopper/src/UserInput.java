import static java.lang.System.out;
import java.util.Scanner;

public class UserInput {                        // Constructor 
	
	public String userPrompt() {
		
		Scanner scan = new Scanner(System.in);
		
		// Prompt user to enter an item
		out.print("Enter an item: ");
		String input = scan.next();           //can't make this private (to require accessor methods), suggests final -- research this
		scan.close();		
		return input;
	}
}
