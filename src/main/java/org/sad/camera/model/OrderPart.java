package org.sad.camera.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orderPart")
public class OrderPart {

    private int orderId;
    private int partId;
    private int quantity;

    public OrderPart() {
    }

    public OrderPart(int orderId, int partId, int quantity) {
        this.orderId = orderId;
        this.partId = partId;
        this.quantity = quantity;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getPartId() {
        return partId;
    }

    public void setPartId(int partId) {
        this.partId = partId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
