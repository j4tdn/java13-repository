package service.ex02;

import java.util.List;

import persistence.ItemGroupDto;

public interface ItemGroupService {
	List<ItemGroupDto> getItemByItemGroup();
}
