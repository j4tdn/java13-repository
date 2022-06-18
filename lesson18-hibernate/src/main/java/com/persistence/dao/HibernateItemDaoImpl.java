package com.persistence.dao;

import com.persistence.persistence.Item;
import org.hibernate.Session;

import java.util.List;
import java.util.Optional;

public class HibernateItemDaoImpl extends AbstractHibernateDao implements ItemDao{
    private static final String Q_GET_ALL_ITEMS = "SELECT * FROM `mathang`";

    private static final String Q_GET_ITEM = "SELECT * FROM `mathang` WHERE MaMH = :p_id";

    private static final String Q_GET_ITEM_JPA = "SELECT it FROM Item it WHERE id = :p_id";
    @Override
    public List<Item> getAll() {
        return openSession().createNativeQuery(Q_GET_ALL_ITEMS, Item.class).getResultList();
    }

    @Override
    public Optional<Item> get(int id) {
        // getSingleResult() -> throw Exception ->
        // uniqueResult() -> return null
        return Optional.ofNullable(openSession().createQuery(Q_GET_ITEM_JPA, Item.class).
                setParameter("p_id", id)
                .uniqueResult());
    }

    @Override
    public Optional<Item> find(int id) {
        return Optional.ofNullable(openSession().get(Item.class, id));
    }

    @Override
    public void firstLevelCache() {
        Session session = openSession();

//        item 1 -> query
        Item item1 = session.get(Item.class, 1);
        System.out.println(">>> item 1: " + item1);
//        item 2 -> query
        Item item2 = session.get(Item.class, 2);
        System.out.println(">>> item 2: " + item2);
//        session.clear()
//        sesson.evict(item2)
//        item F1 -> cache
        Item itemF1 = session.get(Item.class, 1);
        System.out.println(">>> item F1: " + itemF1);


        Item item3 = session.get(Item.class, 3);
        System.out.println(">>> item 3: " + item3);
    }

}
