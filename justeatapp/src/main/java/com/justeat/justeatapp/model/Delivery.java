package com.justeat.justeatapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "delivery")
public class Delivery {
    @Id
    @GeneratedValue
    private int deliveryId;

    private double latitude;
    private double longitude;
    private boolean isDelivering;
    private String deliveryPersonName;
    private String location;
    private String contact;
    public int getDeliveryId() {
        return deliveryId;
    }
    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
    }
    public double getLatitude() {
        return latitude;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public double getLongitude() {
        return longitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    public boolean isDelivering() {
        return isDelivering;
    }
    public void setDelivering(boolean isDelivering) {
        this.isDelivering = isDelivering;
    }
    public String getDeliveryPersonName() {
        return deliveryPersonName;
    }
    public void setDeliveryPersonName(String deliveryPersonName) {
        this.deliveryPersonName = deliveryPersonName;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    @Override
    public String toString() {
        return "Delivery [deliveryId=" + deliveryId + ", latitude=" + latitude + ", longitude=" + longitude
                + ", isDelivering=" + isDelivering + ", deliveryPersonName=" + deliveryPersonName + ", location="
                + location + ", contact=" + contact + "]";
    }
    
}
