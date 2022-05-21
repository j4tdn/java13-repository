package com.persistence.view;

import com.persistence.dao.JdbcItemGroupDao;
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
        List<ItemGroup> itemGroups =itemGroupService.getAll();
        itemGroups.forEach(System.out::println);

//        ItemGroup itemGroupsByID = itemGroupService.getItemGroups(1);
//        System.out.println(itemGroupsByID);

//        int saved = itemGroupService.save(new ItemGroup(999,"Loại Hàng 999"));
//        System.out.println("is insert success: " + (saved!=-1));
    }
}
