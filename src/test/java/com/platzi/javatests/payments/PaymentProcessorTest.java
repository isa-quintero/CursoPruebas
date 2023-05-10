package com.platzi.javatests.payments;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {


    private PaymentGateaway paymentGateaway;
    private PaymentProcessor paymentProcessor;

    @Before
    public void setup(){
        paymentGateaway = Mockito.mock(PaymentGateaway.class);
        paymentProcessor=new PaymentProcessor(paymentGateaway);

    }

    @Test
    public void paymentIsCorrect() {
        Mockito.when(paymentGateaway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        boolean result = paymentProcessor.makePayment(1000);

        assertTrue(result);

    }
    @Test
    public void paymentIsWrong() {
        Mockito.when(paymentGateaway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));

        boolean result = paymentProcessor.makePayment(1000);

        assertFalse(result);

    }
}