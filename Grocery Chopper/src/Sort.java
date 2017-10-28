import static java.lang.System.out;

public class Sort {

	public void sortItem() {
		// This function takes the user's input from UserInput, then sorts it accordingly 
		String user_item;
		UserInput item = new UserInput();
		user_item = item.userPrompt();
		
		out.println("COM-PUT-ING...");
		
		// This is going to be a looooong switch if I stick with this approach...
		switch(user_item) {
		case "banana":
			out.println("A banana is a fruit.");
			break;
		case "lettuce":
			out.println("Lettuce is a vegetable.");
			break;
		default:
			out.println("You didn't enter anything!");
		}

	}

}
