package service;

import java.util.List;

import dao.ItemDao;
import dao.JdbcItemDao;
import persistence.Item;

public class ItemServiceImple implements ItemService {
	
	private ItemDao itemDao;
	
	public ItemServiceImple() {
		itemDao = new JdbcItemDao();
	}
	
	@Override
	public List<String> getTopThreeItem() {
		return itemDao.getTopThreeItem();
	}
}
