package com.example.dicontainer.model;

public class Gift{
	private String name;
	private int price;
	
	public Gift(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public String getName(){
		return name;
	}
	
	public int getPrice(){
		return price;
	}
	
}