package ezmet.enver.crazyeights;

import ezmet.enver.cards.Card;
import ezmet.enver.mywindow.MyWindow;

public class CrazyEights extends MyWindow {

	public CrazyEights() {
		setFontSize(30);
		Card card=new Card();
//		print(""+card);//or
		print(card.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new CrazyEights();

	}

}