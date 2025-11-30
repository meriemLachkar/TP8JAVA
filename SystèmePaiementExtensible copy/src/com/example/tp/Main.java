package com.example.tp;

public class Main {
	public static void main(String arg[]) {

		PaymentProcessor processor = new PaymentProcessor();

		processor.addMethod(new CreditCard("1234-5678-9012-3456", "Meriem Lachkar", 20000));
		processor.addMethod(new PayPal("meriem@gmail.com", 50000));
		processor.addMethod(new Bitcoin("1A2b3C4d5E", 550));

		double montant = 500;
		processor.processPayments(montant);
	}
}
