package com.promineotech;

public class App {

	public static void main(String[] args) {
		//Instantiating the deck
		Deck d = new Deck();
		//Instantiating Player 1 and 2
		Player p1 = new Player("A");
		Player p2 = new Player("B");
		// shuffling the deck
		d.shuffle();
		//dealing cards to two players
		dealCards(d,p1,p2);	
		//playing each round
		playHand(p1,p2);	
		//declare the result
		declareResults(p1,p2);
	}
	/*
	 * This method will take a Deck object and two player
	 * objects and will the cards equally between two
	 * players
	 */
	public static void dealCards(Deck d,Player p1,Player p2) {
		for(int i=1;i<=52;i++) {
			if(i%2==0) {
				p1.draw(d);
			}else {
				p2.draw(d);
			}
		}
	}
	/**
	 * The method will compare the hand of each round 
	 * and count the score
	 * @param p1
	 * @param p2
	 */
	public static void playHand(Player p1,Player p2){
		for(int j=1;j<=26;j++) {
			Card c1=p1.flip();
			Card c2=p2.flip();
			System.out.println("-------------------------------");
			System.out.println("Playing Round : "+j);
			c1.describe();
			c2.describe();
			
			
			if(c1.getValue()>c2.getValue()) {
				p1.incrementScore();
				System.out.println("Round :"+j+" won by "+p1.getName());
			}else if (c1.getValue()<c2.getValue()){
				p2.incrementScore();
				System.out.println("Round :"+j+" won by "+p2.getName());
			}else {
				System.out.println("Round :"+j+" was a draw");
			}
			System.out.println("-------------------------------");
		
			
		}

	}
	/*
	 * This method will declare the result based on final score
	 */
	public static void declareResults(Player p1,Player p2) {
		System.out.println("******************************");
		System.out.println("FINAL SCORE");
		System.out.println(p1.getName()+" "+p1.getScore());
		System.out.println(p2.getName()+" "+p2.getScore());
		if(p1.getScore()>p2.getScore()) {
			System.out.println("Winner is *** "+p1.getName());
		}else if(p1.getScore()<p2.getScore()) {
			System.out.println("Winner is *** "+p2.getName());
		}else {
			System.out.println("Its a Draw");
		}
		System.out.println("******************************");
	}

}
