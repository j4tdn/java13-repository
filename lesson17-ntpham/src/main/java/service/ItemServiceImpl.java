package service;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import dao.ItemDao;
import dao.JdbcItemDao;
import persistence.HighestPriceItemDto;
import persistence.ItemCountDto;
import persistence.ItemDto;

public class ItemServiceImpl implements ItemService{
	
	private final ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao = new JdbcItemDao();
	}

	@Override
	public List<ItemDto> get(LocalDate saleDate) {
		Objects.requireNonNull(saleDate, "Sale date cannot be NULL");
		return itemDao.get(saleDate);
	}

	@Override
	public List<ItemCountDto> count(String year) {
		Objects.requireNonNull(year, "Year cannot be NULL");
		return itemDao.count(year);
	}

	@Override
	public List<HighestPriceItemDto> getHighestPriceItem() {
		return itemDao.getHighestPriceItem();
	}
	
}
