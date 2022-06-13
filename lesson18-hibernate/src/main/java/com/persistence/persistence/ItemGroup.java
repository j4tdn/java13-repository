package com.persistence.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LoaiHang")
public class ItemGroup {
    @Id
    @Column(name = "MaLH")
    private Integer id;
    @Column(name = "TenLH")
    private String name;

    public ItemGroup() {

    }

    public ItemGroup(Integer itemGroupID, String itemGroupName) {
        this.id = itemGroupID;
        this.name = itemGroupName;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ItemGroup{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
