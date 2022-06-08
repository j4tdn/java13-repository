package com.persistence.persistence;

public class ItemDetail {
    private Integer id;
    private Integer sizeId;
    private String image;
    private Double sellingPrice;
    private Double buyingPrice;
    private Integer amount;

    public ItemDetail(Integer id, Integer sizeId, String image, Double sellingPrice, Double buyingPrice, Integer amount) {
        this.id = id;
        this.sizeId = sizeId;
        this.image = image;
        this.sellingPrice = sellingPrice;
        this.buyingPrice = buyingPrice;
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSizeId() {
        return sizeId;
    }

    public void setSizeId(Integer sizeId) {
        this.sizeId = sizeId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public Double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(Double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "ItemDetail{" +
                "id=" + id +
                ", sizeId=" + sizeId +
                ", image='" + image + '\'' +
                ", sellingPrice=" + sellingPrice +
                ", buyingPrice=" + buyingPrice +
                ", amount=" + amount +
                '}';
    }
}
