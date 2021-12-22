package com.collections.list;

import java.util.ArrayList;
import java.util.List;

import bean.Item;

public class Ex05 {
	private static Item item;
	static {
		item = new Item(1, 1, "Store 1 - Item 1", 120);
	}
	
	public static void main(String[] args) {
		List<Item> items = getItems();
		printf(items);
		System.out.println("\n\n==============================\n\n");
		
		//Duyệt từng phần tử kiểm tra xem có phần tử nào bằng với phần tử item không?
		
		//Vì đây là 2 đối tượng, chưa định nghĩa lại equals() nên so sánh giá trị ở stack (địa chỉ) thông qua toán tử ==
		//nên nếu muốn so sánh nội dụng cần phải định nghĩa lại equals() của lớp Object
		System.out.println("Is exist?:" + items.contains(item));
		items.remove(item); // need to override equals method
		System.out.println("======================");
		printf(items);

		System.out.println("======================");
		Ex01 ex01 = new Ex01();
		System.out.println("equals: " + item.equals(ex01));
		
		
	}
	private static void printf(List<Item> items) {
		for(Item item: items) {
			System.out.println(item);
		}
	}
	private static List<Item> getItems() {
		List<Item> items = new ArrayList<>();
		items.add(new Item(1, 1, "Store 1 - Item 1", 120));
		items.add(new Item(1, 2, "Store 1 - Item 2", 260));
		items.add(new Item(1, 3, "Store 1 - Item 3", 170));
		items.add(new Item(2, 3, "Store 2 - Item 3", 110));
		items.add(new Item(2, 4, "Store 2 - Item 4", 90));
		items.add(new Item(3, 5, "Store 3 - Item 5", 120));
		items.add(new Item(3, 6, "Store 4 - Item 6", 290));
		return items;
	}
}
