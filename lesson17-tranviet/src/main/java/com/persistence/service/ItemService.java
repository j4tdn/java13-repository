package com.persistence.service;

import com.persistence.persistence.ItemDto;

import java.time.LocalDate;
import java.util.List;

public interface ItemService {
    List<ItemDto> getItemsByOrderingDate(LocalDate ld);

    List<String> getBestSellingItems(int year);
}
