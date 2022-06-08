package com.persistence.view;

import com.persistence.service.ItemDetailService;
import com.persistence.service.ItemDetailServiceImpl;

public class ItemDetailView {
    private static ItemDetailService itemDetailService;

    static {
        itemDetailService = new ItemDetailServiceImpl();
    }

    public static void main(String[] args) {
        System.out.println("Update successfully: " + itemDetailService.update());
    }
}
