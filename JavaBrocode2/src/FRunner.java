
public class FRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FFood food1=new FFood("pizza");
		FFood food2=new FFood("hamburger");
		FFood food3=new FFood("hotdog");
		
		/*FFood[] fridge=new FFood[3];
		
		fridge[0]=food1;
		fridge[1]=food2;
		fridge[2]=food3;*/
		//or
		FFood[] fridge= {food1,food2,food3};
		System.out.println(fridge[0]);//address as food1,2,3 are objects
		System.out.println(fridge[0].name);
		

	}

}
