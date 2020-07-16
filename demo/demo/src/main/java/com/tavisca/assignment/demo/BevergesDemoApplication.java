package com.tavisca.assignment.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tavisca.assignment.beveragesTest.CRUDOpertions;

@SpringBootApplication
public class BevergesDemoApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(BevergesDemoApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(BevergesDemoApplication.class, args);

		CRUDOpertions crudObj = new CRUDOpertions();

		// Modify the below string and run the program to calculate your order
		// cost
		String order = " Chai ,-milk, Coffee, Mojito";

		final double cost = crudObj.getInvoiceFromOrder(order);

		LOGGER.info("Billing includes total cost of  : ${}", +cost);
	}

}
