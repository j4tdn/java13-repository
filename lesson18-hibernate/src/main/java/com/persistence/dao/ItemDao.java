package com.persistence.dao;

import com.persistence.persistence.Item;

import java.util.List;
import java.util.Optional;

public interface ItemDao {
    List<Item> getAll();

    Optional<Item> get(int id);

    Optional<Item> find(int id);

    void firstLevelCache();
}
