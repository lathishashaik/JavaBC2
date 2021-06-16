//Overloded Constructors
public class DPizza {
	String bread;
	String sauce;
	String cheese;
	String topping;
	public DPizza() {
		
	}
	public DPizza(String bread, String sauce, String cheese, String topping) {
	
		
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.topping = topping;
	}
	public DPizza(String bread, String sauce, String cheese) {
		super();
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
	}
	public DPizza(String bread, String sauce) {
		super();
		this.bread = bread;
		this.sauce = sauce;
	}
	public DPizza(String bread) {
		super();
		this.bread = bread;
	}
	

}
