package com.justeat.justeatapp.services;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.justeat.justeatapp.model.Delivery;
import com.justeat.justeatapp.repository.DeliveryRepo;


@Service
public class DeliveryService {
    private DeliveryRepo deliveryRepo;
    public DeliveryService(DeliveryRepo deliveryRepo) {
        this.deliveryRepo = deliveryRepo;
    }
    public List<Delivery> getDeliveries() {
        return deliveryRepo.findAll();
    }

    public Delivery makedDelivery(Delivery delivery) throws IOException {
        return deliveryRepo.save(delivery);
    }

    public Optional<Delivery> getDeliveryOptional(int id) {
        return deliveryRepo.findById(id);
    }
    public void deleteDelivery(int deliveryId) {
        deliveryRepo.deleteById(deliveryId);
    }
    
    
}
