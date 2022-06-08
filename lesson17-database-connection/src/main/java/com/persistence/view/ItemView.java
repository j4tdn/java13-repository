package com.persistence.view;

import com.persistence.persistence.Item;
import com.persistence.service.ItemService;
import com.persistence.service.ItemServiceImpl;

import java.util.List;
import java.util.Scanner;

public class ItemView {
    private static ItemService itemService;

    static {
        itemService = new ItemServiceImpl();
    }

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("Tat ca mat hang: ");
//        List<Item> items =itemService.getAll();
//        items.forEach(System.out::println);

        System.out.print("Enter item group name: ");
        String name = sc.nextLine();
        System.out.println("Item of item group " + name + " are: ");
        List<Item> items = itemService.findItemsByItemGroupName(name);
        items.forEach(System.out::println);
    }
}
