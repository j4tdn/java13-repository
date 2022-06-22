package dao;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.hibernate.Cache;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import persistence.ItemGroup;
import persistence.ItemGroupDto;

public class HibernateItemGroupDao extends AbstractHibernateDao implements ItemGroupDao{

	// Option 1: Using native query --> createNativeQuery
	// private static final String Q_SELECT_ITEM_GROUPS = "SELECT * FROM LoaiHang";
	
	// Option 2: Java Persistence Query Language (JPQL, HQL) --> createQuery
	// private static final String Q_SELECT_ITEM_GROUPS = "SELECT ig FROM ItemGroup ig";
	
	// Option 3: NamedQueries, @NamedQuery --> createNamedQuery
	
	private static String Q_SELECT_ITEMS_BY_IGROUP = 
			"SELECT mh.MaLH  AS " + ItemGroupDto.ITEM_GROUP_ID   + ",\n" 
			+ "     lh.TenLH AS " + ItemGroupDto.ITEM_GROUP_NAME + ",\n"
		    + "     GROUP_CONCAT(CONCAT(mh.TenMH, ' - ', ctmh.MaKC, ' - ', ctmh.SoLuong)) AS " + ItemGroupDto.ITEMS + ",\n" 
			+ "		SUM(ctmh.SoLuong) AS " + ItemGroupDto.TOTAL_OF_ITEMS + "\n"
			+ " FROM MatHang mh\n"
			+ " JOIN LoaiHang lh\n" 
			+ "		ON mh.MaLH = lh.MaLH\n"
			+ " JOIN ChiTietMatHang ctmh\n"
			+ "     ON mh.MaMH = ctmh.MaMH\n"
			+ "	GROUP BY mh.MaLH;";
	
	/* Option 1
	public List<ItemGroup> getAll() {
		// Auto Mapping
		// Require: ItemGroup is an Entity and mapping with correct LoaiHang's columns table
		NativeQuery<ItemGroup> nativeQuery = openSession()
				.createNativeQuery(Q_SELECT_ITEM_GROUPS, ItemGroup.class);
		return nativeQuery.getResultList();
	}
	*/
	
	/* Option 2
	public List<ItemGroup> getAll() {
		Query<ItemGroup> query = openSession().createQuery(Q_SELECT_ITEM_GROUPS, ItemGroup.class);
		return query
				// .setParameter("p_id", 5)
				.setMaxResults(6)
				.getResultList();
	}
	*/
	
	// Option 3
	public List<ItemGroup> getAll() {
		Query<ItemGroup> query = openSession().createNamedQuery(ItemGroup.Q_SELECT_ALL, ItemGroup.class);
		return query.setMaxResults(8).getResultList();
	}
	
	@Override
	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<ItemGroupDto> getItemsByItemGroup() {
		// igId, igName, items, totalOfItems ==> resource mapping
		return openSession().createNativeQuery(Q_SELECT_ITEMS_BY_IGROUP)
				.addScalar(ItemGroupDto.ITEM_GROUP_ID, IntegerType.INSTANCE) // itemGroupDto.setIgId(rs.getInt("igId"))
				.addScalar(ItemGroupDto.ITEM_GROUP_NAME, StringType.INSTANCE)
				.addScalar(ItemGroupDto.ITEMS, StringType.INSTANCE)
				.addScalar(ItemGroupDto.TOTAL_OF_ITEMS, IntegerType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class))
				.getResultList();
	}
	
	@Override
	public void secondLevelCache() {
		Session session1 = openSession(); // group 1, 2
		Session session2 = openSession();
		
		// group 1 --> query
		ItemGroup group1 = session1.get(ItemGroup.class, 1);
		System.out.println(">>>>>> group1: " + group1);
		
		// timeToIdleSeconds --> 3s
				
		// group 2 --> query
		ItemGroup group2 = session1.get(ItemGroup.class, 2);
		System.out.println(">>>>>> group2: " + group2);
		
		doTask(1);
		
		// clear second level region(entity) cache
		// clearRegCache(ItemGroup.class);
		
		// group 1 --> session1(1st), session2(2nd), after timeToIdleSeconds --> getFromDatabase
		ItemGroup group1Session2 = session2.get(ItemGroup.class, 1);
		System.out.println(">>>>>> group1Session2: " + group1Session2);
		
		doTask(5);
	}
	
	private static void doTask(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
