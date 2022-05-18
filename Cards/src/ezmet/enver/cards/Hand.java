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
			string += card + " ";

		}
		return string;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
