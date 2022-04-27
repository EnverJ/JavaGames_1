package ezmet.enver.secretcodekey;



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import ezmet.enver.mystringmethods.MyStringMethod;
import ezmet.enver.mywindow.MyWindow;

public class SecretCodeKey extends MyWindow {

	public SecretCodeKey() {
		// TODO Auto-generated constructor stub
		setFontSize(30);
		String alphabet="ABCDEFGHIGKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		String scrambled=MyStringMethod.scramble(alphabet);
		print(alphabet);
		print(scrambled);
		
		String fileName="key.txt";
		try {
			BufferedWriter out=new BufferedWriter(new FileWriter(new File(fileName)));
			out.write(alphabet);
			out.newLine();
			out.write(scrambled);
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			print("Could not open file"+fileName);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SecretCodeKey();

	}

}
