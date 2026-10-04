package com.example.ec.model;

import java.time.LocalDateTime;

public class Product {
    private String productId;        // 例：PROD-0001
    private String productName;      // 商品名
    private String description;      // 商品説明
    private int unitPrice;           // 単価（税抜）
    private String categoryId;       // Category への外部キー
    private int stockQuantity;       // 在庫数
    private boolean isActive;        // 販売中フラグ
    private LocalDateTime createdAt; // 登録日時
    private LocalDateTime updatedAt; // 更新日時

    public Product(String productId, String productName, String description,
                   int unitPrice, String categoryId, int stockQuantity,
                   boolean isActive, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.productId     = productId;
        this.productName   = productName;
        this.description   = description;
        this.unitPrice     = unitPrice;
        this.categoryId    = categoryId;
        this.stockQuantity = stockQuantity;
        this.isActive      = isActive;
        this.createdAt     = createdAt;
        this.updatedAt     = updatedAt;
    }

    public String getProductId()         { return productId; }
    public String getProductName()       { return productName; }
    public String getDescription()       { return description; }
    public int getUnitPrice()            { return unitPrice; }
    public String getCategoryId()        { return categoryId; }
    public int getStockQuantity()        { return stockQuantity; }
    public boolean isActive()            { return isActive; }
    public LocalDateTime getCreatedAt()  { return createdAt; }
    public LocalDateTime getUpdatedAt()  { return updatedAt; }
}
