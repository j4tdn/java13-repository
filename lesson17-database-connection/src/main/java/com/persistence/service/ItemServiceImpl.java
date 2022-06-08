package com.persistence.service;

import com.persistence.dao.ItemDao;
import com.persistence.dao.JdbcItemDao;
import com.persistence.persistence.Item;

import java.util.List;
import java.util.Objects;

public class ItemServiceImpl implements ItemService {
    private ItemDao itemDao;

    public ItemServiceImpl() {
        itemDao = new JdbcItemDao();
    }

    @Override
    public List<Item> getAll() {
        return itemDao.getAll();
    }

    @Override
    public List<Item> findItemsByItemGroupName(String name) {
        Objects.requireNonNull(name, "Item group name cannot be NULL!");
        return itemDao.findItemsByItemGroupName(name);
    }
}
