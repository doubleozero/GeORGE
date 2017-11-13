import static java.lang.System.out;

public class TestCase {

	public void runTest() {
		out.println("COMMENCE TEST");
		out.println("=============");
		
		/* Static values test, remove later
		 * Note the likes of assignName(), assignCat(), etc. are accessor methods
		Item banana = new Item();
		banana.setName("banana");
		banana.setCat("fruit");
		banana.setEdible(true);
		banana.setFrozen(false);
		banana.setParish(true);		
		banana.showItem();
		
		Item deoderant = new Item();
		deoderant.setName("deoderant");
		deoderant.setCat("hygene product");
		deoderant.setEdible(false);
		deoderant.setFrozen(false);
		deoderant.setParish(false);		
		deoderant.showItem();
		*/

		/* The following calls the Sort function,
		   which in turn calls the UserInput function,
		   resulting in the user being prompted for a value,
		   then the value entered is categorized.*/
		Sort sorted_value = new Sort();
		sorted_value.sortItem();
		
		// Now let's test creating a GUI:
		new UserInterface();               // constructor
	}
}