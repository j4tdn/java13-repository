package com.persistence.service;

import com.persistence.persistence.ItemGroup;
import com.persistence.persistence.ItemGroupDto;

import java.util.List;

public interface ItemGroupService {
    List<ItemGroup> getAll();
    List<ItemGroupDto> getItemsByItemGroup();
    void secondLevelCache();
}
