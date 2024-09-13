package com.servicios.gestion.domain;

public class Product {


    private int product_id;
    private String productName;
    private double price;
    private int stock;
    private String aviability;
    private Category category;


    public Product(){


    }

    public Product(int product_id, String productName, double price, int stock, String aviability, Category category) {
        this.product_id = product_id;
        this.productName = productName;
        this.price = price;
        this.stock = stock;
        this.aviability = aviability;
        this.category = category;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getAviability() {
        return aviability;
    }

    public void setAviability(String aviability) {
        this.aviability = aviability;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
