package com.ats.zaid.entities;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * Created by zaid jendoubi on 06/11/2017.
 */
@Document(collection = "products")
public class Product {
    @Id
    public String id;
    private String productName;
    private String basePrice;
    private String category;
    private String brand;
    private String productMaterial;
    private String imageUrl;
    private String delivery;
    private String details;
    private Collection<Review> reviews = new LinkedHashSet<Review>();

    public Product(String productName, String basePrice, String category, String brand, String productMaterial, String imageUrl, String delivery, String details) {
        this.productName = productName;
        this.basePrice = basePrice;
        this.category = category;
        this.brand = brand;
        this.productMaterial = productMaterial;
        this.imageUrl = imageUrl;
        this.delivery = delivery;
        this.details = details;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Collection<Review> getReviews() {
        return reviews;
    }

    public void setReviews(Collection<Review> reviews) {
        this.reviews = reviews;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(String basePrice) {
        this.basePrice = basePrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProductMaterial() {
        return productMaterial;
    }

    public void setProductMaterial(String productMaterial) {
        this.productMaterial = productMaterial;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
