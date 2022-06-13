package com.persistence.dao;

import com.persistence.persistence.ItemGroup;
import org.hibernate.query.NativeQuery;

import java.util.List;

public class HibernateItemGroupDaoImpl extends AbstractHibernateDao implements ItemGroupDao {
    private static final String Q_SELECT_ITEM_GROUPS = "SELECT * FROM `loaihang`";

    @Override
    public List<ItemGroup> getAll() {
        NativeQuery<ItemGroup> itemGroupNativeQuery = openSession()
                .createNativeQuery(Q_SELECT_ITEM_GROUPS, ItemGroup.class);
        return itemGroupNativeQuery.getResultList();
    }
}
