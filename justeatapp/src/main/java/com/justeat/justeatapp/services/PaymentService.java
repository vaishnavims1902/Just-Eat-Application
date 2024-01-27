package com.justeat.justeatapp.services;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.justeat.justeatapp.model.Payment;
import com.justeat.justeatapp.repository.PaymentRepo;

@Service
public class PaymentService {
    private PaymentRepo paymentRepo;
    public PaymentService(PaymentRepo paymentRepo) {
        this.paymentRepo = paymentRepo;
    }
    public List<Payment> getPayments() {
        return paymentRepo.findAll();
    }

    public Payment makePayment(Payment payment) throws IOException {
        return paymentRepo.save(payment);
    }

    public Optional<Payment> getPaymentOptional(int id) {
        return paymentRepo.findById(id);
    }
    public void deletePayment(int paymentId) {
        paymentRepo.deleteById(paymentId);
    }
}
