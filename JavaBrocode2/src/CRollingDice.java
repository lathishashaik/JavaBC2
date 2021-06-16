//   VariableScope
import java.util.Random;
public class CRollingDice {
	Random random;
	int number;
	CRollingDice(){
		random=new Random();
		roll();
		
	}
	void roll() {
		int number=random.nextInt(6)+1;
		System.out.println("Random number : "+number);
	}

	

}
