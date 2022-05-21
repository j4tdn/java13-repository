package com.persistence.service;

import com.persistence.persistence.ItemGroup;

import java.util.List;

public interface ItemGroupService {
    List<ItemGroup> getAll();
    ItemGroup getItemGroups(int id);

    int save(ItemGroup itemGroup);
}
