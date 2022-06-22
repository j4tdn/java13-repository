package com.persistence.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="ChiTietMatHang")
public class ItemSizeRelation {
    @Embeddable
    public static class ItemSizeID implements Serializable {
        public static final long serialVersionUID = 709951244112937908L;
        @Column(name="MaMH")
        private Integer itemId;
        @Column(name="MaKC")
        private String sizeId;

        public Integer getItemId() {
            return itemId;
        }

        public void setItemId(Integer itemId) {
            this.itemId = itemId;
        }

        public String getSizeId() {
            return sizeId;
        }

        public void setSizeId(String sizeId) {
            this.sizeId = sizeId;
        }

        public ItemSizeID() {

        }

        public ItemSizeID(Integer itemId, String sizeId) {
            this.itemId = itemId;
            this.sizeId = sizeId;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(this instanceof ItemSizeID)) return false;
            final ItemSizeID that = (ItemSizeID)obj;
            return getItemId() == that.getItemId() && getSizeId() == that.getSizeId();
        }

        @Override
        public int hashCode() {
            return Objects.hash(getItemId(), getSizeId());
        }
    }
    @EmbeddedId
    private ItemSizeID id;
    @Column(name="HinhAnh")
    private String image;
    @Column(name="GiaMua")
    private Double buyPrice;
    @Column(name="GiaBan")
    private Double salesPrice;
    @Column(name="SoLuong")
    private Integer amount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="MaMH", referencedColumnName = "MaMH", insertable = false, updatable = false)
    private Item item;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="MaKC", referencedColumnName = "MaKC", insertable = false, updatable = false)
    private Size size;

    public ItemSizeRelation(){

    }

    public ItemSizeRelation(ItemSizeID id, String image, Double buyPrice, Double salesPrice, Integer amount) {
        this.id = id;
        this.image = image;
        this.buyPrice = buyPrice;
        this.salesPrice = salesPrice;
        this.amount = amount;
    }

    public ItemSizeRelation(ItemSizeID id, String image, Double buyPrice, Double salesPrice, Integer amount, Item item, Size size) {
        this.id = id;
        this.image = image;
        this.buyPrice = buyPrice;
        this.salesPrice = salesPrice;
        this.amount = amount;
        this.item = item;
        this.size = size;
    }

    public ItemSizeID getId() {
        return id;
    }

    public void setId(ItemSizeID id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public Double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(Double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "ItemSizeRelation{" +
                "id=" + id +
                ", image='" + image + '\'' +
                ", buyPrice=" + buyPrice +
                ", salesPrice=" + salesPrice +
                ", amount=" + amount +
                ", item=" + item +
                ", size=" + size +
                '}';
    }
}
