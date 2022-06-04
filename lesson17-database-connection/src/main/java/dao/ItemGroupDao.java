package dao;

import java.util.List;

import persistence.Item;
import persistence.ItemGroup;
import persistence.ItemGroupDto;

public interface ItemGroupDao {
	
	List<ItemGroup> getAll();
	
	ItemGroup getItemGroup(int id);
	
	ItemGroup getItemGroup(String name);
	
	int save(ItemGroup itemGroup);
	int[] save(List<ItemGroup> itemGroups);
	
	int update(ItemGroup itemGroup);
	
	List<ItemGroupDto> getItemsByItemGroup();
}
;