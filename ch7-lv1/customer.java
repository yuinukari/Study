package com.example.ec.model;

import java.time.LocalDateTime;

public class Customer {
    private String customerId;       // 例：CUST-0001
    private String lastName;         // 姓
    private String firstName;        // 名
    private String email;            // メールアドレス（ログインID）
    private String phoneNumber;      // 電話番号
    private String postalCode;       // 郵便番号
    private String address;          // 住所
    private LocalDateTime createdAt; // 登録日時
    private LocalDateTime updatedAt; // 更新日時

    public Customer(String customerId, String lastName, String firstName,
                    String email, String phoneNumber,
                    String postalCode, String address,
                    LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.customerId  = customerId;
        this.lastName    = lastName;
        this.firstName   = firstName;
        this.email       = email;
        this.phoneNumber = phoneNumber;
        this.postalCode  = postalCode;
        this.address     = address;
        this.createdAt   = createdAt;
        this.updatedAt   = updatedAt;
    }

    public String getCustomerId()        { return customerId; }
    public String getLastName()          { return lastName; }
    public String getFirstName()         { return firstName; }
    public String getEmail()             { return email; }
    public String getPhoneNumber()       { return phoneNumber; }
    public String getPostalCode()        { return postalCode; }
    public String getAddress()           { return address; }
    public LocalDateTime getCreatedAt()  { return createdAt; }
    public LocalDateTime getUpdatedAt()  { return updatedAt; }
}