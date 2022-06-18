package com.persistence.persistence;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "LoaiHang")

//Required: query -> JPQL
@NamedQueries(
        @NamedQuery(name = ItemGroup.Q_SELECT_ALL, query = "FROM ItemGroup ")
)
public class ItemGroup {
    public static final String Q_SELECT_ALL = "SELECT_ALL_ITEM_GROUPS";
    @Id
    @Column(name = "MaLH")
    private Integer id;
    @Column(name = "TenLH")
    private String name;
    //default fetch: LAZY
    @OneToMany(mappedBy = "itemGroup")
    private List<Item> items;

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

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "ItemGroup{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
