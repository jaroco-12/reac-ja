package com.web.restful_app;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer ID;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "price")
    private Double price;

    @Column(name = "description")
    private String description;

    @Column(name = "category")
    private String category;

    public Integer getID() {
        return ID;
    }

    public String getProductName() {
        return productName;
    }

    public Double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
