package service;

import java.time.LocalDate;
import java.util.List;

import persistence.ItemDetailDto;
import persistence.ItemDto;
import persistence.NumberItemDto;

public interface ItemDtoService {
	//1
	List<ItemDto> getItem(LocalDate date);
	//4
	List<ItemDetailDto> getItemDetail();
	//2
	List<NumberItemDto> getNumberItemDto();
	//3
	List<String> getItemMax(int year);
}
