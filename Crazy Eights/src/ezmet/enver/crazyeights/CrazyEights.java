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
	private int countHearts = 0;
	private int countDiamonds = 0;
	private int countClubs = 0;
	private int countSpades = 0;

	public CrazyEights() {
		setFontSize(30);
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
		// play until wither of us runs out of cards
		boolean done = false;
		while (!done) {
			playMyCard();
			// are there any cards left in my hand?
			if (myHand.size() == 0) {
				done = true;
			} else {
				playComputerCard();
				// are there any cards left in the computer hand?
				if (computerHand.size() == 0) {
					done = true;
				}
			}
		}

	}

	// showStatus();

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

	// 16.8 Your turn
	private void drawMyCard() {
		Card drewCard = deal();
		print();
		print("Your drew is " + drewCard);
		myHand.add(drewCard);
		// if I can play my drawn card, play it
		if (isValidPlay(drewCard.toString())) {
			print("You played " + drewCard);
			discardMyCard(drewCard);
		}
	}

	private void discardMyCard(Card myCard) {
		myHand.remove(myCard);
		discardPile.add(myCard);
		discard = myCard;
		if (myCard.getRank() == '8') {
			activeSuit = promtForSuit();
		}
	}

	private void playMyCard() {
		showStatus();
		boolean validPlay = false;
		// repean until the valid has been entered
		while (!validPlay) {
			String rankSuit = promtFor("Which card do you want to play? or press D to draw.");
			rankSuit = rankSuit.toUpperCase();
			// if draw, draw a card
			if (rankSuit.equals("D")) {
				drawMyCard();
				validPlay = true;
			}

			// else play the card
			else if (isValidPlay(rankSuit)) {
				Card selectedCard = new Card(rankSuit);
				discardMyCard(selectedCard);
				validPlay = true;
			}
		}
	}

	public boolean isValidPlay(String rankSuit) {
		boolean validPlay = true;
		Card card = new Card(rankSuit);
		// is it a valid card?
		if (!card.isValid()) {
			print(rankSuit + " is not a valid card.");
			validPlay = false;
		}
		// is the card in my hand?
		else if (!myHand.contains(card)) {
			print(rankSuit + " is not in my hand.");
			validPlay = false;
		}
		// 8s are always valid. If the card is not an 8...
		else if (card.getRank() != '8') {

			// is the discard an '8'?
			if (discard.getRank() == '8') {
				// does the card match the active suit?
				if (card.getSuit() != activeSuit) {
					print(rankSuit + " cannot be palyed on " + discard + " because the suit was set to " + activeSuit);
					validPlay = false;
				}
			}
			// if the discard is not an '8'
			// dose the discard match the rank of suit?
			else if (card.getSuit() != discard.getSuit() && card.getRank() != discard.getRank()) {
				print(rankSuit + " can not be palyed on " + discard);
				validPlay = false;
			}
		}
		return validPlay;

	}

	private void discardComputeGame(Card computerCard) {
		computerHand.remove(computerCard);
		discardPile.add(discard);
		discard = computerCard;
		if (discard.getRank() == '8') {
			int highestCount = countHearts;
			activeSuit = 'H';
			if (countDiamonds > highestCount) {
				highestCount = countDiamonds;
				activeSuit = 'D';

			}
			if (countClubs > highestCount) {
				highestCount = countClubs;
				activeSuit = 'C';

			}
			if (countSpades > highestCount) {
				highestCount = countSpades;
				activeSuit = 'C';

			}
		}
	}

	private void playComputerCard() {
		System.out.println("Computer Hand: " + computerHand.toString());
		ArrayList<Card> playableCards = new ArrayList<Card>();

		ArrayList<Card> eights = new ArrayList<>();
		countHearts = 0;
		countDiamonds = 0;
		countClubs = 0;
		countSpades = 0;
		// count eights and number of each suit
		for (int i = 0; i < computerHand.size(); i++) {
			Card card = computerHand.cardAt(i);
			if (card.getSuit() == '8') {
				eights.add(card);
			}
			// otherwise,count the number of each suit
			else {
				switch (card.getSuit()) {
				case 'H':
					countHearts++;
					break;
				case 'D':
					countDiamonds++;
					break;
				case 'C':
					countClubs++;
					break;
				case 'S':
					countSpades++;
					break;
				}
			}

		}
		// make a list of playable cards
		for (int i = 0; i < computerHand.size(); i++) {
			Card card = computerHand.cardAt(i);
			// if discard is an 8, all cards of active suit are playable
			if (discard.getRank() == '8') {
				if (card.getSuit() == activeSuit) {
					playableCards.add(card);
				}
			}
			/*
			 * // else, if discard is not an 8 // only cards of that suit or
			 * rank are palyable else
			 * if(card.getSuit()==discard.getSuit()||card.getRank()==discard.
			 * getRank()){ playableCards.add(card); } } // play a random
			 * playable card int numberOfPlayableCards=playableCards.size();
			 * if(numberOfPlayableCards>0){ int
			 * pick=rand.nextInt(numberOfPlayableCards); Card
			 * playedCard=playableCards.get(pick);
			 * discardComputeGame(playedCard); } // otherwise, if have an eight,
			 * play an eight else if(eights.size()>0){ Card
			 * playedCard=eights.get(0) }
			 */
		}
		for (int i = 0; i < computerHand.size(); i++) {
			Card card = computerHand.cardAt(i);
			if ((card.getSuit() == discard.getSuit()) || card.getRank() == discard.getRank()) {
				playableCards.add(card);
			}
		}
		// pick a random palyable card
		int numberOfPlayableCards = playableCards.size();
		if (numberOfPlayableCards > 0) {
			int pick = rand.nextInt(numberOfPlayableCards);
			Card playedCard = playableCards.get(pick);
			discardComputeGame(playedCard);

		}

		else if (eights.size() > 0) {
			Card playedCard = eights.get(0);
			discardComputeGame(playedCard);
		}

		// if nothing could play, drew a card
		else {
			Card drewCard = deal();
			computerHand.add(drewCard);
			print();
			print("Computer drewed " + drewCard);
			// if it plays, play it
			if (drewCard.getSuit() == discard.getSuit() || drewCard.getRank() == discard.getRank()) {
				discardComputeGame(drewCard);
			}

		}

	}

	private char promtForSuit() {
		char suit = ' ';
		boolean validSuit = false;
		while (!validSuit) {
			suit = promtForChar("Change the suit to H, D, C, OR S?");
			suit = Character.toUpperCase(suit);
			if (Card.isValidSuit(suit)) {
				validSuit = true;
			}
		}
		return suit;
	}

	public static void main(String[] args) {
		new CrazyEights();

	}

}
