package com.persistence.persistence;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="MatHang")
public class Item {
    @Id
    @Column(name = "MaMH")
    private int id;
    @Column(name = "TenMH")
    private String name;
    @Column(name = "MauSac")
    private String color;
    @OneToMany(mappedBy = "item")
    private List<ItemSizeRelation> sizes;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaLH", referencedColumnName = "MaLH")
    private ItemGroup itemGroup;

    public Item(){

    }
    public Item(int id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    public Item(int id, String name, String color, ItemGroup itemGroup) {
        this(id, name, color);
//        this.itemGroup = itemGroup;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

//    public ItemGroup getItemGroup() {
//        return itemGroup;
//    }

    public void setItemGroup(ItemGroup itemGroup) {
//        this.itemGroup = itemGroup;
    }

    public List<ItemSizeRelation> getSizes() {
        return sizes;
    }

    public void setSizes(List<ItemSizeRelation> sizes) {
        this.sizes = sizes;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
//                ", itemGroup=" + (itemGroup != null ? itemGroup.getName() : "") +
                '}';
    }
}