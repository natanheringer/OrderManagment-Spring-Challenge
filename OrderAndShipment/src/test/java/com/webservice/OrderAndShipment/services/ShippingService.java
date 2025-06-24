package com.webservice.OrderAndShipment.services;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {

	
	
	public double shipping(double basicValue) {
		
	    if (basicValue < 100) {
	        return 20.0;
	    } else if (basicValue <= 200) {
	        return 12.0;
	    } else {
	        return 0.0;
	    }
	
	}
	
	
}
