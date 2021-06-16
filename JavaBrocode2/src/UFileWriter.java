import java.io.FileWriter;
public class UFileWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileWriter writer1=new FileWriter("Tpath_msg.txt");
		writer1.write("Roses are red \n Violets are blue \n Rocking everything");
		writer1.append("(A poem by Bro)");
		writer1.close();
		System.out.println("end");
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
			
		}

	}

}
