package com.promineotech;
/**
 * 
 * This class represents the a Card
 *
 */
public class Card {
	private int value;
	private String name;
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void describe() {
		System.out.println(name);
	}
}
