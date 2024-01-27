package com.justeat.justeatapp.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue
    private int orderId;

    private String restaurant;   
    private double total;
    private String orderStatus;
    private int charges,quantity;

    @ManyToOne
    private User user;
    
    @OneToMany(mappedBy = "order")
    private List<FoodItems> foodItems;
    
    @OneToOne
    private Payment payment;
    
    @OneToOne
    private Delivery delivery;
    // other order attributes, getters, and setters
    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public String getRestaurant() {
        return restaurant;
    }
    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public String getOrderStatus() {
        return orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    public int getCharges() {
        return charges;
    }
    public void setCharges(int charges) {
        this.charges = charges;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return "Orders [orderId=" + orderId + ", restaurant=" + restaurant + ", total=" + total + ", foodItems="
                + foodItems + ", orderStatus=" + orderStatus + ", charges=" + charges + ", quantity=" + quantity + "]";
    }

    

}
