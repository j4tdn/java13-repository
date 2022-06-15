package com.persistence.service;

import com.persistence.dao.HibernateItemDaoImpl;
import com.persistence.dao.ItemDao;
import com.persistence.persistence.Item;

import java.util.List;

public class ItemServiceImpl implements ItemService{
    private static ItemDao itemDao;
    public ItemServiceImpl(){
        itemDao = new HibernateItemDaoImpl();
    }
    @Override
    public List<Item> getAll() {
        return itemDao.getAll();
    }
}
