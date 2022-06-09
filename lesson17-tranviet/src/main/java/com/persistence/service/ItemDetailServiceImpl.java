package com.persistence.service;

import com.persistence.dao.ItemDetailDao;
import com.persistence.dao.JdbcItemDetailImpl;
import com.persistence.persistence.ItemDetail;

import java.util.List;

public class ItemDetailServiceImpl implements ItemDetailService {
    private ItemDetailDao itemDetailDao;

    public ItemDetailServiceImpl() {
        itemDetailDao = new JdbcItemDetailImpl();
    }

    @Override
    public List<ItemDetail> getHighestPriceItemsByItemGroup() {
        return itemDetailDao.getHighestPriceItemsByItemGroup();
    }
}
