package com.persistence.dao;

import com.persistence.persistence.ItemDetail;

import java.util.List;

public interface ItemDetailDao {
    List<ItemDetail> getHighestPriceItemsByItemGroup();
}
