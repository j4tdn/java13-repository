package ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Collections;

public class Utils {
	private static List<StoreCD> listCD = new ArrayList<>();

	private Utils() {
	}

	public static List<StoreCD> addCD(List<StoreCD> list, StoreCD cd) {
		Objects.requireNonNull(cd);
		for(StoreCD cd2 : list) {
			if(cd2.getId() == cd.getId()) {
				throw new IndexOutOfBoundsException("Duplicate Id");
			}
		}
		list.add(cd);
			return list;
	}
	
	public static int sizeListCD(List<StoreCD> list){
		return list.size();
	}
	
	public static float sumPriceCD(List<StoreCD> list) {
		float sum = 0;
		for(StoreCD storeCD : list) {
			sum += storeCD.getPrice();
		}
		
		return sum;
	}
	
	public static List<StoreCD> sort(List<StoreCD> list, Comparator<StoreCD> comparator){
		list.sort(comparator);
		return list;
	}
	

	
	
}
