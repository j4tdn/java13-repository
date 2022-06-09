package com.persistence.view;

import com.persistence.persistence.ItemDetail;
import com.persistence.service.ItemDetailService;
import com.persistence.service.ItemDetailServiceImpl;

import java.util.List;

public class ItemDetailView {
    private static ItemDetailService itemDetailService;

    static {
        itemDetailService = new ItemDetailServiceImpl();
    }

    public static void main(String[] args) {
        System.out.println("\n====== Câu 4 ==========\n");
        System.out.println("Mặt hàng có giá bán cao nhất của mỗi loại hàng: ");
        List<ItemDetail> highestPriceItemsByIG = itemDetailService.getHighestPriceItemsByItemGroup();
        highestPriceItemsByIG.forEach(System.out::println);
    }
}
