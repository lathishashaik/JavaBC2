
public class IRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICar car1=new ICar();
		System.out.println(car1.speed);
		System.out.println(car1.doors);
		System.out.println(car1.wheels);
		car1.go();
		car1.stop();
		IBicycle bicycle1=new IBicycle();
		System.out.println(bicycle1.speed);
		System.out.println(bicycle1.pedals);
		System.out.println(bicycle1.wheels);
		bicycle1.go();
		bicycle1.stop();

	}

}
