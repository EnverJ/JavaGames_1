package ezmet.enver.wordmastermind;

import ezmet.enver.mystringmethods.MyStringMethod;
import ezmet.enver.mywindow.MyWindow;

public class WordMastermind extends MyWindow {
	private String word;
	private String clue;

	public WordMastermind() {
		setFontSize(30);
		// String word = "book";
		// word = MyStringMethod.replaceStringAt(word, 2, "ating");
		// print(word);
		word = "quit";
		String guess = "lint";
		clue = "----";
		findRightPlaceLetters(guess);
		findWrongPleaceLetters(guess);
		print(clue);
	}

	private void findRightPlaceLetters(String guess) {
		for (int i = 0; i < guess.length(); i++) {
			// get the letter in that position of the guess and the word
			String guessLetter = guess.substring(i, i + 1);
			String wordLetter = word.substring(i, i + 1);
			// if guess letter is same as word letter, set clue to 0 and word to
			// -
			if (guessLetter.equals(wordLetter)) {
				clue = MyStringMethod.replaceStringAt(clue, i, "O");
				word = MyStringMethod.replaceStringAt(word, i, "-");
			}

		}

	}

	private void findWrongPleaceLetters(String guess) {
		for (int j = 0; j < guess.length(); j++) {
			// get the guess letter at position i
			String letter = guess.substring(j, j + 1);
			// if the letter is in word(indexOf>-1)
			int letterLoc = word.indexOf(letter);
			if (letterLoc > -1) {
				word = MyStringMethod.replaceStringAt(word, letterLoc, "-");
				// set clue at the loop index to X if it is still -
				String clueLetter = clue.substring(j, j + 1);
				if (clueLetter.equals("-")) {
					clue = MyStringMethod.replaceStringAt(clue, j, "X");

				}
			}
		}

	}

	public static void main(String[] args) {
		new WordMastermind();

	}

}
