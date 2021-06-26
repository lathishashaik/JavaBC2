import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class VFileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Instead of throws can be surround by try catch block
		//writer1 not working..DONT KNOW WHY
			//FileReader reader1=new FileReader("Tpath_msg.txt");
		FileReader reader1=new FileReader("samplefiles\\Tpath_msg.txt");
		int data=reader1.read();
		while(data!=-1)//i.e end of the file
		{
			System.out.print((char)data);
			data=reader1.read();
			
		}
		reader1.close();

	}

}
