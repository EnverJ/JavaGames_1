package ezmet.enver.hangman;

import ezmet.enver.mywindow.MyWindow;

public class Hangman extends MyWindow {
	private String phrase;
	private String clue;
	private String wrongLetters;

	public Hangman() {
		setFontSize(30);
		wrongLetters="ABC";
		printPuzzle();
	}
	private void printPuzzle(){
		print("_______");
		print("|    O");
		print("|  --|--     "+wrongLetters);
		print("|  _/ \\_");
		print("|");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Hangman();

	}

}
