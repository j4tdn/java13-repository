package dao;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;

import persistence.Item;

public class HibernateItemDao extends AbstractHibernateDao implements ItemDao{

	private static final String Q_GET_ALL_ITEM = "SELECT * FROM MatHang";
	
	// private static final String Q_GET_ITEM = "SELECT * FROM MatHang WHERE MaMH = :p_id";
	
	private static final String Q_GET_ITEM = "SELECT it FROM Item it WHERE it.id = :p_id";
	
	@Override
	public List<Item> getAll() {
		return openSession().createNativeQuery(Q_GET_ALL_ITEM, Item.class).getResultList();
	}
	
	@Override
	public Optional<Item> get(int id) {
		// using getSingleResult --> throw EntityNotFoundException
		// >>> try/catch
		// >>> unique result --> return null
		return Optional.ofNullable(openSession()
				//.createNativeQuery(Q_GET_ITEM, Item.class)
				.createQuery(Q_GET_ITEM, Item.class)
				.setParameter("p_id", id)
				.uniqueResult());
	}
	
	@Override
	public Optional<Item> find(int id) {
		// using session#get(id)
		return Optional.ofNullable(openSession().get(Item.class, id));
	}
	
	@Override
	public void firstLevelCache() {
		// store in session scope
		Session session = openSession();
		Session anotherSession = openSession();
		
		// item 1 --> query
		Item item1 = session.get(Item.class, 1);
		System.out.println(">>>>>> item1: " + item1);
		
		// item 2 --> query
		Item item2 = session.get(Item.class, 2);
		System.out.println(">>>>>> item2: " + item2);
		
		// session.clear(); // clear all loaded instance in session's cache
		session.evict(item2); // clear item2 in session's cache
		
		// item 1 --> session, cache
		Item itemF1 = session.get(Item.class, 1);
		System.out.println(">>>>>> itemF1: " + itemF1);
		
		// item 2 --> anotherSession, query
		Item itemF2 = anotherSession.get(Item.class, 2);
		System.out.println(">>>>>> itemF2: " + itemF2);
		
		// item 3 --> query
		Item item3 = session.get(Item.class, 3);
		System.out.println(">>>>>> item3: " + item3);
	}

}
