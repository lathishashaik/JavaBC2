import java.io.FileWriter;
public class UFileWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//writer1 not working..DONT KNOW WHY
		//FileWriter writer1=new FileWriter("Tpath_msg.txt");
		FileWriter writer2=new FileWriter("C:\\Users\\DELL\\Documents\\SampleFIlesForJava\\Tpath_msg.txt");
		writer2.write("Roses are red \n Violets are blue \n Rocking everything");
		writer2.append("(A poem by Bro)");
		writer2.close();
		System.out.println("end");
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
			
		}

	}

}
