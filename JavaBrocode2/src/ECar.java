//     toString()
public class ECar {
	String make;
	String model;
	int year;
	String color;
	
	public ECar(String make, String model, int year, String color) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
	}
	public String toString() {
		return "CarDetails:\n"+this.make+"\n"+this.model+"\n"+this.year+"\n"+this.color+"\n";
	}

}
