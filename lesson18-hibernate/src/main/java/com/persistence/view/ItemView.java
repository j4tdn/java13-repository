package com.persistence.view;

import com.persistence.persistence.Item;
import com.persistence.service.ItemService;
import com.persistence.service.ItemServiceImpl;

import java.util.List;

public class ItemView {
    private static ItemService itemService;
    static{
        itemService = new ItemServiceImpl();
    }
    public static void main(String[] args) {
        System.out.println("GET ALL ITEMS: ");
        List<Item> items = itemService.getAll();
        items.forEach(System.out::println);
    }
}
