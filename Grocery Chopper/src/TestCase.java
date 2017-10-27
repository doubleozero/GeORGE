import static java.lang.System.out;

public class TestCase {

	public void runTest() {
		out.println("COMMENCE TEST");
		out.println("=============");
		
		/* Static values test, remove later
		Item banana = new Item();
		banana.assignName("banana");
		banana.assignCat("fruit");
		banana.isEdible(true);
		banana.isFrozen(false);
		banana.isParish(true);		
		banana.showItem();
		
		Item deoderant = new Item();
		deoderant.assignName("deoderant");
		deoderant.assignCat("hygene product");
		deoderant.isEdible(false);
		deoderant.isFrozen(false);
		deoderant.isParish(false);		
		deoderant.showItem();
		*/

		// The following calls the Sort function,
		// which in turn calls the UserInput function,
		// resulting in the user being prompted for a value,
		// then the value entered is categorized.
		Sort sorted_value = new Sort();
		sorted_value.sortItem();
	}
}