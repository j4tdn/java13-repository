package com.persistence.view;

import com.persistence.persistence.Item;
import com.persistence.persistence.ItemGroup;
import com.persistence.persistence.ItemGroupDto;
import com.persistence.service.ItemGroupService;
import com.persistence.service.ItemGroupServiceImpl;
import com.persistence.service.ItemService;
import com.persistence.service.ItemServiceImpl;

import java.util.List;
import java.util.Scanner;

public class ItemGroupView {
    private static ItemGroupService itemGroupService;
    private static Scanner sc = new Scanner(System.in);
    static {
        itemGroupService = new ItemGroupServiceImpl();
    }

    public static void main(String[] args) {
//        List<ItemGroup> itemGroups =itemGroupService.getAll();
//        itemGroups.forEach(System.out::println);

//        ItemGroup itemGroupsByID = itemGroupService.getItemGroups(1);
//        System.out.println(itemGroupsByID);
//
//        int saved = itemGroupService.save(new ItemGroup(999,"Loại Hàng 999"));
//        System.out.println("is insert success: " + (saved!=-1));


//        ItemGroup itemGroup = new ItemGroup(999, "Mắt Kính");
//        int updated = itemGroupService.update(itemGroup);
//        System.out.println("is update success: " + (updated!=-1));


//        System.out.print("Nhap ten loai hang: ");
//        String tenLH = sc.nextLine();
//        ItemGroup itemGroup = itemGroupService.getItemGroup(tenLH);
//        System.out.println(itemGroup);

        List<ItemGroupDto> itemGroupDtoList = itemGroupService.getItemsByItemGroup();
        itemGroupDtoList.forEach(System.out::println);
    }
}
