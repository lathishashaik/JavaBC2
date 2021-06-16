import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class VFileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Insted of throws can be surround by try catch block
		FileReader reader1=new FileReader("Tpath_msg.txt");
		int data=reader1.read();
		while(data!=1)//i.e end of the file
		{
			System.out.println((char)data);
			data=reader1.read();
			
		}
		reader1.close();

	}

}
