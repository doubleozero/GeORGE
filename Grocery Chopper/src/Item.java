import static java.lang.System.out;

public class Item{
	private String name;
	private String category;
	private Boolean parishable;
	private Boolean edible;
	private Boolean frozen;
	
	public void assignName(String n){
		name = n;
	}
	
	public void assignCat(String c){
		category = c;
	}
	
	public void isParish(Boolean s){
		parishable = s;
	}
	
	public void isEdible(Boolean e){
		edible = e;
	}
	
	public void isFrozen(Boolean f){
		frozen = f;
	}
	
	public void showItem(){
		out.print(name);
		out.print(" is a ");
		out.print(category);
		out.print(" which is ");
		if(parishable == true){
			out.print("perishable");
		}
		else{
			out.print("non-perishable");
		}
		out.print(", ");
		if(edible == true){
			out.print("edible");
		}
		else{
			out.print("nonedible");
		}		
		out.print(", and ");		
		if(frozen == true){
			out.print("frozen");
		}
		else{
			out.print("nonfrozen");
		}		
		out.println(".");
	}
}
