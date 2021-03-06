package ezmet.enver.mystringmethods;

import java.util.Random;

public class MyStringMethod {
	public static String scramble(String word) {
		// Please replace the space with the length of the string
		String scrambled = "";
		Random rand = new Random();
		while (word.length() > 0) {
			int length = word.length();
			int index = rand.nextInt(length);
			String letter = word.substring(index, index + 1);
			String firstString = word.substring(0, index);
			String secondString = word.substring(index + 1);
			word = firstString + secondString;
			scrambled += letter;
		}
		return scrambled;

	}

	public static String replaceStringAt(String originalString, int index, String replaceString) {
		String newString = originalString;
		if (index <= originalString.length()) {
			int roomAvailable = originalString.length() - index;
			if (replaceString.length() > roomAvailable) {
				replaceString = replaceString.substring(0, roomAvailable);
			}
			String firstString = originalString.substring(0, index);
			String secondString = originalString.substring(index + replaceString.length());
			newString = firstString + replaceString + secondString;
		}
		return newString;

	}
}
