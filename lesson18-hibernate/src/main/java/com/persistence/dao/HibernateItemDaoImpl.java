package com.persistence.dao;

import com.persistence.persistence.Item;

import java.util.List;

public class HibernateItemDaoImpl extends AbstractHibernateDao implements ItemDao{
    private static final String Q_GET_ALL_ITEMS = "SELECT * FROM `mathang`";
    @Override
    public List<Item> getAll() {
        return openSession().createNativeQuery(Q_GET_ALL_ITEMS, Item.class).getResultList();
    }
}
