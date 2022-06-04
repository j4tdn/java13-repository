package service;

import java.util.List;

import persistence.ItemGroup;
import persistence.ItemGroupDto;

public interface ItemGroupService {
	List<ItemGroup> getAllByItemGroup();
	List<ItemGroupDto> getItemByItemGroup();
}
