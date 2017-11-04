package org.sad.camera.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "part")
public class Part {

    private int partId;
    private int partType;
    private String partName;
    private String partWarrantly;
    private float partPrice;
    private String partImage;
    private String partDetail;

    public Part() {
    }

    public Part(int partId, int partType, String partName, String partWarrantly, float partPrice, String partImage, String partDetail) {
        this.partId = partId;
        this.partType = partType;
        this.partName = partName;
        this.partWarrantly = partWarrantly;
        this.partPrice = partPrice;
        this.partImage = partImage;
        this.partDetail = partDetail;
    }

    public int getPartId() {
        return partId;
    }

    public void setPartId(int partId) {
        this.partId = partId;
    }

    public int getPartType() {
        return partType;
    }

    public void setPartType(int partType) {
        this.partType = partType;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public String getPartWarrantly() {
        return partWarrantly;
    }

    public void setPartWarrantly(String partWarrantly) {
        this.partWarrantly = partWarrantly;
    }

    public float getPartPrice() {
        return partPrice;
    }

    public void setPartPrice(float partPrice) {
        this.partPrice = partPrice;
    }

    public String getPartImage() {
        return partImage;
    }

    public void setPartImage(String partImage) {
        this.partImage = partImage;
    }

    public String getPartDetail() {
        return partDetail;
    }

    public void setPartDetail(String partDetail) {
        this.partDetail = partDetail;
    }
}
