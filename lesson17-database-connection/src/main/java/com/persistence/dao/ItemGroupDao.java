package com.persistence.dao;

import com.persistence.persistence.ItemGroup;

import java.util.List;

public interface ItemGroupDao {
    List<ItemGroup> getAll();
    ItemGroup getItemGroups(int id);
    int save(ItemGroup itemGroup);
}
