package com.persistence.service;

import com.persistence.dao.ItemGroupDao;
import com.persistence.dao.JdbcItemGroupDao;
import com.persistence.persistence.ItemGroup;
import com.persistence.persistence.ItemGroupDto;

import java.util.List;

public class ItemGroupServiceImpl implements ItemGroupService {
    private ItemGroupDao itemGroupDao;

    public ItemGroupServiceImpl() {
        itemGroupDao = new JdbcItemGroupDao();
    }

    @Override
    public List<ItemGroup> getAll() {
        return itemGroupDao.getAll();
    }

    @Override
    public ItemGroup getItemGroup(int id) {
        return itemGroupDao.getItemGroup(id);
    }

    @Override
    public int save(ItemGroup itemGroup) {
        return itemGroupDao.save(itemGroup);
    }

    @Override
    public int[] save(List<ItemGroup> itemGroups) {
        return itemGroupDao.save(itemGroups);
    }

    @Override
    public int update(ItemGroup itemGroup) {
        return itemGroupDao.update(itemGroup);
    }

    @Override
    public ItemGroup getItemGroup(String name) {
        return itemGroupDao.getItemGroup(name);
    }

    @Override
    public List<ItemGroupDto> getItemsByItemGroup() {
        return itemGroupDao.getItemsByItemGroup();
    }
}
