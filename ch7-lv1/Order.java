package com.example.ec.model;

import java.time.LocalDateTime;

public class Order {
    private String orderId;          // 例：ORD-00001
    private String customerId;       // Customer への外部キー
    private String orderStatus;      // 注文ステータス（例：PENDING / SHIPPED / DELIVERED）
    private int totalAmount;         // 合計金額（税込）
    private String shippingAddress;  // 配送先住所
    private LocalDateTime orderedAt; // 注文日時
    private LocalDateTime createdAt; // レコード作成日時
    private LocalDateTime updatedAt; // レコード更新日時

    public Order(String orderId, String customerId, String orderStatus,
                 int totalAmount, String shippingAddress,
                 LocalDateTime orderedAt, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.orderId         = orderId;
        this.customerId      = customerId;
        this.orderStatus     = orderStatus;
        this.totalAmount     = totalAmount;
        this.shippingAddress = shippingAddress;
        this.orderedAt       = orderedAt;
        this.createdAt       = createdAt;
        this.updatedAt       = updatedAt;
    }

    public String getOrderId()           { return orderId; }
    public String getCustomerId()        { return customerId; }
    public String getOrderStatus()       { return orderStatus; }
    public int getTotalAmount()          { return totalAmount; }
    public String getShippingAddress()   { return shippingAddress; }
    public LocalDateTime getOrderedAt()  { return orderedAt; }
    public LocalDateTime getCreatedAt()  { return createdAt; }
    public LocalDateTime getUpdatedAt()  { return updatedAt; }
}
