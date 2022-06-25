package com.persistence.dao;

import com.persistence.persistence.ItemGroup;
import com.persistence.persistence.ItemGroupDto;

import java.util.List;

public interface ItemGroupDao {
    List<ItemGroup> getAll();
    List<ItemGroupDto> getItemsByItemGroup();
    boolean save(List<ItemGroup> itemGroups);

    void secondLevelCache();
}
