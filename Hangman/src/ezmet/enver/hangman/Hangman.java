package ezmet.enver.hangman;

import ezmet.enver.mystringmethods.MyStringMethod;
import ezmet.enver.mywindow.MyWindow;

public class Hangman extends MyWindow {
	private String phrase;
	private String clue;
	private String wrongLetters;

	public Hangman() {
		setFontSize(30);
		phrase = "HELLO WORLD";
		blankOutClue();
		wrongLetters = "";
		printPuzzle();
		while (clue.contains("-") && wrongLetters.length() < 10) {
			String guess = promtFor("please guess a letter!");
			guess = guess.toUpperCase();
			if (guess.length() != 1) {
				print("You must contain only one letter. please guessa again!!!");
			} else if (clue.contains(guess) || wrongLetters.contains(guess)) {
				print("You have guessed " + guess + "." + "Please guessa another letter!");

			} else {
				boolean found = false;
				int index = phrase.indexOf(guess);
				while (index > -1) {
					found = true;
					clue = MyStringMethod.replaceStringAt(clue, index, guess);
					index = phrase.indexOf(guess, index + 1);
					printPuzzle();
				}

				if (!found) {
					wrongLetters += guess;
				}
				printPuzzle();
			}
		}
		if (!clue.contains("-")) {
			print("Congratulation!!! you sloved the puzzle.");
		} else {
			print("Sorry, you lose. The pharse was " + phrase);
		}
	}

	private void printPuzzle() {
		print("_______");
		switch (wrongLetters.length()) {
		case 0:
			print("|");
			print("|       " + wrongLetters);
			print("|");
			print("|");
			break;
		case 1:
			print("|   O");
			print("|      " + wrongLetters);
			print("|");
			print("|");
			break;
		case 2:
			print("|   O");
			print("|   | " + wrongLetters);
			print("|");
			print("|");
			break;
		case 3:
			print("|   O");
			print("|  -| " + wrongLetters);
			print("|");
			print("|");
			break;
		case 4:
			print("|   O");
			print("| --| " + wrongLetters);
			print("|");
			print("|");
			break;
		case 5:
			print("|   O");
			print("| --|- " + wrongLetters);
			print("|");
			print("|");
			break;
		case 6:
			print("|   O");
			print("| --|-- " + wrongLetters);
			print("|");
			print("|");
			break;
		case 7:
			print("|   O");
			print("| --|-- " + wrongLetters);
			print("|  /");
			print("|");
			break;
		case 8:
			print("|   O");
			print("| --|-- " + wrongLetters);
			print("| _/");
			print("| ");
			break;
		case 9:
			print("|   O");
			print("| --|-- " + wrongLetters);
			print("| _/ \\");
			print("| ");
			break;
		case 10:
			print("|    O");
			print("|  --|--     " + wrongLetters);
			print("|  _/ \\_");
			break;

		}
		print("|     " + clue);

	}

	private void blankOutClue() {

		clue = "";
		for (int i = 0; i < phrase.length(); i++) {
			char letter = phrase.charAt(i);
			if (letter == ' ') {
				clue += ' ';

			} else {
				clue += '-';
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Hangman();

	}

}
