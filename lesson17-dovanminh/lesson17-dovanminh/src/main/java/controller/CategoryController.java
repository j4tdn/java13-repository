package controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import dao.CategoryDao;
import persistence.CategoryDto;
import persistence.ItemDto;
import persistence.OrderDto;

public class CategoryController {
	public static CategoryDao categoryDao = new CategoryDao();
	
	public List<CategoryDto> getInventory(){
		return categoryDao.getInventory();
	}

	public List<String> getTopItemByYear(String year) {
		// TODO Auto-generated method stub
		return categoryDao.getTopItemByYear(year);
	}
	
	public List<ItemDto> getItemDtos() {
		return categoryDao.getItemDtos();
	}
	
	public List<OrderDto> getOrderByTime(LocalDate date){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String dateString = date.format(formatter);
		return categoryDao.getOrderByTime(dateString);
	}
}
