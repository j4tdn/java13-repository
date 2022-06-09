package com.persistence.dao;

import com.persistence.persistence.ItemDto;

import java.time.LocalDate;
import java.util.List;

public interface ItemDao {
    List<ItemDto> getItemsByOrderingDate(LocalDate ld);

    List<String> getBestSellingItems(int year);


}
