package com.platzi.javatests.payments;

public interface PaymentGateaway {
    PaymentResponse requestPayment(PaymentRequest requests);
}
