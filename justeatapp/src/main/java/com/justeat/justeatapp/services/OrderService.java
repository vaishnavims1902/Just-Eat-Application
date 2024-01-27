package com.justeat.justeatapp.services;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.justeat.justeatapp.model.Orders;
import com.justeat.justeatapp.repository.OrdersRepo;

@Service
public class OrderService {
    private final OrdersRepo ordersRepository;
   
    
    private OrderService(OrdersRepo ordersRepo) {
        this.ordersRepository = ordersRepo;
    }

    public List<Orders> getOrders() {
        return ordersRepository.findAll();
    }

    public Orders addOrder(Orders order) throws IOException {
        return ordersRepository.save(order);
    }

    public Optional<Orders> getsOrder(int id) {
        return ordersRepository.findById(id);
    }
    public void deleteOrder(int orderId) {
        ordersRepository.deleteById(orderId);
    }
}