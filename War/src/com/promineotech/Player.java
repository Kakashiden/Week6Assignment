package com.promineotech;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private List<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;

	public void describe() { //Prints out the players name and their hand.
		System.out.println(name + "'s Cards:" + "\n---");
		for(Card card : hand) {
			card.describe();
		}
	}
	public Card flip() { //Flips the top card of Players hand.
		Card card = hand.remove(0);
		return card;
	}
	
	public void draw(Deck deck) { //Draws a card from the deck and places it in players hand
		hand.add(deck.draw());
	}
	
	public void incrementScore() { //Increment plyer's score by one
		setScore(getScore() + 1);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
}
