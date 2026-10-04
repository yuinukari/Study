package com.example.ec.service;

import com.example.ec.model.Customer;
import com.example.ec.model.Order;
import com.example.ec.model.OrderDetail;
import com.example.ec.model.Payment;
import java.util.List;

public class OrderService {
    // orders テーブルを操作する
    public Order placeOrder(String customerId, List<OrderDetail> details) { ... }
    public Order findOrderById(String orderId) { ... }
    public List<Order> findOrdersByCustomer(String customerId) { ... }
    public void updateOrderStatus(String orderId, String status) { ... }
    public int calcTotalAmount(List<OrderDetail> details) { ... }
}