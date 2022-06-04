package service;

import java.util.List;

import dao.ItemGroupDao;
import dao.JdbcItemGroupDao;
import persistence.ItemGroup;
import persistence.ItemGroupDto;

public class ItemGroupServiceImpl implements ItemGroupService {

	private ItemGroupDao itemGroupDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new JdbcItemGroupDao();
	}
	
	@Override
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}
	
	@Override
	public ItemGroup getItemGroup(int id) {
		return itemGroupDao.getItemGroup(id);
	}
	
	@Override
	public int save(ItemGroup itemGroup) {
		return itemGroupDao.save(itemGroup);
	}
	
	@Override
	public int[] save(List<ItemGroup> itemGroups) {
		return itemGroupDao.save(itemGroups);
	}
	
	@Override
	public int update(ItemGroup itemGroup) {
		
		return itemGroupDao.update(itemGroup);
	}
	
	public ItemGroup getItemGroup(String name) {
		return itemGroupDao.getItemGroup(name);
	}
	
	@Override
	public List<ItemGroupDto> getItemsByItemGroup() {
		
		return itemGroupDao.getItemsByItemGroup();
	}
}
