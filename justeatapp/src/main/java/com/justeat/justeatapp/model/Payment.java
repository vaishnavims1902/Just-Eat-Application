package com.justeat.justeatapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue
    private int paymentId;

    private String paymentMode;
    private double amount;
    // private String cardType;
    // private String cardNumber;
    // private String validity;
    // private String cvv;
    // private String
    public int getPaymentId() {
        return paymentId;
    }
    public void setPaymentid(int paymentId) {
        this.paymentId = paymentId;
    }
    public String getPaymentMode() {
        return paymentMode;
    }
    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    @Override
    public String toString() {
        return "Payment [paymentid=" + paymentId + ", paymentMode=" + paymentMode + ", amount=" + amount + "]";
    }
    




}
