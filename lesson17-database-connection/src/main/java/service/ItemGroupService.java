package service;

import java.util.List;
import persistence.ItemGroup;
import persistence.ItemGroupDto;

public interface ItemGroupService {
	List<ItemGroup> getAll();
	
	ItemGroup get(int id);
	
	ItemGroup get(String name);
	
	int save(ItemGroup itemGroup);
	
	int[] save(List<ItemGroup> itemGroups);
	
	int update(ItemGroup itemGroup);
	
	List<ItemGroupDto> getItemsByItemGroup();
}
