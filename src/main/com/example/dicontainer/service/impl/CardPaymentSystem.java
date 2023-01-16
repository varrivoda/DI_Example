package com.example.dicontainer.service.impl;

import com.example.dicontainer.model.Gift;
import com.example.dicontainer.service.PaymentSystem;

public class CardPaymentSystem implements PaymentSystem{

	public void pay(Gift gift){
		System.out.println(String.format("Pay %d for %s by CARD", gift.getPrice(), gift.getName()));
	}

}