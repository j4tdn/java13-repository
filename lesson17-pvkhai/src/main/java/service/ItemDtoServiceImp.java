package service;

import java.time.LocalDate;
import java.util.List;

import dao.ItemDao;
import dao.ItemDaoImp;
import persistence.ItemDetailDto;
import persistence.ItemDto;
import persistence.NumberItemDto;


public class ItemDtoServiceImp implements ItemDtoService{

	private ItemDao itemDao;
	
	public ItemDtoServiceImp() {
		itemDao = new ItemDaoImp();
	}

	@Override
	public List<ItemDto> getItem(LocalDate date) {
		return itemDao.getItem(date);
	}

	@Override
	public List<ItemDetailDto> getItemDetail() {
		return itemDao.getItemDetail();
	}

	@Override
	public List<NumberItemDto> getNumberItemDto() {
		return itemDao.getNumberItemDto();
	}

	@Override
	public List<String> getItemMax(int year) {
		return itemDao.getItemMax(year);
	}
	

	

}
