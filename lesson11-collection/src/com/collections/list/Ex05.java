package com.collections.list;

import java.util.ArrayList;
import java.util.List;

import bean.Item;

public class Ex05 {
	
	private static Item item;
	
	static {
		item = new Item(1, 1, "Store1 - Item 1", 120);
	}
	
	public static void main(String[] args) {
		List<Item> items = getItems();
		// B1: Duyệt các phần tử trong items
		// 	   Kiểm tra nếu có phần tử nào trong items mà "EQUALS" với item
		//	   >> G�?i hàm equals
		//		  "Mặc định" hàm equals >> so sánh địa chỉ(giá trị ở stack)
		//		  Cần phải Override lại hàm "EQUALS" trong class Item để kiểm tra contains theo 
		//		  return TRUE
		//		  Ngược lại
		//		  return FALSE
		System.out.println("Is exist ?: " + items.contains(item));
		items.remove(item); // need to override equals method
		System.out.println("====================================");
		printf(items);
		
		//System.out.println("====================================");
		//Ex01 ex01 = new Ex01();
		//System.out.println(item.equals(ex01);
	}
	
	private static List<Item> getItems() {
		List<Item> items = new ArrayList<>();
		items.add(new Item(1, 1, "Store1 - Item 1", 120));
		items.add(new Item(1, 2, "Store1 - Item 2", 260));
		items.add(new Item(1, 3, "Store1 - Item 3", 170));
		items.add(new Item(2, 3, "Store2 - Item 3", 110));
		items.add(new Item(2, 4, "Store2 - Item 4", 90));
		items.add(new Item(3, 5, "Store3 - Item 5", 120));
		items.add(new Item(3, 6, "Store3 - Item 6", 290));
		return items;
	}
	
	private static void printf(List<Item> items) {
		for (Item item : items) {
			System.out.println(item);
		}
	}
}	
