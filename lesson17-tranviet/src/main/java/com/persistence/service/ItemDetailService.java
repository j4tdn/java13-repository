package com.persistence.service;

import com.persistence.persistence.ItemDetail;

import java.util.List;

public interface ItemDetailService {
    List<ItemDetail> getHighestPriceItemsByItemGroup();
}
