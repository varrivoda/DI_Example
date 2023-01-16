package com.example.dicontainer.service;

import com.example.dicontainer.model.Gift;
import com.example.dicontainer.model.Person;

public interface DeliverySystem{
	public void deliver(Gift gift, Person person);
}