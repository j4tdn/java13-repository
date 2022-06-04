package controller;

import java.util.List;

import dao.CategoryDao;
import persistence.CategoryDto;
import persistence.ItemDto;

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
}
