package com.webservice.OrderAndShipment.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservice.OrderAndShipment.entities.Order;


@Service
public class OrderService {
	
	@Autowired
	private ShippingService shippingService;
	
	

	public double applyDiscount (double basicValue, double discount) {
		
		
		return basicValue - (basicValue * discount / 100.0); 
		
		
	}
	
	
	public double total(Order order) {
		
		
		double valueWithDiscount = applyDiscount(order.getBasicValue(), order.getDiscount());
		double shippingCost = shippingService.shipping(order.getBasicValue());
		return valueWithDiscount + shippingCost;
		
	}
	
	
}
