package com.persistence.service;

import com.persistence.dao.ItemGroupDao;
import com.persistence.dao.JdbcItemGroupImpl;
import com.persistence.persistence.ItemGroupDto;

import java.util.List;

public class ItemGroupServiceImpl implements ItemGroupService {
    private static ItemGroupDao itemGroupDao;

    public ItemGroupServiceImpl() {
        itemGroupDao = new JdbcItemGroupImpl();
    }

    @Override
    public List<ItemGroupDto> getItemsByItemGroup() {
        return itemGroupDao.getItemsByItemGroup();
    }
}
