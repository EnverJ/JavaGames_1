package ezmet.enver.wordmastermind;

import ezmet.enver.mywindow.MyWindow;

public class WordMastermind extends MyWindow {

	public WordMastermind() {
		boolean repeat=true;
		while(repeat){
			print("Hello");
			repeat=prometForYesNo("Should I repeat this?");
		}
	}

	public static void main(String[] args) {
		new WordMastermind();

	}

}
