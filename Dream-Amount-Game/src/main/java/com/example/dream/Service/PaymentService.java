package com.example.dream.Service;

import com.example.dream.Entity.Payment;

public interface PaymentService {

	Payment getPaymentById(int paymentId);
	Payment addPayment( Payment payment);

	Payment updateDb(int paymentId,Payment payment);

	void deleteDb(int paymentId);


}