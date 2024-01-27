package com.justeat.justeatapp.controller;


import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.justeat.justeatapp.model.Orders;
import com.justeat.justeatapp.services.OrderService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;








@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/order")
    public Orders getOrder() {
        return new Orders();
    }
    
    @GetMapping("/getOrderById/{id}")
    public Optional<Orders> getOrderById(@PathVariable int id) {
        return orderService.getsOrder(id);
    }
    
    @GetMapping("/getOrders")
    public List<Orders> getAllOrders() {
        List<Orders> orders = orderService.getOrders();
        return orders;
    }
    @PostMapping("/placeOrder")
    public String placeOrder(@RequestBody Orders order) throws IOException {
   
        orderService.addOrder(order);
        return "Order send";
    }
    @DeleteMapping("/cancleOrderById/{orderId}")
    public String deleteOrder(@PathVariable int orderId) {
        orderService.deleteOrder(orderId);
        return "Order Cancled!";
    }
    
}
