package com.promineotech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<Card> cards = new ArrayList<Card>();
	
	public void shuffle() { //Shuffles deck
		Collections.shuffle(cards);
	}
	
	public Card draw() { //Draws a card from the deck.
		Card card = cards.remove(0);
		return card;
	}
	
	public Deck() { //Creates a deck of cards using Strings. 2-14 for points and 4 suits
		
		String[] name = new String[] {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", 
				"Jack", "Queen", "King", "Ace"};
		
		String[] suit = new String[] { "Clubs", "Diamonds", "Hearts", "Spades"};
	
	int nameCounter = 0;
	int suitCounter = 0;
	int value = 2;
	
	for(int i = 0; i < 52; i++) { // For lloop to iterate over all possible card suit combinations.
		Card card = new Card(value, name[nameCounter], suit[suitCounter]);
		
		nameCounter++;
		suitCounter++;
		value++;
		
		if(nameCounter > 12) { //resets card name increments
			nameCounter = 0;
		}
		
		if(suitCounter > 3) { //Selects suit 0 and the final iteration to avoid increment issues
			suitCounter = 0;
		}
		
		if( value > 14 ) { //resets card point values
			value = 2;
		}
		cards.add(card); // adds card to the deck.
	}
}
}
