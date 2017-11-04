package org.sad.camera.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "product")
public class Product {

    private int productId;
    private int manId;
    private String productName;
    private String productWarranty;
    private float product_price;
    private float productSize;
    private String productOverview;
    private String productImages;
    private String productSpecial;
    private String productImage_full;
    private String productPort;

    public Product() {
    }

    public Product(int productId, int manId, String productName, String productWarranty, float product_price, float productSize, String productOverview, String productImages, String productSpecial, String productImage_full, String productPort) {
        this.productId = productId;
        this.manId = manId;
        this.productName = productName;
        this.productWarranty = productWarranty;
        this.product_price = product_price;
        this.productSize = productSize;
        this.productOverview = productOverview;
        this.productImages = productImages;
        this.productSpecial = productSpecial;
        this.productImage_full = productImage_full;
        this.productPort = productPort;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getManId() {
        return manId;
    }

    public void setManId(int manId) {
        this.manId = manId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductWarranty() {
        return productWarranty;
    }

    public void setProductWarranty(String productWarranty) {
        this.productWarranty = productWarranty;
    }

    public float getProduct_price() {
        return product_price;
    }

    public void setProduct_price(float product_price) {
        this.product_price = product_price;
    }

    public float getProductSize() {
        return productSize;
    }

    public void setProductSize(float productSize) {
        this.productSize = productSize;
    }

    public String getProductOverview() {
        return productOverview;
    }

    public void setProductOverview(String productOverview) {
        this.productOverview = productOverview;
    }

    public String getProductImages() {
        return productImages;
    }

    public void setProductImages(String productImages) {
        this.productImages = productImages;
    }

    public String getProductSpecial() {
        return productSpecial;
    }

    public void setProductSpecial(String productSpecial) {
        this.productSpecial = productSpecial;
    }

    public String getProductImage_full() {
        return productImage_full;
    }

    public void setProductImage_full(String productImage_full) {
        this.productImage_full = productImage_full;
    }

    public String getProductPort() {
        return productPort;
    }

    public void setProductPort(String productPort) {
        this.productPort = productPort;
    }
}
