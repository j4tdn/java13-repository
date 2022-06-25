package com.persistence.view;

import com.persistence.persistence.Item;
import com.persistence.persistence.ItemSizeRelation;
import com.persistence.persistence.Size;
import com.persistence.service.ItemService;
import com.persistence.service.ItemServiceImpl;

import java.util.List;
import java.util.Optional;

public class ItemView {
    private static ItemService itemService;
    static{
        itemService = new ItemServiceImpl();
    }
    public static void main(String[] args) {
//        System.out.println("GET ALL ITEMS: ");
//        List<Item> items = itemService.getAll();
////        items.forEach(System.out::println);
//        Item item = items.get(1);
//        System.out.println(item);
//        List<ItemSizeRelation> sizes = item.getSizes();
//        sizes.forEach(size -> System.out.println(size.getSize()));

        System.out.println("===========================");
        System.out.println("GET ITEM BY ID: ");
        Optional<Item> item = itemService.find(1);
        if (item.isPresent()){
            System.out.println(item.get());
        }

        System.out.println("===========================");
        itemService.demoHibernate1stLevelCache();
    }
}
