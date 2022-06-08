package com.persistence.service;

import com.persistence.persistence.ItemGroup;
import com.persistence.persistence.ItemGroupDto;

import java.util.List;

public interface ItemGroupService {
    List<ItemGroup> getAll();

    ItemGroup getItemGroup(int id);

    ItemGroup getItemGroup(String name);

    int save(ItemGroup itemGroup);

    int[] save(List<ItemGroup> itemGroups);

    int update(ItemGroup itemGroup);

    List<ItemGroupDto> getItemsByItemGroup();

}
