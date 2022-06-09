package com.persistence.dao;

import com.persistence.persistence.ItemGroupDto;

import java.util.List;

public interface ItemGroupDao {
    List<ItemGroupDto> getItemsByItemGroup();
}
