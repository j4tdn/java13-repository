package service.ex03;

import java.util.List;

import dao.ex03.ItemDao;
import dao.ex03.JdbcItemDao;

public class ItemServiceImpl implements ItemService {
	private ItemDao itemDao;

	public ItemServiceImpl() {
		itemDao = new JdbcItemDao();
	}

	@Override
	public List<String> getItemByYear(int year) {
		return itemDao.getItemByYear(year);
	}

}
