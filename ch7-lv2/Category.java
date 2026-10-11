package com.example.inventory.model;

import java.time.LocalDateTime;

public class Category {
    private String categoryId;       // 例：CAT-01
    private String categoryName;     // カテゴリ名（例：家電、書籍）
    private String parentCategoryId; // 親カテゴリID（null = ルートカテゴリ）
    private String description;      // カテゴリ説明
    private int displayOrder;        // 表示順
    private boolean isActive;        // 有効フラグ
    private LocalDateTime createdAt; // 登録日時
    private LocalDateTime updatedAt; // 更新日時

    public Category(String categoryId, String categoryName, String parentCategoryId,
                    String description, int displayOrder, boolean isActive,
                    LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.categoryId       = categoryId;
        this.categoryName     = categoryName;
        this.parentCategoryId = parentCategoryId;
        this.description      = description;
        this.displayOrder     = displayOrder;
        this.isActive         = isActive;
        this.createdAt        = createdAt;
        this.updatedAt        = updatedAt;
    }

    public String getCategoryId()        { return categoryId; }
    public String getCategoryName()      { return categoryName; }
    public String getParentCategoryId()  { return parentCategoryId; }
    public String getDescription()       { return description; }
    public int getDisplayOrder()         { return displayOrder; }
    public boolean isActive()            { return isActive; }
    public LocalDateTime getCreatedAt()  { return createdAt; }
    public LocalDateTime getUpdatedAt()  { return updatedAt; }
}