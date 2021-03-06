package ezmet.enver.cards;

import java.util.ArrayList;

public class Hand {
	ArrayList<Card> cards = new ArrayList<Card>();

	public void add(Card card) {
		int index = 0;
		boolean done = false;
		while (!done && index < cards.size()) {
			Card cardinHand = cards.get(index);
			if (card.isGreaterThan(cardinHand)) {
				index += 1;
			} else {
				done = true;
			}
		}
		cards.add(card);
	}

	public String toString() {
		String string = "";
		for (int i = 0; i < cards.size(); i++) {
			Card card = cards.get(i);
			// if this is not the first card, compare it with the previous card.
			// if the suits are different add a couple extra space
			if (i > 0) {
				Card priorCard = cards.get(i-1);
				char priorSuit = priorCard.getSuit();
				char currentSuit = card.getSuit();
				if (priorSuit != currentSuit) {
					string += " ";
				}

			}
			string += card.toString() + " ";

		}
		return string;
	}

	public void remove(Card card) {
		int index = 0;
		boolean found = false;
		while (!found && index < cards.size()) {
			Card compareCard = cards.get(index);
			if (compareCard.equals(card)) {
				cards.remove(index);
				found = true;
			} else {
				index += 1;
			}
		}
	}

	public boolean contains(Card card) {
		int index = 0;
		boolean contains = false;
		while (!contains && index < cards.size()) {
			Card compareCard = cards.get(index);
			if (compareCard.equals(card)) {
				contains = true;
			} else {
				index += 1;
			}
		}
		return contains;
	}
	
    public Card cardAt(int i){
    	return cards.get(i);
    	
    }
    
	public int size() {
		return cards.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
