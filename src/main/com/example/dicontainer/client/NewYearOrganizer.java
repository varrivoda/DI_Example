package com.example.dicontainer.client;

import com.example.dicontainer.model.Person;
import com.example.dicontainer.service.GiftPresenter;

public class NewYearOrganizer{
	
	/*
	public static void main(String[] args){
		prepareToCelebration();
	}
	*/
	
	private GiftPresenter giftPresenter;
	
	public NewYearOrganizer(){
		giftPresenter = new GiftPresenter();
	}
	
	public void prepareToCelebration(){
		Person friend = new Person("ivan Ivanov");
		giftPresenter.presentGift(friend);
	}
}
