import java.io.File;
public class TFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//if file is in project folder mentioning name is enough else full path is required
		File file1=new File("Tsecret_msg.txt");
		if(file1.exists()) {
			System.out.println("1.file exists");
			System.out.println("1."+file1.getPath());
			System.out.println("1."+file1.getAbsolutePath());
			System.out.println(file1.isFile()); 
		}
		else {
			System.out.println("1.file doesnot exists");
		}
		
			
		
		//will delete a file
		//file1.delete();
		//below file in file explorer
		//two backslashes or 1 forwardslash
		File file2=new File("C:\\Users\\DELL\\Documents\\SampleFIlesForJava\\Tpath_msg.txt");
		if(file1.exists()) {
			System.out.println("2.file exists");
		}
		else {
			System.out.println("2.file doesnot exists");
		}
		
		
		

	}

}
