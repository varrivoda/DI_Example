package com.example.dicontainer.service.impl;

import com.example.dicontainer.model.Gift;
import com.example.dicontainer.model.Person;
import com.example.dicontainer.service.DeliverySystem;

public class PostDeliverySystem implements DeliverySystem{

	public void deliver(Gift gift, Person person){
		System.out.println(String.format("Deliver a %s to %s by POST", gift.getName(), person.getName()));
	}

}