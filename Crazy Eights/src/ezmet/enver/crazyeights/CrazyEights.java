package ezmet.enver.crazyeights;

import ezmet.enver.cards.Card;
import ezmet.enver.cards.Deck;
import ezmet.enver.cards.Hand;
import ezmet.enver.mywindow.MyWindow;

public class CrazyEights extends MyWindow {

	public CrazyEights() {
		setFontSize(30);				
/*		Deck deck=new Deck();
		print(deck.toString());
		print(deck.size());
		ArrayList<Card> discardPile=new ArrayList<Card>();
		for(int i=0;i<10;i++){
			Card card=deck.deal();
			print(card.toString());
			discardPile.add(card);
		}
			print(deck.size());
			deck.reuse(discardPile);
			print(deck.toString());
			print(deck.size());
		*/
		
		Hand hand=new Hand();
		Card card1=new Card("KC");
		Card card2=new Card("7H");
		Card card3=new Card("JC");
		Card card4=new Card("2D");
		hand.add(card1);
		hand.add(card2);
		hand.add(card3);
		//hand.add(card4);
		print(hand.toString());
		print(hand.size());
		if(hand.contains(card3)){
			print("Found Jack of clubs");
		}
		if(hand.contains(card4)){
			print("Found 2 of Diamonds");
		}
		hand.remove(card2);
		hand.remove(card4);
		print(hand.toString());
		print(hand.size());
		
	}
	

	public static void main(String[] args) {
		new CrazyEights();

	}

}
