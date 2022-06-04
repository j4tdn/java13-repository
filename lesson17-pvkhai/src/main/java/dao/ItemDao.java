package dao;

import java.time.LocalDate;
import java.util.List;

import persistence.ItemDetailDto;
import persistence.ItemDto;
import persistence.NumberItemDto;

public interface ItemDao {
	List<ItemDto> getItem(LocalDate date);
	
	List<ItemDetailDto> getItemDetail();
	
	List<NumberItemDto> getNumberItemDto();
	
	List<String> getItemMax(int year);
	
}
