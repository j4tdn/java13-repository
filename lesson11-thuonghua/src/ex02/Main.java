package ex02;

import java.util.ArrayList;
import static java.util.Comparator.*;
import java.util.List;


public class Main {
	public static void main(String[] args) {
		List<StoreCD> newList = getCD();
		List<StoreCD> list = Utils.addCD(newList , new StoreCD(6, "CD-R", "BichPhuong", 7, 13000));
		System.out.println(list.size());
		System.out.println("==============");
		System.out.println(Utils.sizeListCD(newList));
		System.out.println("==============");
		System.out.println(Utils.sumPriceCD(newList));
		System.out.println("==============");
		System.out.println(Utils.sort(newList, comparing(StoreCD::getPrice).reversed()));
		System.out.println("==============");
		System.out.println(Utils.sort(newList, comparing(StoreCD::getId)));
	}

	private static List<StoreCD> getCD() {
		List<StoreCD> cd = new ArrayList<>();
		cd.add(new StoreCD(1, "CD-R", "BigBang", 10, 20000));
		cd.add(new StoreCD(2, "CD-RW", "PhanManhQuynh", 5, 10000));
		cd.add(new StoreCD(3, "VCD", "Lisa", 4, 15000));
		cd.add(new StoreCD(4, "Mini-CD", "Den", 9, 24000));
		cd.add(new StoreCD(5, "DVD", "KhacViet", 13, 26000));
		cd.add(new StoreCD(6, "CD-R", "BichPhuong", 7, 13000));
		
		return cd;
	}
	
}
