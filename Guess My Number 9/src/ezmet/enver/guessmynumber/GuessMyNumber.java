package ezmet.enver.guessmynumber;

import ezmet.enver.mywindow.MyWindow;

public class GuessMyNumber extends MyWindow {
	public GuessMyNumber(){
		setFontSize(30);
		int myNumber=56;
		int myGuess=promtForInt("Guess my number between 0 and 100");
		while(myNumber!=myGuess){
			if(myGuess<myNumber){
			myGuess=promtForInt("You guessed too low,Please try again.");
			}
			else if(myGuess>myNumber){
				myGuess=promtForInt("You guessed too high.Please try again.");
			}
		}
		print("You guessd it.");


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GuessMyNumber();

	}

}
