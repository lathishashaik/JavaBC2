
public class GRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GCar car1=new GCar("Tesla");
		GGarage garage=new GGarage();
		car1.drive();
		garage.park(car1);
		GCar car2=new GCar("Ford");
		garage.park(car2);

	}

}
