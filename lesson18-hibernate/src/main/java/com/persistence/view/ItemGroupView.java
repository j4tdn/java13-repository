package com.persistence.view;

import com.persistence.persistence.ItemGroup;
import com.persistence.service.ItemGroupService;
import com.persistence.service.ItemGroupServiceImpl;

import java.util.List;

public class ItemGroupView {
    private static ItemGroupService itemGroupService;

    static {
        itemGroupService = new ItemGroupServiceImpl();
    }

    public static void main(String[] args) {
        System.out.println("GET ALL ITEM GROUPS: ");
        List<ItemGroup> itemGroupList = itemGroupService.getAll();
        itemGroupList.forEach(System.out::println);

    }
}
