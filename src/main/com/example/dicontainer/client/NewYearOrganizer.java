package com.example.dicontainer.client;

import com.example.dicontainer.model.Person;
import com.example.dicontainer.service.GiftPresenter;
import com.example.dicontainer.service.impl.SmartGiftChooseHelper;
import com.example.dicontainer.service.impl.CardPaymentSystem;
import com.example.dicontainer.service.impl.PostDeliverySystem;
import com.example.dicontainer.service.GiftChooseHelper;
import com.example.dicontainer.service.PaymentSystem;
import com.example.dicontainer.service.DeliverySystem;

import com.example.dicontainer.service.impl.Recommendator;
// !check!
// do we need for implementation here? yes, This is the first usage
//But maybe only here?
import com.example.dicontainer.service.impl.SmartRecommendator;

public class NewYearOrganizer{
	//dependency declared first 
	private Recommendator recommendator= new SmartRecommendator();

	private GiftChooseHelper giftChooseHelper = new SmartGiftChooseHelper(recommendator);
	private PaymentSystem paymentSystem = new CardPaymentSystem();
	private DeliverySystem delivirySystem = new PostDeliverySystem();
		
	private GiftPresenter giftPresenter;
		
	public NewYearOrganizer(){
		giftPresenter = new GiftPresenter(giftChooseHelper, paymentSystem, delivirySystem, recommendator);
	}
	
	public void prepareToCelebration(){
		Person friend = new Person("ivan Ivanov");
		giftPresenter.presentGift(friend);
	}
}
