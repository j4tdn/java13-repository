package com.persistence.persistence;

import java.time.LocalTime;

public class ItemDto {
    private Integer id;
    private String name;
    private LocalTime orderingTime;

    public ItemDto() {

    }

    public ItemDto(Integer id, String name, LocalTime orderingTime) {
        this.id = id;
        this.name = name;
        this.orderingTime = orderingTime;
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

    public LocalTime getOrderingTime() {
        return orderingTime;
    }

    public void setOrderingTime(LocalTime orderingTime) {
        this.orderingTime = orderingTime;
    }

    @Override
    public String toString() {
        return "ItemDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", orderingTime=" + orderingTime +
                '}';
    }
}
