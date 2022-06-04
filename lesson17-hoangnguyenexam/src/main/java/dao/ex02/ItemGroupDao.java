package dao.ex02;

import java.util.List;

import persistence.ItemGroupDto;

public interface ItemGroupDao {
	List<ItemGroupDto> getItemByItemGroup();
}
