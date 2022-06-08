package com.persistence.dao;

import com.persistence.persistence.Item;

import java.util.List;

public interface ItemDao {
    List<Item> getAll();
    List<Item> findItemsByItemGroupName(String name);
}
