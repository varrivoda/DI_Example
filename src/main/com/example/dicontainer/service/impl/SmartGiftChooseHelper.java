package com.example.dicontainer.service.impl;

import com.example.dicontainer.model.Gift;
import com.example.dicontainer.model.Person;
import com.example.dicontainer.service.GiftChooseHelper;

import com.example.dicontainer.service.impl.Recommendator;

// !check!
// do we need for implementation here?
//import com.example.dicontainer.service.impl.SmartRecommendator;


public class SmartGiftChooseHelper implements GiftChooseHelper{

	// create interface Recommendator
	private Recommendator recommendator;
	
	//create constructor, inject recommendator
	//Smart recommendator will be injected outside
	public SmartGiftChooseHelper(Recommendator recommendator){
		this.recommendator = recommendator;
	}
	// AND HERE WE HAVE JUST REALIZED 
	// that we have to inject it one more time! outside of superiior class!
	// this is called "dependency transfer", and happends here twice.
	// Besides of double injection, this way violates the principle of incapsulation 
	
	// Client code knows everithing about services,
	// 	and must to initialize all the resources, which are used by services
		
		//(Here we go to NYOrg and do it)
	
	
	public Gift choose(Person person){
		recommendator.recommend();
		return new Gift("Smart watches", 10002);
	}
	
}