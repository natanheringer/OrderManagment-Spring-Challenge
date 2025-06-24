package com.webservice.OrderAndShipment;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.webservice.OrderAndShipment.entities.Order;
import com.webservice.OrderAndShipment.services.OrderService;

@SpringBootApplication
@ComponentScan({"com.webservice"})
public class Application implements CommandLineRunner {

	
		@Autowired
		private OrderService orderService;
		
		public static void main(String[] args) {
			
			SpringApplication.run(Application.class, args);
			
			
		}

		@Override
		public void run(String... args) throws Exception {
			// TODO Auto-generated method stub
			
			Scanner sc = new Scanner(System.in);
			sc.useLocale(Locale.US);
			
			
			System.out.print("\nCodigo do pedido: ");
			int code = sc.nextInt();
			
			System.out.print("\nValor Basico: ");
			double basicValue = sc.nextDouble();
			
			System.out.print("\nDesconto (%): ");
			double discount = sc.nextDouble();
			
			Order order = new Order(code, basicValue, discount);
			
			double total = orderService.total(order);
			
			System.out.println("Pedido código " + order.getCode());
			System.out.printf(Locale.US, "Valor total: R$ %.2f%n", total);
			
			sc.close();
		}
	
		
}
