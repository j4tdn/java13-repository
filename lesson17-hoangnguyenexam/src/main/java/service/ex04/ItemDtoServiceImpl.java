package service.ex04;

import java.util.List;

import dao.ex04.ItemDtoDao;
import dao.ex04.JdbcItemDtoDao;
import persistence.ItemDto;

public class ItemDtoServiceImpl implements ItemDtoService{
	
	private ItemDtoDao itemDtoDao;
	
	public ItemDtoServiceImpl() {
		itemDtoDao = new JdbcItemDtoDao();
	}

	@Override
	public List<ItemDto> getItems() {
		return itemDtoDao.getItems();
	}

}
