package com.example.dicontainer.service.impl;

import com.example.dicontainer.model.Gift;
import com.example.dicontainer.model.Person;
import com.example.dicontainer.service.GiftChooseHelper;

public class SmartGiftChooseHelper implements GiftChooseHelper{

	
	public Gift choose(Person person){
		return new Gift("Smart watches", 10000);
	}
	
}