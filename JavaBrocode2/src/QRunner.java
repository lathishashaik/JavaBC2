
public class QRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QCar car1=new QCar();
		QBicycle bicycle1=new QBicycle();
		QBoat boat1=new QBoat();
		//ALl the above objs can be stored in an array of type QVehicle
		QVehicle[] racers= {car1,bicycle1,boat1};
		//now after storing in array,these objs identify as it's own
		//individual & also as Vehicle which is POLYMORPHISHM
		for(QVehicle x:racers) {
			x.go();
		}

	}

}
