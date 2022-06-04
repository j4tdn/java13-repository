package service;

import java.util.List;

import dao.ItemGroupDao;
import dao.JdbcItemGroupDao;
import persistence.ItemGroup;
import persistence.ItemGroupDto;

public class ItemGroupServiceImple implements ItemGroupService {
	
	private ItemGroupDao itemGroupDao;
	
	public ItemGroupServiceImple() {
		itemGroupDao = new JdbcItemGroupDao();
	}
	
	@Override
	public List<ItemGroup> getAllByItemGroup() {
		
		return itemGroupDao.getAllByItemGroup();
	}
	@Override
	public List<ItemGroupDto> getItemByItemGroup() {
		return itemGroupDao.getItemByItemGroup();
	}
}
