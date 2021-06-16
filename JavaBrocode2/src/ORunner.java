
public class ORunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OCar car1=new OCar("Ford","Mustang",2020);
		OCar car2=new OCar("BMW","Mung",2001);
		
		System.out.println(car1);
		System.out.println(car2);
		
		/*car2=car1;
		System.out.println(car1);
		System.out.println(car2);*/
		//Above Addresses same i.e both objs point to same obj...i.e NOT COPY OF OBJS
		
		
		car1.copyAnObject(car2);
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
		
		
		


	}

}
