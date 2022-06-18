package com.persistence.service;

import com.persistence.persistence.Item;

import java.util.List;
import java.util.Optional;

public interface ItemService {
    List<Item> getAll();
    Optional<Item> get(int id);

    Optional<Item> find(int id);

    void demoHibernate1stLevelCache();
}
