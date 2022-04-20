package ezmet.enver.guessmynumber;

import java.util.Random;

import ezmet.enver.mywindow.MyWindow;

public class GuessMyNumber extends MyWindow {
	public GuessMyNumber(){
		setFontSize(30);
		Random rand=new Random();
		int myNumber=rand.nextInt(101);
		int myGuess=promtForInt("Guess my number between 0 and 100");
		int count=1;
		while(myNumber!=myGuess){
			if(myGuess<myNumber){
			myGuess=promtForInt("You guessed too low,Please try again.");
			}
			else if(myGuess>myNumber){
				myGuess=promtForInt("You guessed too high.Please try again.");
			}
			count+=1;
		}
		print("You gueesed it in "+count +" tries");
		


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GuessMyNumber();

	}

}
