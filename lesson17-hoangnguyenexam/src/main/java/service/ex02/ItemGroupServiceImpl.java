package service.ex02;

import java.util.List;

import dao.ex02.ItemGroupDao;
import dao.ex02.JdbcItemGroupDao;
import persistence.ItemGroupDto;

public class ItemGroupServiceImpl implements ItemGroupService{
	
	private ItemGroupDao itemGroupDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new JdbcItemGroupDao();
	}

	@Override
	public List<ItemGroupDto> getItemByItemGroup() {
		return itemGroupDao.getItemByItemGroup();
	}

}
