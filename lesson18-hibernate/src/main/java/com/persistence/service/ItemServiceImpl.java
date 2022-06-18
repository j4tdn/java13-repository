package com.persistence.service;

import com.persistence.dao.HibernateItemDaoImpl;
import com.persistence.dao.ItemDao;
import com.persistence.persistence.Item;

import java.util.List;
import java.util.Optional;

public class ItemServiceImpl implements ItemService{
    private static ItemDao itemDao;
    public ItemServiceImpl(){
        itemDao = new HibernateItemDaoImpl();
    }
    @Override
    public List<Item> getAll() {
        return itemDao.getAll();
    }

    @Override
    public Optional<Item> get(int id) {
        return itemDao.get(id);
    }

    @Override
    public Optional<Item> find(int id) {
        return itemDao.find(id);
    }

    @Override
    public void demoHibernate1stLevelCache() {
        itemDao.firstLevelCache();
    }
}
