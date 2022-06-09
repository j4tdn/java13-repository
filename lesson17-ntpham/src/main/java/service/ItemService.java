package service;

import java.time.LocalDate;
import java.util.List;

import persistence.HighestPriceItemDto;
import persistence.ItemCountDto;
import persistence.ItemDto;

public interface ItemService {
	List<ItemDto> get(LocalDate saleDate);
	List<ItemCountDto> count(String year);
	List<HighestPriceItemDto> getHighestPriceItem();
}
