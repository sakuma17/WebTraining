package model;

import java.io.Serializable;

public class Vegetable implements Serializable{
	private String name;
	private int price;

	public Vegetable(String name,String price) {
		this.name=name;
		this.price = Integer.parseInt(price);
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

}
