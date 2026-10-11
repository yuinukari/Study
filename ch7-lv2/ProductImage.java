package com.example.inventory.model;

import java.time.LocalDateTime;

public class ProductImage {
    private int imageId;             // 自動採番（PK）
    private String productId;        // Product への外部キー
    private String imageUrl;         // 画像のURL
    private String altText;          // 代替テキスト
    private boolean isPrimary;       // メイン画像フラグ
    private int sortOrder;           // 表示順
    private LocalDateTime createdAt; // 登録日時
    private LocalDateTime updatedAt; // 更新日時

    public ProductImage(int imageId, String productId, String imageUrl,
                        String altText, boolean isPrimary, int sortOrder,
                        LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.imageId   = imageId;
        this.productId = productId;
        this.imageUrl  = imageUrl;
        this.altText   = altText;
        this.isPrimary = isPrimary;
        this.sortOrder = sortOrder;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getImageId()              { return imageId; }
    public String getProductId()         { return productId; }
    public String getImageUrl()          { return imageUrl; }
    public String getAltText()           { return altText; }
    public boolean isPrimary()           { return isPrimary; }
    public int getSortOrder()            { return sortOrder; }
    public LocalDateTime getCreatedAt()  { return createdAt; }
    public LocalDateTime getUpdatedAt()  { return updatedAt; }
}