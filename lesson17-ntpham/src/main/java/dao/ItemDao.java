package dao;

import java.time.LocalDate;
import java.util.List;

import persistence.HighestPriceItemDto;
import persistence.ItemCountDto;
import persistence.ItemDto;

public interface ItemDao {
	List<ItemDto> get(LocalDate date);
	
	List<ItemCountDto> count(String year);
	
	List<HighestPriceItemDto> getHighestPriceItem();
}
