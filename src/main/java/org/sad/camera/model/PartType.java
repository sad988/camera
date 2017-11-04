package org.sad.camera.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "partType")
public class PartType {

    private int partType;
    private String partTypeName;

    public PartType() {
    }

    public PartType(int partType, String partTypeName) {
        this.partType = partType;
        this.partTypeName = partTypeName;
    }

    public int getPartType() {
        return partType;
    }

    public void setPartType(int partType) {
        this.partType = partType;
    }

    public String getPartTypeName() {
        return partTypeName;
    }

    public void setPartTypeName(String partTypeName) {
        this.partTypeName = partTypeName;
    }
}
