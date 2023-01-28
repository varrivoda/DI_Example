//
// 2. Now we have 
//
//
//
// The code looks beautiful
// The dependencies are injected through constructor, and this is very cool
// Thus, we declare a contract to a client's code, and inform to it:
//	You're going to create GiftPresenter, so please first transmit the resources,
// 	give a ChooseHelper, a PaymentSystem and a DeliverySystem.
//	So the ..calling.. code knows what he must to give to GiftPresenter for good working.
//	
// And from the Testing point it is okay also, because we can easily transmit mock-objects 
//instead of the instancesof the real classes
//
// But! it is still not suitable for ..enterprise.. programming
// becausefor all these posivitive moments have to pay client's code
//
//lets take a look at NewYearOrganizer
// Now it have to instantiate all the dependencies of GiftPresenter
// Thus, now we improved quantity of dependencies
// Before we had only GiftPresenter, which dependends on three interfaces.
// Now we have NewYearOrganizer dependent from those classes, 
// and more- it depends on instantiation of these interfaces
//
//it is possible to work with the lack of classes and dependencies, 
//in this case we can manage implementations manually

// But if we work on a big project, 
// or - at least if we have three-level dependencies
//
// for example if SmartChooseHelper depends on interface Recomendator
// and it's implementation SmartRecommendator
//		this dependency willbe injected through the constructor as well,
// 		see SmartChooseHelper class
//		......
//






package com.example.dicontainer.service;

import com.example.dicontainer.model.Gift;
import com.example.dicontainer.model.Person;

//recommendator
import com.example.dicontainer.service.impl.Recommendator;
// !check!
// do we need for implementation here?
//import com.example.dicontainer.service.impl.SmartRecommendator;


public class GiftPresenter{
	
	private GiftChooseHelper giftChooseHelper;
	private PaymentSystem paymentSystem;
	private DeliverySystem delivirySystem;
	
	public GiftPresenter(GiftChooseHelper giftChooseHelper, 
						PaymentSystem paymentSystem, 
						DeliverySystem delivirySystem,
						Recommendator recommendator)
	{
		this.giftChooseHelper = giftChooseHelper;
		this.paymentSystem = paymentSystem;
		this.delivirySystem = delivirySystem;
	}
	
	
	public void presentGift(Person person){
		Gift gift = giftChooseHelper.choose(person);
		System.out.println(String.format("Gift has been chosen: %s", gift.getName()));
		
		paymentSystem.pay(gift);
		delivirySystem.deliver(gift, person);
	}	
}