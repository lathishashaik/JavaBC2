import java.util.Scanner;
public class RRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DYNAMIC POLYMORPHISM
		Scanner scan=new Scanner(System.in);
		System.out.println("(1=Dog) (2=Cat)");
		System.out.println("ENter your choice");
		int choice=scan.nextInt();
		
		
		RAnimal animal1;
		RAnimal animal2;
		if(choice==1) {
			animal1=new RDog();
			animal1.speak();
		}
		else if(choice==2) {
			animal2=new RCat();
			animal2.speak();
		}
		
		else {
			System.out.println("Invalid choice");
			
		}

	}

}
