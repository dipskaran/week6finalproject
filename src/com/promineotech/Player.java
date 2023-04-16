package com.promineotech;

import java.util.ArrayList;
import java.util.List;
/**
 * The player class represent 
 * the card player
 * @author sappi
 *
 */
public class Player {
	private List<Card> hand;
	private int score;
	private String name;
	public Player(String name) {
		this.setScore(0);
		this.setName(name);
		this.hand = new ArrayList<Card>();
	}
	/**
	 * Hold the hands for each player
	 * 
	 */
	public void draw(Deck d) {
		hand.add(d.draw());
	}
	/**
	 *  the card object when a player flips during their turn
	 *  
	 */
	public Card flip() {
		Card cd=hand.remove(0);
		return cd;
	}
	/**
	 * Describes the Player object fields
	 */
	public void describe() {
		for(Card cd:hand) {
			System.out.println(this.name+" Player "+cd.getValue()+" "+cd.getName());
		}		
	}
	/**
	 * This record the score of each hand
	 */
	public void incrementScore() {
		setScore(getScore() + 1);
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
