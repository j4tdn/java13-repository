package com.persistence.service;

import com.persistence.dao.ItemGroupDao;
import com.persistence.dao.JdbcItemGroupDao;
import com.persistence.persistence.ItemGroup;

import java.util.List;

public class ItemGroupServiceImpl implements ItemGroupService{
    private ItemGroupDao itemGroupDao;
    public ItemGroupServiceImpl(){
        itemGroupDao = new JdbcItemGroupDao();
    }
    @Override
    public List<ItemGroup> getAll() {
        return itemGroupDao.getAll();
    }

    @Override
    public ItemGroup getItemGroups(int id) {
        return itemGroupDao.getItemGroups(id);
    }

    @Override
    public int save(ItemGroup itemGroup) {
        return itemGroupDao.save(itemGroup);
    }
}
