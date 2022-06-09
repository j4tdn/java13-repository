package com.persistence.service;

import com.persistence.persistence.ItemGroupDto;

import java.util.List;

public interface ItemGroupService {
    List<ItemGroupDto> getItemsByItemGroup();
}
