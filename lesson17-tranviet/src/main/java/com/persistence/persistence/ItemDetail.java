package com.persistence.persistence;

public class ItemDetail {
    private Integer id;
    private String name;
    private String color;
    private Integer groupId;
    private String sizeId;
    private Double price;

    public ItemDetail(Integer id, String name, String color, Integer groupId, String sizeId, Double price) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.groupId = groupId;
        this.sizeId = sizeId;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getSizeId() {
        return sizeId;
    }

    public void setSizeId(String sizeId) {
        this.sizeId = sizeId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ItemDetail{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", groupId=" + groupId +
                ", sizeId='" + sizeId + '\'' +
                ", price=" + price +
                '}';
    }
}
