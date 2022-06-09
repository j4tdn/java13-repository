package com.persistence.view;

import com.persistence.persistence.ItemDto;
import com.persistence.service.ItemService;
import com.persistence.service.ItemServiceImpl;

import java.time.LocalDate;
import java.util.List;

public class ItemView {
    private static ItemService itemService;

    static {
        itemService = new ItemServiceImpl();
    }

    public static void main(String[] args) {
        System.out.println("\n====== Câu 1 ==========\n");
        LocalDate localDate = LocalDate.of(2020, 12, 18);
        System.out.println("*** Danh sách mặt hàng được bán vào ngày " + localDate.toString());
        List<ItemDto> itemDtoList = itemService.getItemsByOrderingDate(localDate);
        itemDtoList.forEach(System.out::println);

        System.out.println("\n====== Câu 2 ==========\n");
        int year = 2020;
        System.out.println("*** Top 3 mặt hàng được bán nhiều nhất năm " + year);
        List<String> itemList = itemService.getBestSellingItems(year);
        itemList.forEach(System.out::println);


    }
}
