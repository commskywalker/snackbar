package com.snackbar.payment.application.gateways;

import com.snackbar.payment.domain.entity.Payment;
import com.snackbar.payment.domain.entity.PaymentMP;

import java.util.List;

public interface PaymentGateway {
    Payment createPayment(Payment payment);
    List<Payment> listPayments();
    PaymentMP createPaymentMP(PaymentMP paymentMP);
    void webHookExecution(PaymentMP paymentMP);
}
