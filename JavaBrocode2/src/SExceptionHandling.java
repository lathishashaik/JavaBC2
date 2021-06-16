import java.util.InputMismatchException;
import java.util.Scanner;

public class SExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		try {
		System.out.println("Enter a whole number to divide");
		int x=scan.nextInt();
		System.out.println("Enter a  number to be divided by");
		int y=scan.nextInt();
		int z=x/y;
		System.out.println("The result is "+z);
		
		}
		catch(ArithmeticException e1) {
			System.out.println("Number can't be divided by 0 ,IDIOT!");
			
		}
		catch(InputMismatchException e2) {
			System.out.println("Please enter a number only , OMFG");
			
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
		}
		finally {
			System.out.println("End of the program");
		}
		

	}

}
