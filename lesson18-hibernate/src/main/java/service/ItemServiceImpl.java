package service;

import java.util.List;
import java.util.Optional;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.Item;

public class ItemServiceImpl implements ItemService {

	private ItemDao itemDao;

	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
	}

	@Override
	public List<Item> getAll() {
		return itemDao.getAll();
	}
	
	@Override
	public Optional<Item> get(int id) {
		return itemDao.find(id);
	}
	
	@Override
	public void demoHibernate1stLevelCache() {
		itemDao.firstLevelCache();
	}

}
