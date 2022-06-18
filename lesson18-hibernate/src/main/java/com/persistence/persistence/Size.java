package com.persistence.persistence;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "KichCo")
public class Size {
    @Id
    @Column(name = "MaKC")
    private String id;
    @Column(name = "MoTa")
    private String description;
    @OneToMany(mappedBy = "size")
    private List<ItemSizeRelation> items;
    public Size(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public Size() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ItemSizeRelation> getItems() {
        return items;
    }

    public void setItems(List<ItemSizeRelation> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Size{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
