package org.sad.camera.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "manufacturer")
public class Manufacturer {

    private int manId;
    private String manName;
    private String manImage;

    public Manufacturer() {
    }

    public Manufacturer(int manId, String manName, String manImage) {
        this.manId = manId;
        this.manName = manName;
        this.manImage = manImage;
    }

    public int getManId() {
        return manId;
    }

    public void setManId(int manId) {
        this.manId = manId;
    }

    public String getManName() {
        return manName;
    }

    public void setManName(String manName) {
        this.manName = manName;
    }

    public String getManImage() {
        return manImage;
    }

    public void setManImage(String manImage) {
        this.manImage = manImage;
    }
}
