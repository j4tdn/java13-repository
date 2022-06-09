package com.persistence.view;

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
        System.out.println("\n====== Câu 3 ==========\n");
        System.out.println("*** Số lượng mặt hàng theo từng loại hàng: ");
        List<ItemGroupDto> itemGroupDtos = itemGroupService.getItemsByItemGroup();
        itemGroupDtos.forEach(System.out::println);
    }
}
