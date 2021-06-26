import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
public class WAudio {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		// TODO Auto-generated method stub
		//audio1 not working..DONT KNOW WHY
		//File audio1=new File("Time-to-Spare-An-Jone.wav");
		File audio2=new File("samplefiles\\Time-to-Spare-An-Jone.wav");
		AudioInputStream audioStream=AudioSystem.getAudioInputStream(audio2);
		Clip clip1=AudioSystem.getClip();
		clip1.open(audioStream);
		
		Scanner scan=new Scanner(System.in);
		String response="";
		while(!response.equals("Q")) {
		System.out.println("P=play , S=stop , R=reset , Q=Quit");
		System.out.println("enter your choice");
		response=scan.nextLine();
		response=response.toUpperCase();
		
		switch(response) {
		case "P":
			clip1.start();
			break;
		case "S":
			clip1.stop();
			break;
		case "R":
			clip1.setMicrosecondPosition(0);
			break;
		case "Q":
			clip1.close();
			break;
		default:
			System.out.println("Invalid response");
			
		}

	}
	}

}
