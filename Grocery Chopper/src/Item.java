import static java.lang.System.out;

public class Item{
	
	// This class is not presently in use yet. 
	
	//The following private variables require other classes to use accessor methods
	private String name;
	private String category;
	private Boolean parishable;
	private Boolean edible;
	private Boolean frozen;
	
	public void setName(String name){       // public void setName(String n){
		this.name = name;                   //    name = n;}
	}
	
	public void setCat(String category){
		this.category = category;
	}
	
	public void setParish(Boolean parishable){
		this.parishable = parishable;
	}
	
	public void setEdible(Boolean edible){
		this.edible = edible;
	}
	
	public void setFrozen(Boolean frozen){
		this.frozen = frozen;
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
