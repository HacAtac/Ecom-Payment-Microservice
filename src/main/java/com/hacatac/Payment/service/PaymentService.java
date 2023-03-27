package com.hacatac.Payment.service;

import com.hacatac.Payment.model.request.PaymentRequest;

public interface PaymentService {
    long doPayment(PaymentRequest paymentRequest);
}
