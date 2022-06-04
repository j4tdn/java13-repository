package service;

import java.sql.Date;
import java.util.List;

import dao.ItemGroupDao;
import persistence.Item;
import persistence.ItemGroup;


public class ItemGroupService {

	private ItemGroupDao itemGroupDao;

	public ItemGroupService() {
		itemGroupDao = new ItemGroupDao();
	}

	public List<Item> items(Date date) {
		return itemGroupDao.getItems(date);

	}

	public List<ItemGroup> itemGroups() {
		return itemGroupDao.getItemsAmount();
	}
} 