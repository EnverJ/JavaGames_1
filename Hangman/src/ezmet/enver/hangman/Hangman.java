package ezmet.enver.hangman;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import ezmet.enver.mystringmethods.MyStringMethod;
import ezmet.enver.mywindow.MyWindow;

public class Hangman extends MyWindow {
	private String phrase;
	private String clue;
	private String wrongLetters;
	private static final String FILENAME = "phrases.txt";

	public Hangman() {
		setFontSize(30);
		ArrayList<String> phrases = new ArrayList<String>();
		Random rand = new Random();
		try {
			BufferedReader in = new BufferedReader(new FileReader(new File(FILENAME)));
			String s = in.readLine();
			while (s != null) {
				phrases.add(s);
				s = in.readLine();
			}
			in.close();
			int numberOfPhrases = phrases.size();
			boolean again = true;
			while (again) {
				int pick = rand.nextInt(numberOfPhrases);
				phrase = phrases.get(pick);
				phrase = phrase.toUpperCase();
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
				again = prometForYesNo("Do you want to play again?");
			}
			System.exit(0);
		} catch (FileNotFoundException e) {
			print("Could not find the file " + FILENAME);
		} catch (IOException e) {
			print("Could not read from the file " + FILENAME);
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
