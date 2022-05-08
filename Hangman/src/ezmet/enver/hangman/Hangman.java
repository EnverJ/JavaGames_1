package ezmet.enver.hangman;

import ezmet.enver.mywindow.MyWindow;

public class Hangman extends MyWindow {
	private String phrase;
	private String clue;
	private String wrongLetters;

	public Hangman() {
		setFontSize(30);
		wrongLetters="ABCDEFGHIK";
		printPuzzle();
	}
	private void printPuzzle(){
		print("_______");
		switch(wrongLetters.length()){
		case 0:
			print("|");
			print("|       "+wrongLetters);
			print("|");
			print("|");
		    break;
		case 1:
			print("|   O");
			print("|      "+wrongLetters);
			print("|");
			print("|");
			break;
		case 2:
			print("|   O");
			print("|   | "+wrongLetters);
			print("|");
			print("|");
			break;
		case 3:
			print("|   O");
			print("|  -| "+wrongLetters);
			print("|");
			print("|");
			break;
		case 4:
			print("|   O");
			print("| --| "+wrongLetters);
			print("|");
			print("|");
			break;
		case 5:
			print("|   O");
			print("| --|- "+wrongLetters);
			print("|");
			print("|");
			break;
		case 6:
			print("|   O");
			print("| --|-- "+wrongLetters);
			print("|");
			print("|");
			break;
		case 7:
			print("|   O");
			print("| --|-- "+wrongLetters);
			print("|  /");
			print("|");
			break;
		case 8:
			print("|   O");
			print("| --|-- "+wrongLetters);
			print("| _/");
			print("| ");
			break;
		case 9:
			print("|   O");
			print("| --|-- "+wrongLetters);
			print("| _/ \\");
			print("| ");
			break;
		case 10:
			print("|    O");
			print("|  --|--     "+wrongLetters);
			print("|  _/ \\_");
			break;
			
		}
		print("|");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Hangman();

	}

}
