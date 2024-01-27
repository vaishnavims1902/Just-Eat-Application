package com.justeat.justeatapp.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.justeat.justeatapp.model.Delivery;
import com.justeat.justeatapp.services.DeliveryService;


@RestController
public class DeliveryController {
    @Autowired
    private DeliveryService deliveryService;
    @GetMapping("/getDelivery")
    public Delivery getDelivery() {
        return new Delivery();
    }
    @GetMapping("/getDeliveries")
    public List<Delivery> getDeliveries() {
        return deliveryService.getDeliveries();
    }
    @PostMapping("/makeDelivery")
    public String makeDelivery(@RequestBody Delivery delivery)throws IOException {
   
        deliveryService.makedDelivery(delivery);
        return "Delivered";
    }
    @DeleteMapping("/cancleDelivery {deliveryId}")
    public String deleteDelivery(@PathVariable int deliveryId) {
        deliveryService.deleteDelivery(deliveryId);
        return "Delivery Cancled";
    }
}
