package com.persistence.view;

import com.persistence.dao.ItemGroupDao;
import com.persistence.data.ItemGroupData;
import com.persistence.persistence.Item;
import com.persistence.persistence.ItemGroup;
import com.persistence.persistence.ItemGroupDto;
import com.persistence.service.ItemGroupService;
import com.persistence.service.ItemGroupServiceImpl;

import java.util.List;

public class ItemGroupView {
    private static ItemGroupService itemGroupService;

    static {
        itemGroupService = new ItemGroupServiceImpl();
    }

    public static void main(String[] args) {
//        System.out.println("\n==============2nc cache====================\n");
//        itemGroupService.secondLevelCache();

//        System.out.println("GET ITEMS BY ITEM GROUP: ");
//        List<ItemGroupDto> countedItemsByGroup = itemGroupService.getItemsByItemGroup();
//        countedItemsByGroup.forEach(System.out::println);
//
//        System.out.println("\n=============================\n");
//        System.out.println("GET ALL ITEM GROUPS: ");
//        List<ItemGroup> itemGroupList = itemGroupService.getAll();
//        itemGroupList.forEach(
//                group-> {
//                    System.out.println(group);
//                    List<Item> items = group.getItems();
//                    items.forEach(System.out::println);
//                }
//        );
        System.out.println("===== Test Save Items ======");
        List<ItemGroup> itemGroups = ItemGroupData.itemgroups_data;
        boolean isSuccess = itemGroupService.save(itemGroups);
        System.out.println("Is saved successfully: " + isSuccess);
    }
}
