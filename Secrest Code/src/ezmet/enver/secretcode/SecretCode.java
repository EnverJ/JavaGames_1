package ezmet.enver.secretcode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import ezmet.enver.mywindow.MyWindow;

public class SecretCode extends MyWindow {

	public SecretCode() {
		// TODO Auto-generated constructor stub
		setFontSize(30);
		String filename = "C:\\Users\\enlem\\workspace\\DoITyourself\\Secrest Code\\key.txt";

		// BufferedReader in;
		try {
			BufferedReader in = new BufferedReader(new FileReader(new File(filename)));
			try {
				String alphabet = in.readLine();
				print(alphabet);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				print("Could not be open file " + filename + ".");
			}

			try {
				String key = in.readLine();
				print(key);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				print("Could not be open file " + filename + ".");

			}
			try {
				in.close();
			} catch (IOException e) {
				print("Could not be open file " + filename + ".");

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			print("could not find file" + filename + ".");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SecretCode();

	}

}