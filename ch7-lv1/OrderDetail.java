package com.example.ec.model;

import java.time.LocalDateTime;

public class OrderDetail {
    private int detailId;            // 自動採番の明細ID（PK）
    private String orderId;          // Order への外部キー
    private String productId;        // Product への外部キー
    private int quantity;            // 数量
    private int unitPriceAtOrder;    // 注文時点の単価（税抜）
    private int subtotal;            // 小計（税込）
    private LocalDateTime createdAt; // レコード作成日時
    private LocalDateTime updatedAt; // レコード更新日時

    public OrderDetail(int detailId, String orderId, String productId,
                       int quantity, int unitPriceAtOrder, int subtotal,
                       LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.detailId         = detailId;
        this.orderId          = orderId;
        this.productId        = productId;
        this.quantity         = quantity;
        this.unitPriceAtOrder = unitPriceAtOrder;
        this.subtotal         = subtotal;
        this.createdAt        = createdAt;
        this.updatedAt        = updatedAt;
    }

    public int getDetailId()             { return detailId; }
    public String getOrderId()           { return orderId; }
    public String getProductId()         { return productId; }
    public int getQuantity()             { return quantity; }
    public int getUnitPriceAtOrder()     { return unitPriceAtOrder; }
    public int getSubtotal()             { return subtotal; }
    public LocalDateTime getCreatedAt()  { return createdAt; }
    public LocalDateTime getUpdatedAt()  { return updatedAt; }
}