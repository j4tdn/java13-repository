package com.persistence.dao;

import com.persistence.persistence.ItemGroup;
import org.hibernate.query.Query;

import java.util.List;

public class HibernateItemGroupDaoImpl extends AbstractHibernateDao implements ItemGroupDao {
    // Option 1: Using native query -> crateNativeQuery
//    private static final String Q_SELECT_ITEM_GROUPS = "SELECT * FROM `loaihang`";

    // Option 2: Java Persistence Query Language (JPQL, HQL) -> createQuery
    private static final String Q_SELECT_ITEM_GROUPS = "SELECT ig FROM ItemGroup ig";

    // Option 3: @NameQueries, @NameQuery -> createNameQuery

    //Option 1
//    @Override
//    public List<ItemGroup> getAll() {
//        NativeQuery<ItemGroup> itemGroupNativeQuery = openSession()
//                .createNativeQuery(Q_SELECT_ITEM_GROUPS, ItemGroup.class);
//        return itemGroupNativeQuery.getResultList();
//    }

    //Option 2
    @Override
    public List<ItemGroup> getAll() {
        Query<ItemGroup> groupQuery = openSession().createQuery(Q_SELECT_ITEM_GROUPS, ItemGroup.class);
        return groupQuery.setMaxResults(6).getResultList();
    }

    //Option 3
//    @Override
//    public List<ItemGroup> getAll() {
//        Query<ItemGroup> groupQuery = openSession().createNamedQuery(ItemGroup.Q_SELECT_ALL, ItemGroup.class);
//        return groupQuery.setMaxResults(6).getResultList();
//    }
}
