package ezmet.enver.crazyeights;

import ezmet.enver.cards.Card;
import ezmet.enver.cards.Deck;
import ezmet.enver.mywindow.MyWindow;

public class CrazyEights extends MyWindow {

	public CrazyEights() {
		setFontSize(30);		
	/*	Card card1= new Card("HQ");
		print(card1.toString());
		Card card2=new Card("QC");
		print(card2.toString());
		if(!card1.isValid()){
			print("The first card is not valid");
		}
		if(!card2.isValid()){
			print("The second card is not valid");
		}
		if(card1.equals(card2)){
			print("The cards are equal.");
		}
		else{
			print("The cards are not equal");
		}
		if(card1.isGreaterThan(card2)){
			print("The first card is greater.");
		}
		else{
			print("The first card is not greater. ");
		}
		char c='X';
		if(Card.isValidSuit(c)){
			print(c+" is a valid suit");
		}
		else{
			print(c+" is not a valid suit");
		} */
		
		Deck deck=new Deck();
		print(deck.toString());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new CrazyEights();

	}

}
