import static java.lang.System.out;

public class TestCase {

	public static void main(String[] args) {
		out.println("COMMENCE TEST");
		out.println("=============");
		
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
	}
}