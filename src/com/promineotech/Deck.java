package com.promineotech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> deck;
	private String suit[] = {"clubs","diamonds","hearts","spades"};
	private int	ranks[]= {2,3,4,5,6,7,8,9,10,11,12,13,14};
	private String highRank[]= {"Jack","Queen","King","Ace"};
	/*
	 * The deck constructor will instantiate deck 52 cards in
	 * a deck
	 */
	public Deck() {
		deck = new ArrayList<Card>(52);
		for(String st: suit ) {
			for(int rk:ranks) {
				Card cd = new Card();
				cd.setValue(rk);
				int i=rk;
				switch(i) {
				case 11:
					cd.setName(highRank[0]+" of "+st);
					break;
				case 12:
					cd.setName(highRank[1]+" of "+st);
					break;
				case 13:
					cd.setName(highRank[2]+" of "+st);
					break;
				case 14:
					cd.setName(highRank[3]+" of "+st);
					break;
				default:
					cd.setName(rk+" of "+st);
					break;
				}
				deck.add(cd);
			}
		}
		
	}
	/*
	 * Shuffles the deck using the in-built algorithm
	 * in collections
	 */
	public void shuffle() {
		Collections.shuffle(deck);
	}
	/**
	 * Draw a card from top of deck to deal to players 
	 * 
	 */
	public Card draw() {
		Card cd=deck.remove(0);
		return cd;
	}
	/**
	 * Describes the Deck object fields
	 * 
	 */
	public void describe() {
		for(Card cd:deck) {
			System.out.println("Deck "+cd.getValue()+" "+cd.getName());
		}		
	}
		
}
