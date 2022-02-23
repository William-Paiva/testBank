package br.edu.univas.classes;

public class Address {
	
	
	private String street[] = new String[10];
	private int number[] = new int[10];
	
	public void setStreet(String street, int count) {
		this.street[count] = street;
	}
	public String getStreet(int count) {
		return street[count];
	}
	public void setNumber(int number, int count) {
		this.number[count] = number;
	}
	public int getNumber(int count) {
		return number[count];
	}
	
	

}
