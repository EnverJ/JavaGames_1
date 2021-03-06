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
				String key = in.readLine();
				in.close();
				boolean quit = false;
				while (!quit) {
					String option = promtFor("Do you want to encode(E) or deocode(D) a message, or quit(Q)?");
					switch (option) {
					case "Q":
					case "q":
						quit = true;
						break;
					case "E":
					case "e":
						String messageToEncode = promtFor("Enter a message: ");
						String encodedMessage = encode(messageToEncode, alphabet, key);
						print(encodedMessage + "\n");
						break;
					case "D":
					case "d":
						String messageToDecode = promtFor("Enter a message to decode");
						String decodedMessage = encode(messageToDecode, key, alphabet);
						print(decodedMessage + "\n");
						break;
					default:
						print(option + " is not a valid option.");

					}
				}
			} catch (IOException e) {
				print("Could not be open file " + filename + ".");
			}
			System.exit(0);
		} catch (FileNotFoundException e) {
			print("could not find file" + filename + ".");
		}

	}

	private String encode(String message, String fromAlphabet, String toAlphabet) {
		String newMessage = message + " from " + fromAlphabet + " to " + toAlphabet;
		String letter = message.substring(0, 1);
		int letterPos = fromAlphabet.indexOf(letter);
		for (int i = 0; i < message.length(); i++) {
			if (letterPos > -1) {
				String newLetter = toAlphabet.substring(letterPos, letterPos + 1);
				newMessage += newLetter;
			} else {
				newMessage += letter;
			}
		}
		return newMessage;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SecretCode();

	}

}
