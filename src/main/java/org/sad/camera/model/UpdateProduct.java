package org.sad.camera.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "updateProduct")
public class UpdateProduct {

    private int productId;
    private Date updateTime;

    public UpdateProduct() {
    }

    public UpdateProduct(int productId, Date updateTime) {
        this.productId = productId;
        this.updateTime = updateTime;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
