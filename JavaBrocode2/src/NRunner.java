
public class NRunner {

	public static void main(String[]args) {
		NCar car1=new NCar("Ford","Mustang",2020);
		//ERROR :not visible as private variables=> encapsulation
		//System.out.println(car1.make);
		//but we can access/make changes by politely asking through getters &setters
		System.out.println(car1.getMake());
		car1.setYear(2021);;
		System.out.println(car1.getYear());
		
		
	}
	
}
