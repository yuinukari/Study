package com.example.inventory.model;

import java.time.LocalDateTime;

public class Stock {
    private int stockId;              // 自動採番（PK）
    private String productId;         // Product への外部キー（1対1）
    private int quantity;             // 現在在庫数
    private int reorderPoint;         // 発注点（この数を下回ったら発注）
    private int reorderQuantity;      // 発注数量
    private String warehouseLocation; // 倉庫内の保管場所（例：A-3-2）
    private LocalDateTime updatedAt;  // 在庫更新日時
    private LocalDateTime createdAt;  // レコード作成日時

    public Stock(int stockId, String productId, int quantity, int reorderPoint,
                 int reorderQuantity, String warehouseLocation,
                 LocalDateTime updatedAt, LocalDateTime createdAt) {
        this.stockId           = stockId;
        this.productId         = productId;
        this.quantity          = quantity;
        this.reorderPoint      = reorderPoint;
        this.reorderQuantity   = reorderQuantity;
        this.warehouseLocation = warehouseLocation;
        this.updatedAt         = updatedAt;
        this.createdAt         = createdAt;
    }

    public int getStockId()                  { return stockId; }
    public String getProductId()             { return productId; }
    public int getQuantity()                 { return quantity; }
    public int getReorderPoint()             { return reorderPoint; }
    public int getReorderQuantity()          { return reorderQuantity; }
    public String getWarehouseLocation()     { return warehouseLocation; }
    public LocalDateTime getUpdatedAt()      { return updatedAt; }
    public LocalDateTime getCreatedAt()      { return createdAt; }
}