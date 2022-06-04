package service;

import java.util.List;

import persistence.ItemGroup;
import persistence.ItemGroupDto;

public interface ItemGroupService {
	List<ItemGroup> getAll();
	ItemGroup getItemGroup(int id);
	int save(ItemGroup itemGroup);
	int[] save(List<ItemGroup> itemGroups);
	int update(ItemGroup itemGroup);
	ItemGroup getItemGroup(String name);
	List<ItemGroupDto> getItemsByItemGroup();
}
