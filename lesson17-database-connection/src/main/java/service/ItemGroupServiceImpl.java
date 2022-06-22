package service;

import java.util.List;

import dao.ItemGroupDao;
import dao.JdbcItemGroupDao;
import persistence.ItemGroup;
import persistence.ItemGroupDto;

public class ItemGroupServiceImpl implements ItemGroupService{
	
	private ItemGroupDao itemGroupDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new JdbcItemGroupDao();
	}
	
	@Override
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}
	
	@Override
	public ItemGroup get(int id) {
		return itemGroupDao.get(id);
	}
	
	@Override
	public ItemGroup get(String name) {
		return itemGroupDao.get(name);
	}
	
	@Override
	public int save(ItemGroup itemGroup) {
		return itemGroupDao.save(itemGroup);
	}
	
	@Override
	public int update(ItemGroup itemGroup) {
		return itemGroupDao.update(itemGroup);
	}
	
	@Override
	public List<ItemGroupDto> getItemsByItemGroup() {
		return itemGroupDao.getItemsByItemGroup();
	}
	
	@Override
	public int[] save(List<ItemGroup> itemGroups) {
		return itemGroupDao.save(itemGroups);
	}
}
