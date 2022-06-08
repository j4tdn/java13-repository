package com.persistence.service;

import com.persistence.dao.ItemDetailDao;
import com.persistence.dao.ItemDetailDaoImpl;

public class ItemDetailServiceImpl implements ItemDetailService {
    private static ItemDetailDao itemDetailDao;

    public ItemDetailServiceImpl() {
        itemDetailDao = new ItemDetailDaoImpl();
    }

    @Override
    public boolean update() {
        return itemDetailDao.update();
    }
}
