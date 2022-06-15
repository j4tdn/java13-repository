package com.persistence.persistence;

import javax.persistence.*;

@Entity
@Table(name="LoaiHang")

//Required: query -> JPQL
@NamedQueries(
        @NamedQuery(name = ItemGroup.Q_SELECT_ALL, query = "FROM ItemGroup ")
)
public class ItemGroup {
    public static final String Q_SELECT_ALL = "SELECT_ALL_ITEM_GROUPS";
    @Id
    @Column(name="MaLH")
    private Integer id;
    @Column(name="TenLH")
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
