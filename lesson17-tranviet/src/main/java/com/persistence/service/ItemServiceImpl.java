package com.persistence.service;

import com.persistence.dao.ItemDao;
import com.persistence.dao.JdbcItemDaoImpl;
import com.persistence.persistence.ItemDto;

import java.time.LocalDate;
import java.util.List;

public class ItemServiceImpl implements ItemService {
    private ItemDao itemDao;

    public ItemServiceImpl() {
        itemDao = new JdbcItemDaoImpl();
    }

    @Override
    public List<ItemDto> getItemsByOrderingDate(LocalDate ld) {
        return itemDao.getItemsByOrderingDate(ld);
    }

    @Override
    public List<String> getBestSellingItems(int year) {
        return itemDao.getBestSellingItems(year);
    }


}
