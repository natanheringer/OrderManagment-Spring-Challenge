package com.webservice.OrderAndShipment.services;

import com.webservice.OrderAndShipment.entities.Order;


public class OrderService {

	public double applyDiscount (double basicValue, double discount) {
		
		
		return basicValue - (basicValue * discount); 
		
		
	}
	
	
	
}
