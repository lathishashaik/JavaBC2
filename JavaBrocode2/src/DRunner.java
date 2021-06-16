
public class DRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DPizza pizza1=new DPizza("thickcrust","tomato","mozzerella","pepperini");
		System.out.println("The ingredients are: ");
		System.out.println(pizza1.bread);
		System.out.println(pizza1.cheese);
		System.out.println(pizza1.sauce);
		System.out.println(pizza1.topping);
		DPizza pizza2=new DPizza("thickcrust","tomato","mozzerella");
		System.out.println(pizza2.bread);
		System.out.println(pizza2.cheese);
		System.out.println(pizza2.sauce);
		System.out.println(pizza2.topping);
		DPizza pizza3=new DPizza("thickcrust","tomato");
		System.out.println(pizza3.bread);
		System.out.println(pizza3.cheese);
		System.out.println(pizza3.sauce);
		System.out.println(pizza3.topping);
		DPizza pizza4=new DPizza("thickcrust");
		System.out.println(pizza4.bread);
		System.out.println(pizza4.cheese);
		System.out.println(pizza4.sauce);
		System.out.println(pizza4.topping);
		DPizza pizza5=new DPizza();
		System.out.println(pizza5.bread);
		System.out.println(pizza5.cheese);
		System.out.println(pizza5.sauce);
		System.out.println(pizza5.topping);

	}

}
