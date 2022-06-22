package com.persistence.service;

import com.persistence.dao.HibernateItemGroupDaoImpl;
import com.persistence.dao.ItemGroupDao;
import com.persistence.persistence.ItemGroup;
import com.persistence.persistence.ItemGroupDto;

import java.util.List;

public class ItemGroupServiceImpl implements ItemGroupService {
    private ItemGroupDao itemGroupDao;

    public ItemGroupServiceImpl() {
        itemGroupDao = new HibernateItemGroupDaoImpl();
    }

    @Override
    public List<ItemGroup> getAll() {
        return itemGroupDao.getAll();
    }

    @Override
    public List<ItemGroupDto> getItemsByItemGroup() {
        return itemGroupDao.getItemsByItemGroup();
    }

    @Override
    public void secondLevelCache() {
        itemGroupDao.secondLevelCache();
    }
}
