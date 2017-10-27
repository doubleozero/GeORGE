
public class Sort {

	public void sortItem() {
		
		String user_item;
		UserInput item = new UserInput();
		user_item = item.userPrompt();
		
		System.out.println("COM-PUT-ING...");
		
		switch(user_item) {
		case "banana":
			System.out.println("A banana is a fruit.");
			break;
		case "lettuce":
			System.out.println("Lettuce is a vegetable.");
			break;
		default:
			System.out.println("You didn't enter anything!");
		}

	}

}
