
public class ERunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ECar car1=new ECar("Ford","Mustang",2020,"Blue");
		System.out.println(car1.toString());
		System.out.println(car1);
		//Now both statements gives same output before overriding
		//toString() both gives the address of car1(i.e object).

	}

}
