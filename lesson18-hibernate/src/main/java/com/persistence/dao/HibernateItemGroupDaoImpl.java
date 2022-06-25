package com.persistence.dao;

import com.persistence.persistence.Item;
import com.persistence.persistence.ItemGroup;
import com.persistence.persistence.ItemGroupDto;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HibernateItemGroupDaoImpl extends AbstractHibernateDao implements ItemGroupDao {
    // Option 1: Using native query -> crateNativeQuery
//    private static final String Q_SELECT_ITEM_GROUPS = "SELECT * FROM `loaihang`";

    // Option 2: Java Persistence Query Language (JPQL, HQL) -> createQuery
    private static Session session;
    private static final String Q_SELECT_ITEM_GROUPS = "SELECT ig FROM ItemGroup ig";
    private static final String Q_SELECT_ITEMS_BY_GROUP =
            "SELECT mh.MaLH AS "+ItemGroupDto.ITEM_GROUP_ID+",\n"
                    + "     lh.TenLH AS " + ItemGroupDto.ITEM_GROUP_NAME + ",\n"
                    + "     GROUP_CONCAT(CONCAT(mh.TenMH, ' - ', ctmh.MaKC, ' - ', ctmh.SoLuong)) AS " +ItemGroupDto.ITEMS+ "  ,\n"
                    + "		SUM(ctmh.SoLuong) AS "+ItemGroupDto.TOTAL_OF_ITEMS+"\n"
                    + " FROM MatHang mh\n"
                    + " JOIN LoaiHang lh\n"
                    + "		ON mh.MaLH = lh.MaLH\n"
                    + " JOIN ChiTietMatHang ctmh\n"
                    + "     ON mh.MaMH = ctmh.MaMH\n"
                    + "	GROUP BY mh.MaLH;";
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


    @Override
    public List<ItemGroupDto> getItemsByItemGroup() {
        return openSession().createNativeQuery(Q_SELECT_ITEMS_BY_GROUP)
                .addScalar(ItemGroupDto.ITEM_GROUP_ID, IntegerType.INSTANCE)
                .addScalar(ItemGroupDto.ITEM_GROUP_NAME, StringType.INSTANCE)
                .addScalar(ItemGroupDto.ITEMS, StringType.INSTANCE)
                .addScalar(ItemGroupDto.TOTAL_OF_ITEMS, IntegerType.INSTANCE)
                .setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class)).getResultList();
    }

    @Override
    public void secondLevelCache() {
        Session session1 = openSession();
        Session session2 = openSession();
//        itemgroup 1 -> query
        ItemGroup group1 = session1.get(ItemGroup.class, 1);
        System.out.println(">>> ItemGroup 1: " + group1);

        ItemGroup group1_1 = session1.get(ItemGroup.class, 1);
        System.out.println(">>> ItemGroup 1_1: " + group1_1);

//        itemgroup 2 -> query
        ItemGroup group2 = session1.get(ItemGroup.class, 2);
        System.out.println(">>> ItemGroup 2: " + group2);
        doTask(5);
//        clear second level region(entity) cache
//        clearRegCache(ItemGroup.class);

        ItemGroup group1Session2 = session2.get(ItemGroup.class, 1);
        System.out.println(">>>> ItemGroup 1 (Session 2):" + group1Session2);
//        doTask(5);
    }
    private static void doTask(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean save(List<ItemGroup> itemGroups) {
        boolean isSuccess = false;
        session = openSession();
        Transaction transaction = session.beginTransaction();
        try{
            for(ItemGroup itemGroup: itemGroups){
                session.save(itemGroup);
            }
            transaction.commit();
            isSuccess = true;
        }
        catch (Exception ex){
            ex.printStackTrace();
            transaction.rollback();
        }
        finally {
            session.close();
        }
        return isSuccess;
    }
}
