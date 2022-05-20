package ezmet.enver.crazyeights;

import java.util.ArrayList;
import java.util.Random;

import ezmet.enver.cards.Card;
import ezmet.enver.cards.Deck;
import ezmet.enver.cards.Hand;
import ezmet.enver.mywindow.MyWindow;

public class CrazyEights extends MyWindow {
	private Deck deck = new Deck();
	private Hand myHand = new Hand();
	private Hand computerHand = new Hand();
	private Card discard;
	private ArrayList<Card> discardPile = new ArrayList<Card>();
	private Random rand = new Random();
	private char activeSuit = ' ';

	public CrazyEights() {
		setFontSize(30);
		/*
		 * Deck deck=new Deck(); print(deck.toString()); print(deck.size());
		 * ArrayList<Card> discardPile=new ArrayList<Card>(); for(int
		 * i=0;i<10;i++){ Card card=deck.deal(); print(card.toString());
		 * discardPile.add(card); } print(deck.size()); deck.reuse(discardPile);
		 * print(deck.toString()); print(deck.size());
		 */
		/*
		 * Hand hand=new Hand(); Card card1=new Card("KC"); Card card2=new
		 * Card("7H"); Card card3=new Card("JC"); Card card4=new Card("2D");
		 * hand.add(card1); hand.add(card2); hand.add(card3); //hand.add(card4);
		 * print(hand.toString()); print(hand.size()); if(hand.contains(card3)){
		 * print("Found Jack of clubs"); } if(hand.contains(card4)){
		 * print("Found 2 of Diamonds"); } hand.remove(card2);
		 * hand.remove(card4); print(hand.toString()); print(hand.size());
		 */
		// deal 7 cards to each of us
		for (int i = 0; i < 7; i++) {
			Card card1 = deal();
			myHand.add(card1);
			Card card2 = deal();
			computerHand.add(card2);
			// turn up the discard
			discard = deal();
			if (discard.getRank() == '8') {
				activeSuit = discard.getSuit();

			} else {
				activeSuit = ' ';
			}

		}
		showStatus();
	}

	public void showStatus() {
		print();
		print("Computer Has " + computerHand.size() + " cards");
		print("My Hand " + myHand);
		print("Dicard: " + discard);
		if (discard.getRank() == '8') {
			print("Suit is " + activeSuit);
		}
	}

	private Card deal() {
		if (deck.size() == 0) {
			deck.reuse(discardPile);
			deck.shuffle();
			discardPile.clear();
			print();
			print("Reshuffled the discarded pile");
		}
		// deal a card from the deck
		Card card = deck.deal();
		return card;
	}

	public static void main(String[] args) {
		new CrazyEights();

	}

}
