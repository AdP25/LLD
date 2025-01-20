package models;

import java.time.LocalDateTime;

public class Payment {

	private int paymentId;
	
	private Ticket ticket;
	
	private LocalDateTime transactionDate;
	
	private PaymentStatus status;
	
	public void makePayment(PaymentType type, Ticket ticket) {
		
	}
	
}
