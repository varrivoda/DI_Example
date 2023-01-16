//
// 1. Here we initialize service dependencies right here - in service class
//
// There are two good things about this kind of initialization:
// 	- it's simple, 
// 	- and from point of incapsulation it's okay, 
//because client class doesn't know anything about service's dependencies
//... 
// Here the good things are done, and starts the badthings:
// 	- for exapple, what will be if we won't pay by card and want to pay cash?
//In this case we have to change the code of service! And also - 
//we have to remove CardPaymentSystem
// This design also violates the SRP, because this service class 
// is also responsible for implementation of ChooseHelper, PS, DS;
// Everytime we're going to do a new implementation - we need to change GiftPresenter
// This code will be very difficult to support..
//

package com.example.dicontainer.service;

import com.example.dicontainer.model.Gift;
import com.example.dicontainer.model.Person;
import com.example.dicontainer.service.impl.SmartGiftChooseHelper;
import com.example.dicontainer.service.impl.CardPaymentSystem;
import com.example.dicontainer.service.impl.PostDeliverySystem;

public class GiftPresenter{
	
	private GiftChooseHelper giftChooseHelper = new SmartGiftChooseHelper();
	private PaymentSystem paymentSystem = new CardPaymentSystem();
	private DeliverySystem delivirySystem = new PostDeliverySystem();
	
	public void presentGift(Person person){
		Gift gift = giftChooseHelper.choose(person);
		System.out.println(String.format("Gift has been chosen: %s", gift.getName()));
		
		paymentSystem.pay(gift);
		delivirySystem.deliver(gift, person);
	}	
}