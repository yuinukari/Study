package com.example.ec.model;

import java.time.LocalDateTime;

public class Payment {
    private String paymentId;          // 例：PAY-00001
    private String orderId;            // Order への外部キー（1対1）
    private String paymentMethod;      // 支払い方法（例：CREDIT_CARD / BANK_TRANSFER）
    private int paidAmount;            // 支払い金額
    private String paymentStatus;      // 支払いステータス（例：PENDING / COMPLETED）
    private LocalDateTime paidAt;      // 支払い完了日時（未払いの場合は null）
    private LocalDateTime createdAt;   // レコード作成日時
    private LocalDateTime updatedAt;   // レコード更新日時

    public Payment(String paymentId, String orderId, String paymentMethod,
                   int paidAmount, String paymentStatus,
                   LocalDateTime paidAt, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.paymentId     = paymentId;
        this.orderId       = orderId;
        this.paymentMethod = paymentMethod;
        this.paidAmount    = paidAmount;
        this.paymentStatus = paymentStatus;
        this.paidAt        = paidAt;
        this.createdAt     = createdAt;
        this.updatedAt     = updatedAt;
    }

    public String getPaymentId()         { return paymentId; }
    public String getOrderId()           { return orderId; }
    public String getPaymentMethod()     { return paymentMethod; }
    public int getPaidAmount()           { return paidAmount; }
    public String getPaymentStatus()     { return paymentStatus; }
    public LocalDateTime getPaidAt()     { return paidAt; }
    public LocalDateTime getCreatedAt()  { return createdAt; }
    public LocalDateTime getUpdatedAt()  { return updatedAt; }
}
