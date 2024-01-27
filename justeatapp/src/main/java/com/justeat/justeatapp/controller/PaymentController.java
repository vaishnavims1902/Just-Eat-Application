package com.justeat.justeatapp.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.justeat.justeatapp.model.Payment;
import com.justeat.justeatapp.services.PaymentService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;






@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @GetMapping("/getPayment")
    public Payment getPayment() {
        return new Payment();
    }
    @GetMapping("/getPayments")
    public List<Payment> getPayments() {
        return paymentService.getPayments();
    }
    @PostMapping("/makePayment")
    public String makePayment(@RequestBody Payment payment)throws IOException {
   
        paymentService.makePayment(payment);
        return "Payment Successful";
    }
    @DeleteMapping("/canclePaymentById/{paymentId}")
    public String deletePayment(@PathVariable int paymentId) {
        paymentService.deletePayment(paymentId);
        return "Payment Cancled";
    }
    
    
    
    
}
